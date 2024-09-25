package EJERCICIO2;
/*
Diseña una clase Biblioteca que contenga una lista de Libros. Cada Libro debe
tener un título y un autor, como mínimo. La clase Biblioteca debe tener métodos
para agregar libros y mostrar todos los libros disponibles. En el programa
principal, crea una biblioteca, agrega varios libros y muestra la lista.
 */
public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro("Meditaciones", "Marco Aurelio");
        biblioteca.agregarLibro("Etica a Nicomaco", "Aristoteles");
        biblioteca.agregarLibro("De la brevedad de la vida", "Seneca");
        biblioteca.mostrarLibros();
    }
}
