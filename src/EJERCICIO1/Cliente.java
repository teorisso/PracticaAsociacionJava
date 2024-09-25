package EJERCICIO1;

public class Cliente {
    private CuentaBancaria cuenta;
    public Cliente(CuentaBancaria cuenta){
        this.cuenta = cuenta;
    }
    public void depositar(double cantidad){
        cuenta.depositar(cantidad);
    }
    public void retirar(double cantidad){
        cuenta.retirar(cantidad);
    }
}
