package Ejemplo;

public class Directivo extends Empleado{
    private int categoria;
    public Empleado[] subordinados; //un arreglo de subordinados
    public int getCategoria() {
        return categoria;
    }
    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
}