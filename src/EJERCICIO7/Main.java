package EJERCICIO7;
/*
Diseña un sistema de reservas donde cada Cliente pueda hacer varias Reservas
de Habitaciones. La clase Habitación debe tener información como el número y
el tipo. Implementa métodos para realizar una reserva y listar todas las reservas
de un cliente.
 */
public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Teo");
        Habitacion habitacion1 = new Habitacion("Cabaña 1", "Cabaña");
        Habitacion habitacion2 = new Habitacion("Cabaña 2", "Cabaña");

        Cliente cliente2 = new Cliente("Gina");
        Habitacion habitacion3 = new Habitacion("Cabaña 3", "Cabaña");
        Habitacion habitacion4 = new Habitacion("Cabaña 4", "Cabaña");

        cliente1.agregarHabitacion(habitacion1);
        cliente1.agregarHabitacion(habitacion2);
        cliente2.agregarHabitacion(habitacion3);
        cliente2.agregarHabitacion(habitacion4);

        cliente1.reservar(habitacion1);
        cliente1.reservar(habitacion2);
        cliente2.reservar(habitacion3);
        cliente2.reservar(habitacion4);
        System.out.println("----------------------------------------");
        System.out.println("Reservas de " + cliente1.getNombre());
        cliente1.mostrarReservas();
        System.out.println("----------------------------------------");
        System.out.println("Reservas de " + cliente2.getNombre());
        cliente2.mostrarReservas();
        System.out.println("----------------------------------------");
    }
}
