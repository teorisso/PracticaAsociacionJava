package EJERCICIO6;
public class Categoria {
    private String nombre;
    private Producto[] productos;

    public Categoria(String nombre) {
        this.nombre = nombre;
        this.productos = new Producto[0];
    }

    public void agregarProducto(Producto producto) {
        Producto[] nuevosProductos = new Producto[productos.length + 1];
        for (int i = 0; i < productos.length; i++) {
            nuevosProductos[i] = productos[i];
        }
        nuevosProductos[productos.length] = producto;
        this.productos = nuevosProductos;
    }

    public void mostrarProductos() {
        for (Producto producto : productos) {
            System.out.println(producto.getNombre() + " - " + producto.getPrecio());
        }
    }

    public String getNombre() {
        return nombre;
    }
}
