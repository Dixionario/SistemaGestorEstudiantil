package cr.ac.cenfo.entidades.malas;

import java.util.List;

public class Curso {
    private String codigo;
    private String nombre;
    private List<String> carreras;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getCarreras() {
        return carreras;
    }

    public void setCarreras(List<String> carreras) {
        this.carreras = carreras;
    }

    public Curso(String codigo, String nombre, List<String> carreras) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.carreras = carreras;
    }
}
