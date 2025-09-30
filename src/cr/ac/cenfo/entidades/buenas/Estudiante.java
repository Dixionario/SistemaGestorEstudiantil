package cr.ac.cenfo.entidades.buenas;

import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Persona {
    private List<String> emails;
    private List<String> tels;
    private String carrera;

    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    public List<String> getTels() {
        return tels;
    }

    public void setTels(List<String> tels) {
        this.tels = tels;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public Estudiante(String id, String nombreCompleto, String apellido1, String apellido2, String direccion) {
        super(id, nombreCompleto, apellido1, apellido2, direccion);
        this.carrera = carrera;
        this.emails = new ArrayList<>();
        this.tels = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Estudiante: " + this.getApellido1() + " " + this.getApellido2() + " " + this.getNombreCompleto() +
               ", Carrera: " + this.carrera;
    }
}
