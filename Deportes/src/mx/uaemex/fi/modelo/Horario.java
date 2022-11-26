package mx.uaemex.fi.modelo;
import mx.uaemex.fi.excepciones.exceptionHora;
import mx.uaemex.fi.excepciones.exceptionFormato;
public class Horario {
 private String dia;
    private String horaInicio;
    private String horaFinal;

    public Horario() {
    }

    public Horario(String dia, String horaInicio, String horaFinal) throws exceptionHora, exceptionFormato {
        this.dia = dia;
        setHoraInicio(horaInicio);
        this.horaInicio = getHoraInicio();
        setHoraFinal(horaFinal);
        this.horaFinal = getHoraFinal();
    }
    
    public String getDia() {
        return dia;
    }

    public void setDia(String dia)throws exceptionFormato{
        if(dia=="Seleccionar"){
            throw new exceptionFormato();
        }
        this.dia = dia;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) throws exceptionFormato{
        if(horaInicio=="Seleccionar"){
            throw new exceptionFormato();
        }
        this.horaInicio = horaInicio;
    }

    public String getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(String horaFinal)throws exceptionFormato, exceptionHora{
        if(horaFinal=="Seleccionar"){
            throw new exceptionFormato();
        }
        if(validarHora(horaFinal)){
            throw new exceptionHora();
        }
        this.horaFinal = horaFinal;
    }    
   public boolean validarHora(String hf){
       boolean t; String h1,h2;
       int n1,n2;
       h1=""+this.horaInicio.charAt(0)+this.horaInicio.charAt(1);
       h2=""+hf.charAt(0)+hf.charAt(1);
       n1= Integer.parseInt(h1);
       n2=Integer.parseInt(h2);
       if((n1>n2) || (n1 == n2)){
           t=true;
       }else{
           t=false;
       }
       return t;
   }
}
