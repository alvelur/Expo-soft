public class Cliente{
    private int hora;
    private String dueño;

    public  Cliente (String d, int h ){
        this.hora = h;
        this.dueño=d;
    }

    public void setDueño(String d){
        this.dueño = d;
    }

    public String getDueño(){
        return this.dueño;
    }
     public void setHora(int h){
        this.hora = h;
    }

    public int getHora(){
        return this.hora;
    }
}
