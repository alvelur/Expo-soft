import java.util.ArrayList;
/**
 * Write a description of class CareTaker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CareTaker
{
    ArrayList<Memento> mementos = new ArrayList<Memento>();
    
    public void agregarMemento(Memento m){mementos.add(m);}
    
    public Memento getMemento(int index){return mementos.get(index);}
}
