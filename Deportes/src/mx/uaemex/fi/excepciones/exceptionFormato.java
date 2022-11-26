package mx.uaemex.fi.excepciones;

public class exceptionFormato extends Exception {

    public exceptionFormato() {
    }

    public exceptionFormato(String message) {
        super(message);
    }

    public exceptionFormato(String message, Throwable cause) {
        super(message, cause);
    }

    public exceptionFormato(Throwable cause) {
        super(cause);
    }
    
}
