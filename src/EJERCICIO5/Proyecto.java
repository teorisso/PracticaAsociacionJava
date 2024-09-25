package EJERCICIO5;

public class Proyecto {
    private String nombre;
    private Empleado[] empleados;

    public Proyecto(String nombre) {
        this.nombre = nombre;
        this.empleados = new Empleado[0];
    }

    public void agregarEmpleado(Empleado empleado) {
        Empleado[] nuevosEmpleados = new Empleado[empleados.length + 1];
        for (int i = 0; i < empleados.length; i++) {
            nuevosEmpleados[i] = empleados[i];
        }
        nuevosEmpleados[empleados.length] = empleado;
        this.empleados = nuevosEmpleados;
    }

    public void mostrarEmpleados() {
        for (Empleado empleado : empleados) {
            System.out.println(empleado.getNombre() + " - " + empleado.getRol());
        }
    }

    public String getNombre() {
        return nombre;
    }
}
