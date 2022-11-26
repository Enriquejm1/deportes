package mx.uaemex.fi.modelo;


public class Horario {
 private String dia;
    private double horaInicio;
    private double horaFinal;

    public Horario() {
    }

    public Horario(String dia, double horaInicio, double horaFinal) {
        this.dia = dia;
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public double getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(double horaInicio) {
        this.horaInicio = horaInicio;
    }

    public double getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(double horaFinal) {
        this.horaFinal = horaFinal;
    }    
}
