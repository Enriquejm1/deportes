package mx.uaemex.fi.modelo;
import mx.uaemex.fi.excepciones.exceptionNumeros;
import mx.uaemex.fi.excepciones.exceptionNull;


public class EquipoFutSal extends EquipoLibre{
    private  String numeroDeIntegrante="5";

    public String getNumeroDeIntegrante() {
        return numeroDeIntegrante;
    }

    public EquipoFutSal(String nombre, String horario, String requisitos, String tipo) {
        super(nombre, horario, requisitos, tipo);
    }
    
    public void setNumeroDeIntegrante(String numeroDeIntegrante)throws exceptionNull,exceptionNumeros { 
        if(numeroDeIntegrante==null){
            throw new exceptionNull();
        }
        
        if(!isNumeric(numeroDeIntegrante)){
            throw new exceptionNumeros();
        }
        
        if(Integer.parseInt(numeroDeIntegrante)<=0){
            throw new exceptionNumeros();
        }
        
        this.numeroDeIntegrante = numeroDeIntegrante;
    } 
   
    @Override
    public int numeroDeintegrante() {
        int num=0;
        num=Integer.parseInt(getNumeroDeIntegrante());
        return num;
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
