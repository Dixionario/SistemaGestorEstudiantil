package cr.ac.cenfo.entidades.buenas;

public class Persona {
    private String id;
    private String nombreCompleto;
    private String apellido1;
    private String apellido2;
    private String direccion;

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

    public Persona(String id, String nombreCompleto, String apellido1, String apellido2, String direccion) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona: " + this.nombreCompleto + " " + this.apellido1 + " " + this.apellido2 + ", de " + this.direccion;
    }
}
