package cr.ac.cenfo.entidades.buenas;

public class Funcionario extends Persona{

    private String puesto;

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public Funcionario(String id, String nombreCompleto, String apellido1, String apellido2, String direccion) {
        super(id, nombreCompleto, apellido1, apellido2, direccion);
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return "un funcionario del puesto: " + this.puesto;
    }
}
