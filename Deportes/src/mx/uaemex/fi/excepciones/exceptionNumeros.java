package mx.uaemex.fi.excepciones;

public class exceptionNumeros extends Exception{

    public exceptionNumeros() {
    }

    public exceptionNumeros(String message) {
        super(message);
    }

    public exceptionNumeros(String message, Throwable cause) {
        super(message, cause);
    }

    public exceptionNumeros(Throwable cause) {
        super(cause);
    }
    
}
