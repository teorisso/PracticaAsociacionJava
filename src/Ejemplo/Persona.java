package Ejemplo;

public class Persona {
    private String nombre;
    private int edad;
    //Propiedades
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void mostrar(){
        System.out.println("Soy clase Ejemplo.Persona: ");
    }
}