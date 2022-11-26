package mx.uaemex.fi.excepciones;

public class exceptionNull extends Exception {

    public exceptionNull() {
    }

    public exceptionNull(String message) {
        super(message);
    }

    public exceptionNull(String message, Throwable cause) {
        super(message, cause);
    }

    public exceptionNull(Throwable cause) {
        super(cause);
    }
    
}
