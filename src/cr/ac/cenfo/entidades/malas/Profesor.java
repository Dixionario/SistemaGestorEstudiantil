package cr.ac.cenfo.entidades.malas;

import java.util.List;

public class Profesor {
    private String id;
    private String nombreCompleto;
    private String apellido1;
    private String apellido2;
    private String  direccion;
    private List<String> telefonos;
    private List<String> emails;
    private List<Curso> cursos;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public Profesor(String id, String nombreCompleto, String apellido1, String apellido2, String direccion, List<String> telefonos, List<String> emails, List<Curso> cursos) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.direccion = direccion;
        this.telefonos = telefonos;
        this.emails = emails;
        this.cursos = cursos;
    }
}
