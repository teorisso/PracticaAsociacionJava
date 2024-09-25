// Motocicleta.java
package EJERCICIO4;

public class Motocicleta extends Vehiculo {
    private String pasajero;

    public Motocicleta(String nombre, String pasajero) {
        super(nombre);
        this.pasajero = pasajero;
    }

    public String getPasajero() {
        return pasajero;
    }
}
