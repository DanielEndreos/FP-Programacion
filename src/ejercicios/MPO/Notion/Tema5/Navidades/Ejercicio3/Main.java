package ejercicios.MPO.Notion.Tema5.Navidades.Ejercicio3;

import ejercicios.MPO.Notion.Tema5.Navidades.Ejercicio3.model.CuentaBancaria;

public class Main {
    static void main(String[] args) {
        /*
         **Objetivo:** Crear una clase que simule una cuenta bancaria con operaciones básicas.

         **Requisitos:**
         * 1. Crear una clase CuentaBancaria con atributos: titular (String), numeroCuenta (String), saldo (double).
         * 2. Crear constructor que inicialice titular y numeroCuenta. El saldo inicial debe ser 0.
         * 3. Crear getters. El saldo NO debe tener setter público.
         * 4. Crear metodo void ingresar(double cantidad) que añada dinero al saldo si la cantidad es positiva.
         * 5. Crear metodo boolean retirar(double cantidad) que retire dinero si hay saldo suficiente y la cantidad es positiva. Devuelve true si la operación tiene éxito.
         * 6. Crear metodo void transferir(CuentaBancaria destino, double cantidad) que transfiera dinero a otra cuenta.
         * 7. Crear metodo void mostrarInfo() que muestre titular, número de cuenta y saldo actual.
         * 8. En el main, crear dos cuentas y realizar varias operaciones.

         * Salida por consola:
            Cuenta creada: Titular: Ana López, Número: ES1234567890, Saldo: 0.0€
            Ingresando 1000€...
            Saldo actual: 1000.0€
            Retirando 300€...
            Operación exitosa. Saldo actual: 700.0€
            Intentando retirar 1000€...
            Saldo insuficiente.
            Transfiriendo 200€ a otra cuenta...
            Transferencia exitosa. Saldo actual: 500.0€
        */

        CuentaBancaria cB1 = new CuentaBancaria("Ana López", "ES1234567890");
        CuentaBancaria cB2 = new CuentaBancaria("Daniel Meco", "ES1234567891");

        System.out.print("Cuenta creada: ");
        cB1.mostrarInfo();

        System.out.print("Cuenta creada: ");
        cB2.mostrarInfo();

        System.out.println("----");
        //Ingreso a cuenta 1
        cB1.ingresar(1000);
        System.out.printf("Saldo actual: %.1f€...\n", cB1.getSaldo());

        //Retirada en cuenta 1
        boolean retirado = cB1.retirar(300);
        System.out.print(retirado?"Operación exitosa. ":"Saldo insuficiente. ");
        System.out.printf("Saldo actual: %.1f€...\n", cB1.getSaldo());

        //Retirada en cuenta 1
        retirado = cB1.retirar(1000);
        System.out.print(retirado?"Operación exitosa. ":"Saldo insuficiente. ");

        //Transferencia a otra cuenta
        cB1.transferir(cB2, 200);

        System.out.printf("Saldo actual en cuenta de %s: %.1f€...\n", cB1.getTitular(),cB1.getSaldo());
        System.out.printf("Saldo actual en cuenta de %s: %.1f€...\n", cB2.getTitular(),cB2.getSaldo());


    }
}
