package mx.uaemex.fi.modelo;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import mx.uaemex.fi.excepciones.exceptionLetras;
import mx.uaemex.fi.excepciones.exceptionLongitud;
import mx.uaemex.fi.excepciones.exceptionNull;
import mx.uaemex.fi.excepciones.exceptionNumeros;
import mx.uaemex.fi.excepciones.exceptionFormato;

public abstract class EquipoBasico {
  private String nombre;
  private String horario;
  private String requisitos;
  private int tipo;

    public int getTipo() {
        return tipo;
    }

    public EquipoBasico(String nombre, String horario, String requisitos, int tipo) throws exceptionNull, exceptionLongitud, exceptionLetras, exceptionFormato, exceptionNumeros {
        setNombre(nombre);
        setHorario(horario);
        setRequisitos(requisitos);
        setTipo(horario);
        this.nombre = getNombre();
        this.horario = getHorario();
        this.requisitos = getRequisitos();
        this.tipo = getTipo();
    }

    public void setTipo(String tipo) throws exceptionNull,exceptionNumeros{
        int ti=0;
        if(tipo==null){
            throw new exceptionNull();
        }
        if(!isNumeric(tipo)){
            throw new exceptionNumeros();
        }
        ti = Integer.parseInt(tipo);
        this.tipo = ti;
    }
  public abstract int numeroDeintegrante();
    public EquipoBasico(String nombre, String horario, String requisitos) {
        this.nombre = nombre;
        this.horario = horario;
        this.requisitos = requisitos;
    }
  
  public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre)throws exceptionNull,exceptionLongitud,exceptionLetras{
        if(nombre==null){
            throw new exceptionNull();
        }
        if(nombre.length()<2||nombre.length()>20){
            throw new exceptionLongitud();
        }
        Pattern pat = Pattern.compile("^[A-Za-z]+");
        Matcher mat = pat.matcher(nombre);
        if(!mat.matches()){
        throw new exceptionLetras();
        }
        this.nombre = nombre;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario)throws exceptionNull,exceptionFormato{
       if(horario==null){
            throw new exceptionNull();
        }
       if(!validarHora(horario)){
           throw new exceptionFormato();
       }
       
        this.horario = horario;
    }

    public String getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(String requisitos)throws exceptionNull {
        if(requisitos==null){
            throw new exceptionNull();
        }
        this.requisitos = requisitos;
    }
    
    public boolean validarHora(String Hora){
      boolean tr=false;
      Pattern pat = Pattern.compile("^[0-9]{2}:[0-9]{2}");
      Matcher mat = pat.matcher(Hora);
      if(mat.matches()){
        tr=true;
      }
      return tr;
    }
    
     public static boolean isNumeric( String s ){
    try{
        double y = Double.parseDouble( s );
        return true;
    }
    catch( NumberFormatException err ){
        return false;
    }
}
}
