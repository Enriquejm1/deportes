package mx.uaemex.fi.excepciones;


public class exceptionLetras extends Exception {

    public exceptionLetras() {
    }

    public exceptionLetras(String message) {
        super(message);
    }

    public exceptionLetras(String message, Throwable cause) {
        super(message, cause);
    }

    public exceptionLetras(Throwable cause) {
        super(cause);
    }
    
}
