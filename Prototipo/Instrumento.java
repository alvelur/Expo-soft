public class Instrumento implements Reserva{
	private String dueño;
	private int hora;

	public Instrumento(){}

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
		Reserva reserva = new Instrumento();
		reserva.setHora(this.hora);
		reserva.setDueño(this.dueño);
		return reserva;
	}
}
