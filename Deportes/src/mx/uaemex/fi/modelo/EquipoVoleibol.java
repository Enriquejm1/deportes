package mx.uaemex.fi.modelo;
import mx.uaemex.fi.excepciones.exceptionNull;
import mx.uaemex.fi.excepciones.exceptionNumeros;


public class EquipoVoleibol extends EquipoLibre{
     private  String numeroDeIntegrante="6";

    public EquipoVoleibol(String nombre, String horario, String requisitos,String tipo) {
        super(nombre, horario, requisitos,tipo);
    }

    public String getNumeroDeIntegrante() {
        return numeroDeIntegrante;
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
