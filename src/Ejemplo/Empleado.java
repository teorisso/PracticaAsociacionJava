package Ejemplo;

public class Empleado extends Persona {
    private double sueldoBruto;
    //Propiedades
    public double getSueldoBruto() {
        return sueldoBruto;
    }
    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }
    public double calcularSalarioNeto (){
        return 100.000;
    }
}