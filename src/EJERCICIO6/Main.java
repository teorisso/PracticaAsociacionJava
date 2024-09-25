package EJERCICIO6;
/*
Crea una clase Producto que contenga información sobre un producto, como
nombre y precio. Crea otra clase Categoría que contenga una lista de productos.
Implementa métodos para agregar productos a una categoría y mostrar todos los
productos de una categoría.
 */

public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto("God of War", "10000.00");
        Producto producto2 = new Producto("Assasin's Creed", "20000.00");
        Producto producto3 = new Producto("Placa de video", "30000.00");
        Producto producto4 = new Producto("Procesador", "40000.00");

        Categoria categoria1 = new Categoria("Juegos");
        categoria1.agregarProducto(producto1);
        categoria1.agregarProducto(producto2);

        Categoria categoria2 = new Categoria("Hardware");
        categoria2.agregarProducto(producto3);
        categoria2.agregarProducto(producto4);

        System.out.println("----------------------------------------");
        System.out.println("Productos de la categoría " + categoria1.getNombre());
        categoria1.mostrarProductos();
        System.out.println("----------------------------------------");

        System.out.println("----------------------------------------");
        System.out.println("Productos de la categoría " + categoria2.getNombre());
        categoria2.mostrarProductos();
        System.out.println("----------------------------------------");
    }
}