package EJERCICIO1;

public class CuentaBancaria {

    private int cuenta;
    private double saldo;

    public CuentaBancaria(int cuenta, double saldo) {
        this.cuenta = cuenta;
        this.saldo = saldo;
    }

    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    public void retirar(double cantidad) {
        saldo -= cantidad;
    }

    public int getCuenta() {
        return cuenta;
    }

    public double getSaldo() {
        return saldo;
    }
}
