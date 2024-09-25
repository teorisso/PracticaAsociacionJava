package Ejemplo;

public class Main {
    public static void main(String[] args) {
        Persona p1=new Persona();
        p1.mostrar();
        Empleado e1=new Empleado();
        e1.mostrar();
        e1.setSueldoBruto(85000);
        Directivo d1=new Directivo();
        d1.mostrar();
        d1.setCategoria(2);
        d1.subordinados[0]=e1;
        Empresa em1= new Empresa();
        em1.empleados[1]=e1;
        em1.empleados[2]=d1;
    }
}