package EJERCICIO5;
/*
Diseña un sistema de gestión de proyectos donde cada Proyecto tenga varios
Empleado asociados. Cada Empleado debe tener un nombre y un rol en el
proyecto. Implementa métodos para agregar empleados a un proyecto y mostrar
la lista de empleados que trabajan en un proyecto específico.
 */
public class Main {
    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto("Proyecto 1");
        Empleado empleado1 = new Empleado("Teo", "Desarrollador");
        Empleado empleado2 = new Empleado("Gina", "Diseñador");
        Empleado empleado3 = new Empleado("Martina", "Tester");
        Empleado empleado4 = new Empleado("Esteban", "Desarrollador");
        Empleado empleado5 = new Empleado("Maximo", "Diseñador");

        proyecto.agregarEmpleado(empleado1);
        proyecto.agregarEmpleado(empleado2);
        proyecto.agregarEmpleado(empleado3);
        proyecto.agregarEmpleado(empleado4);
        proyecto.agregarEmpleado(empleado5);

        System.out.println("----------------------------------------");
        System.out.println("Empleados del proyecto " + proyecto.getNombre());
        proyecto.mostrarEmpleados();
        System.out.println("----------------------------------------");
    }
}
