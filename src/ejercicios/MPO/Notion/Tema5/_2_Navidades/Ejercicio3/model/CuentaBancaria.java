package ejercicios.MPO.Notion.Tema5._2_Navidades.Ejercicio3.model;

public class CuentaBancaria {
    private String titular, numeroCuenta;
    private double saldo;

    public CuentaBancaria(String titular, String numeroCuenta){
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0;
    }

    public void ingresar(double cantidad){

        if (cantidad >0.0){
            saldo += cantidad;
        } else {
            System.out.println("Error: La cantidad a ingresar es negativa.");
        }

    }

    public boolean retirar(double cantidad){
        if (saldo >= cantidad){
            System.out.printf("Retirando %.1f€...\n", cantidad);
            saldo -= cantidad;
            return true;
        } else {
            System.out.printf("Intentando retirar %.1f€...\n", cantidad);
            return false;
        }
    }

    public void transferir(CuentaBancaria destino, double cantidad){
        if (saldo >= cantidad){
            System.out.printf("Transfiriendo %.1f€ a otra cuenta... \n", cantidad);
            saldo -= cantidad;
            destino.ingresar(cantidad);
            System.out.printf("Transferencia exitosa. Saldo actual: %.1f€\n", saldo);
        } else {
            System.out.printf("Intentando retirar %.1f€...\n", cantidad);
            System.out.println("Saldo insuficiente.");
        }
    }

    public void mostrarInfo(){
        System.out.printf("Titular: %s, Número: %s, Saldo: %.1f€\n", titular, numeroCuenta, saldo);
    }

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }
    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
