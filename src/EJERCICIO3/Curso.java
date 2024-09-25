// Curso.java
package EJERCICIO3;

public class Curso {
    private String nombre;
    private Estudiante[] estudiantes;
    private int cantEstudiantes;

    public Curso(String nombre) {
        this.nombre = nombre;
        estudiantes = new Estudiante[10];
        cantEstudiantes = 0;
    }

    public void inscribir(Estudiante estudiante) {
        estudiantes[cantEstudiantes] = estudiante;
        cantEstudiantes++;
        estudiante.inscribirCurso(this);
    }

    public String getNombre() {
        return nombre;
    }
}