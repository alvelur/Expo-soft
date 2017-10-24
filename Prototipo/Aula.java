
public class Aula implements Reserva{
	private String dueño;
	private int hora;

	public Aula(){}

	@Override
	public void setHora(int n){
		this.hora = n;
	}

	@Override
	public int getHora(){
		return hora;
	}
    @Override
	public void setDueño(String d){
		this.dueño = d;
	}

	@Override
	public String getDueño(){
		return dueño;
	}

	
	@Override
	public Reserva clonar(){
		Reserva reserva = new Aula();
		reserva.setHora(this.hora);
		reserva.setDueño(this.dueño);
		return reserva;
	}
}
