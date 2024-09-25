// Coche.java
package EJERCICIO4;

public class Coche extends Vehiculo {
    private String conductor;

    public Coche(String nombre, String conductor) {
        super(nombre);
        this.conductor = conductor;
    }

    public String getConductor() {
        return conductor;
    }
}