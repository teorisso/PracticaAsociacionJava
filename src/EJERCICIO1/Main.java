package EJERCICIO1;
/*
Crea una clase Cliente que tenga un CuentaBancaria. La clase CuentaBancaria
debe contener información como el número de cuenta y el saldo. Implementa
métodos para depositar y retirar dinero de la cuenta. En el programa principal,
crea un cliente y asocia una cuenta bancaria a él.
 */
public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(1234, 1000);
        Cliente cliente = new Cliente(cuenta);
        System.out.println("Saldo inicial: " + cuenta.getSaldo());
        cliente.depositar(100);
        System.out.println("Saldo después de depositar: " + cuenta.getSaldo());
        cliente.retirar(50);
        System.out.println("Saldo final: " + cuenta.getSaldo());
        System.out.println(cuenta.getSaldo());
    }
}
