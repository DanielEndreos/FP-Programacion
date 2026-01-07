package ejercicios.Programacion.Notion.POO.Ejercicio5.model;

public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double cantidad){
        this.saldo += cantidad;
        System.out.printf("Depósito de %.1f€. Nuevo saldo: %.1f€\n", cantidad, saldo);
    };
    public void retirar(double cantidad){
        if (cantidad > saldo){
            System.out.println("No se puede retirar la cantidad solicitada, no hay suficiente saldo en la cuenta.");
        } else{
            this.saldo -= cantidad;
            System.out.printf("Retiro de %.1f€. Nuevo saldo: %.1f€\n", cantidad, saldo);

        }
    };

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
}
