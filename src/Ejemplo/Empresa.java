package Ejemplo;

public class Empresa {
    public String nombre;
    public Cliente[] clientes;
    public Empleado[] empleados;

    public Empresa () {
        empleados = new Empleado[10]; //creo la relacion fuerte automaticamente
        Empleado e1 = new Empleado();
        empleados[0] =e1; //porque me dice que debe tener un empleado minimo
        // al destruir empresa todos los empleados se desruyen por la relacion fuerte,
        // si lo recibo de afuera no
    }

}