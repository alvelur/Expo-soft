
/**
 * Write a description of interface Reserva here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public interface Reserva
{
    public void setHora(int n);
	public int getHora();
	public void setDueño(String d);
	public String getDueño();
	public Reserva clonar();
}
