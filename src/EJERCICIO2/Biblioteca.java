package EJERCICIO2;

public class Biblioteca {
    private Libro[] libros;
    private int cantLibros;

    public Biblioteca() {
        libros = new Libro[10];
        cantLibros = 0;
    }

    public void agregarLibro(String titulo, String autor) {
        libros[cantLibros] = new Libro(titulo, autor);
        cantLibros++;
    }

    public void mostrarLibros() {
        for (int i = 0; i < cantLibros; i++) {
            System.out.println(libros[i].getTitulo() + " de " + libros[i].getAutor());
        }
    }
}
