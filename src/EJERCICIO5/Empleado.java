package EJERCICIO5;

public class Empleado {
    private String nombre;
    private String rol;

    public Empleado(String nombre, String rol) {
        this.nombre = nombre;
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRol() {
        return rol;
    }
}
