package mx.uaemex.fi.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import mx.uaemex.fi.excepciones.exceptionFormato;
import mx.uaemex.fi.excepciones.exceptionHora;
import mx.uaemex.fi.vista.VistaHoras;
import mx.uaemex.fi.modelo.Horario;

public class controladorHora implements ActionListener {
    private String horario_actual;
    private VistaHoras view;
    private Horario modelo;

    public controladorHora(VistaHoras vista, Horario modelo) {
        this.view = vista;
        this.modelo = modelo;
        this.view.botonGuardar.addActionListener(this);
    }

    public void start() {
        view.setTitle("Horario");
        view.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            modelo.setDia((String) view.jComboBoxDia.getSelectedItem());
        } catch (exceptionFormato ex) {
            JOptionPane.showMessageDialog(null, "Seleccione un dia");
        }

        try {
            modelo.setHoraInicio((String) view.jComboBoxHI.getSelectedItem());
        } catch (exceptionFormato ex) {
            JOptionPane.showMessageDialog(null, "Seleccione la fecha inicial");
        }

        try {
            modelo.setHoraFinal((String) view.jComboBoxHF.getSelectedItem());
            JOptionPane.showMessageDialog(null, "Horario guardado exitosamente");
            setHorario_actual( "EL horario es el siguiente:"+modelo.getDia()+" "+modelo.getHoraInicio()+"-"+modelo.getHoraFinal());  
            //System.out.println(getHorario_actual());
        } catch (exceptionFormato ex) {
            JOptionPane.showMessageDialog(null, "Seleccione la fecha final");
        } catch (exceptionHora ex) {
            JOptionPane.showMessageDialog(null, "La hora inicial o final no son validas");
        }
    }
    
    public String getHorario_actual() {
        return horario_actual;
    }

    public void setHorario_actual(String horario_actual) {
        this.horario_actual = horario_actual;
    }
}
