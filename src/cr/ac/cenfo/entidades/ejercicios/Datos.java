package cr.ac.cenfo.entidades.ejercicios;

public class Datos {
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Datos(String nombre, String apellido, String telefono, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Datos de la persona: " +
               "Nombre: " + this.nombre + ", " +
               "Apellido: " + this.apellido + ", " +
               "Teléfono: " + this.telefono + ", " +
               "Dirección: " + this.direccion;
    }
}
