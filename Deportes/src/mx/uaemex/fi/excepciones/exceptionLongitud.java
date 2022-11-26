package mx.uaemex.fi.excepciones;

public class exceptionLongitud extends Exception{
    public exceptionLongitud() {
    }

    public exceptionLongitud(String message) {
        super(message);
    }

    public exceptionLongitud(String message, Throwable cause) {
        super(message, cause);
    }

    public exceptionLongitud(Throwable cause) {
        super(cause);
    }    
}
