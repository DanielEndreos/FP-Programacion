package ejercicios.Programacion.Notion.POO.Ejercicio5;

import ejercicios.Programacion.Notion.POO.Ejercicio5.model.CuentaBancaria;

public class Main {
    static void main(String[] args) {
        //Crea una clase CuentaBancaria con atributos titular y saldo. Implementa métodos
        //depositar(cantidad) y retirar(cantidad). Crea tres cuentas diferentes, realiza varias
        //operaciones en cada una y muestra el saldo final de todas.

        //Ejemplo de salida por consola:

        //   Cuenta de Juan García: 1500.0€
        //   Depósito de 500.0€. Nuevo saldo: 2000.0€
        //
        //   Cuenta de María López: 800.0€
        //   Retiro de 200.0€. Nuevo saldo: 600.0€
        //
        //   Cuenta de Pedro Martín: 1200.0€
        //   Depósito de 300.0€. Nuevo saldo: 1500.0€
        //
        //   Saldos finales:
        //   Juan García: 2000.0€
        //   María López: 600.0€
        //   Pedro Martín: 1500.0€

        CuentaBancaria cuenta1 = new CuentaBancaria("Juan García", 1500.0);
        CuentaBancaria cuenta2 = new CuentaBancaria("María López", 800.0);
        CuentaBancaria cuenta3 = new CuentaBancaria("Pedro Martín", 1200.0);

        System.out.printf("\nCuenta de %s: %.1f€\n", cuenta1.getTitular(), cuenta1.getSaldo());
        cuenta1.depositar(500.0);
        System.out.printf("\nCuenta de %s: %.1f€\n", cuenta2.getTitular(), cuenta2.getSaldo());
        cuenta2.retirar(200.0);
        System.out.printf("\nCuenta de %s: %.1f€\n", cuenta3.getTitular(), cuenta3.getSaldo());
        cuenta3.depositar(300.0);

        System.out.printf("""
                \nSaldos finales:
                %s: %.1f
                %s: %.1f
                %s: %.1f
                """, cuenta1.getTitular(), cuenta1.getSaldo(),
                     cuenta2.getTitular(), cuenta2.getSaldo(),
                     cuenta3.getTitular(), cuenta3.getSaldo());

    }
}
