
/**
 * Write a description of class Originator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Originator
{
    private String cadena;
    
    public Originator(){}
    
    public void setMemento(Memento m){ cadena = m.getCadena();}
    
    public Memento crearMemento(){ return new Memento(cadena);}
    
    public void setCadena(String cadenaN){cadena=cadenaN;}
}
