package EJERCICIO6;

public class Producto  {
    private String nombre;
    private String precio;

    public Producto(String nombre, String precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPrecio() {
        return precio;
    }
}
