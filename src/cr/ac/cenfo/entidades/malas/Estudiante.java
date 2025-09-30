package cr.ac.cenfo.entidades.malas;

import java.util.List;

public class Estudiante {
    private String di; // NDI: Número de Identificación Nacional
    private String nombreCompleto;
    private String apellido1;
    private String apellido2;
    private List<String> telefonos;
    private List<String> emails;
    private String carrera;

    public String getDi() {
        return di;
    }

    public void setDi(String di) {
        this.di = di;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public List<String> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(List<String> telefonos) {
        this.telefonos = telefonos;
    }

    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public Estudiante(String di, String nombreCompleto, String apellido1, String apellido2, List<String> telefonos, List<String> emails, String carrera) {
        this.di = di;
        this.nombreCompleto = nombreCompleto;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.telefonos = telefonos;
        this.emails = emails;
        this.carrera = carrera;
    }
}
