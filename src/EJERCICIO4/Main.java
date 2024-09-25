package EJERCICIO4;
/*
Crea una clase base Vehículo y clases derivadas Coche y Motocicleta. La clase
Coche debe tener un Conductor y la clase Motocicleta debe tener un Pasajero.
Implementa métodos que permitan obtener la información del vehículo y del
conductor/pasajero
 */
// Main.java

public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche("Corolla", "Teo");
        Motocicleta moto = new Motocicleta("Tenere", "Gina");

        System.out.println("----------------------------------------");
        System.out.println("Información de los vehículos:");
        System.out.println("Coche: " + coche.getNombre());
        System.out.println("Conductor: " + coche.getConductor());
        System.out.println("");
        System.out.println("Motocicleta: " + moto.getNombre());
        System.out.println("Pasajero: " + moto.getPasajero());
        System.out.println("----------------------------------------");
    }
}