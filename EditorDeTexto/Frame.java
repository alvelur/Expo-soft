import java.awt.event.*;
import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.*;
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Frame extends JFrame
{
    private JButton rehacer, deshacer, guardar;
    private JTextArea documento = new JTextArea(40, 60);
    private CareTaker caretaker = new CareTaker();
    private Originator originator = new Originator();
    
    int cadenaActual=0, mementosGuardados=0;
    
    public Frame(){
        this.setSize(720, 700);
        this.setTitle("Editor de Texto");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel1 = new JPanel();
        
        panel1.add(new JLabel("Documento"));
       
        
        ButtonListener rehacerL = new ButtonListener();
        ButtonListener deshacerL = new ButtonListener();
        ButtonListener guardarL = new ButtonListener();    
        
        rehacer = new JButton("Rehacer");
        deshacer = new JButton("Deshacer");
        guardar = new JButton("Guardar");
        
        rehacer.addActionListener(rehacerL);
        deshacer.addActionListener(deshacerL);
        guardar.addActionListener(guardarL);
        
        panel1.add(documento);
        panel1.add(rehacer);
        panel1.add(deshacer);
        panel1.add(guardar);
        
        rehacer.setEnabled(false);
        deshacer.setEnabled(false);
        guardar.doClick();
        this.add(panel1);
        this.setVisible(true);
    }
    
    class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(e.getSource() == rehacer){
                if((mementosGuardados - 1) > cadenaActual){
                    cadenaActual++;
                    Memento m = caretaker.getMemento(cadenaActual);
                    originator.setMemento(m);
                    documento.setText(m.getCadena());
                    deshacer.setEnabled(true);
                } else {
                    rehacer.setEnabled(false);
                }
            } else if(e.getSource() == deshacer){
                if(cadenaActual > 1){
                    cadenaActual--;               
                    Memento m = caretaker.getMemento(cadenaActual);
                    originator.setMemento(m);
                    documento.setText(m.getCadena());
                    rehacer.setEnabled(true);
                } else if (cadenaActual==1){
                    cadenaActual--;               
                    Memento m = caretaker.getMemento(cadenaActual);
                    originator.setMemento(m);
                    documento.setText(m.getCadena());
                    deshacer.setEnabled(false);
                } else {
                    deshacer.setEnabled(false);
                }
            } else if(e.getSource() == guardar){
                mementosGuardados++;
                cadenaActual++;
                String texto = documento.getText();
                originator.setCadena(texto);
                caretaker.agregarMemento(originator.crearMemento());
                if(cadenaActual!=1)deshacer.setEnabled(true);
            }
        }
    }
}