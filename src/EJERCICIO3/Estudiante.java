// Estudiante.java
package EJERCICIO3;

public class Estudiante {
    private String nombre;
    private String apellido;
    private Curso[] cursos;
    private int cantCursos;

    public Estudiante(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        cursos = new Curso[10];
        cantCursos = 0;
    }

    public void inscribirCurso(Curso curso) {
        cursos[cantCursos] = curso;
        cantCursos++;
    }

    public void mostrarCursos() {
        for (int i = 0; i < cantCursos; i++) System.out.println(cursos[i].getNombre());
    }
}