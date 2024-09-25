package EJERCICIO3;
/*
Implementa una relación entre Estudiante y Curso. Un Estudiante puede estar
inscrito en múltiples Cursos, y un Curso puede tener múltiples Estudiantes. Crea
las clases necesarias y métodos para inscribir estudiantes en cursos y mostrar
los cursos de un estudiante.
 */
public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Teo", "Risso");
        Curso curso1 = new Curso("Programación");
        Curso curso2 = new Curso("Bases de datos");
        curso1.inscribir(estudiante);
        curso2.inscribir(estudiante);
        estudiante.mostrarCursos();

    }
}
