package cr.ac.cenfo.entidades;

import cr.ac.cenfo.entidades.buenas.Estudiante;
import cr.ac.cenfo.entidades.buenas.Funcionario;
import cr.ac.cenfo.entidades.buenas.Profesor;

public class Pruebas {
    public static void main(String[] args) {
        Estudiante unEstudiante = new Estudiante("999", "Dj", "Dixon",
                "Lawrence", "Desamparados");
        System.out.println(unEstudiante.getId());
        Profesor unProfesor = new Profesor("888", "Pepe", "Igorizarry",
                "Yaymen", "Puerto Viejo");
        System.out.println(unProfesor.getDireccion());
        Funcionario unFuncionario = new Funcionario("777", "Juan", "Perez",
                "Lopez", "San Jose");
        System.out.println(unFuncionario.getApellido2());
        System.out.println("unEstudiante: " + unEstudiante);
        System.out.println("unProfesor: " + unProfesor);
        System.out.println("unFuncionario: " + unFuncionario);
    }
}
