package cr.ac.cenfo.entidades.buenas;

public class Profesor extends Persona{
    public Profesor(String id, String nombreCompleto, String apellido1, String apellido2, String direccion) {
        super(id, nombreCompleto, apellido1, apellido2, direccion);
    }

    @Override
    public String toString() {
        return "Profesor: " + this.getNombreCompleto() + " " + this.getApellido1() + " " + this.getApellido2();
    }
}
