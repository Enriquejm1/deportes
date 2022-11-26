package mx.uaemex.fi.excepciones;

public class exceptionHora extends Exception{

    public exceptionHora() {
    }

    public exceptionHora(String message) {
        super(message);
    }

    public exceptionHora(String message, Throwable cause) {
        super(message, cause);
    }

    public exceptionHora(Throwable cause) {
        super(cause);
    }
    
}
