package EJERCICIO7;

public class Cliente {
    private String nombre;
    private Habitacion[] habitaciones;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.habitaciones = new Habitacion[0];
    }

    public void agregarHabitacion(Habitacion habitacion) {
        Habitacion[] nuevasHabitaciones = new Habitacion[habitaciones.length + 1];
        for (int i = 0; i < habitaciones.length; i++) {
            nuevasHabitaciones[i] = habitaciones[i];
        }
        nuevasHabitaciones[habitaciones.length] = habitacion;
        this.habitaciones = nuevasHabitaciones;
    }

    public void reservar(Habitacion habitacion) {
        System.out.println("Reserva de " + nombre + " en " + habitacion.getNombre());
    }

    public void mostrarReservas() {
        for (Habitacion habitacion : habitaciones) {
            System.out.println(habitacion.getNombre() + " - " + habitacion.getTipo());
        }
    }

    public String getNombre() {
        return nombre;
    }
}
