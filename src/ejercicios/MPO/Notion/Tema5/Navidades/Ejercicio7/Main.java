package ejercicios.MPO.Notion.Tema5.Navidades.Ejercicio7;

import ejercicios.MPO.Notion.Tema5.Navidades.Ejercicio7.model.Empleado;

public class Main {
    static void main(String[] args) {
        /*
         Objetivo: Crear una clase `Empleado` que calcule salarios y bonificaciones.

         Requisitos:
         * 1. Crear una clase Empleado con atributos: nombre (String), dni (String), salarioBase (double), horasExtras (int).
         * 2. Crear constructor con nombre, dni y salarioBase. Las horasExtras empiezan en 0.
         * 3. Crear getters y setters.
         * 4. Crear metodo void agregarHorasExtras(int horas) que sume horas extras.
         * 5. Crear metodo double calcularSalarioTotal() que devuelva el salarioBase más 20€ por cada hora extra.
         * 6. Crear metodo void aplicarAumento(double porcentaje) que incremente el salarioBase según el porcentaje.
         * 7. Crear metodo void resetearHorasExtras() que ponga las horas extras a 0.
         * 8. Crear metodo void mostrarInforme() que muestre nombre, DNI, salario base, horas extras y salario total.
         * 9. En el main, crear varios empleados, añadir horas extras, calcular salarios y aplicar aumentos.
         *
         */

        Empleado e1 = new Empleado("Ana López", "12345678A", 1800);
        Empleado e2 = new Empleado("Carlos Pérez", "23456789B", 2000);
        Empleado e3 = new Empleado("Lucía Martín", "34567890C", 1650);
        Empleado e4 = new Empleado("David Gómez", "45678901D", 2200);

        System.out.println("");
        System.out.println("--- Calcular Salarios Totales ---");
        e1.mostrarInforme();
        e2.mostrarInforme();
        e3.mostrarInforme();
        e4.mostrarInforme();

        System.out.println("");
        System.out.println("--- Generar Horas extras ---");
        e1.agregarHorasExtras(20);
        e2.agregarHorasExtras(0);
        e3.agregarHorasExtras(300);
        e4.agregarHorasExtras(20);

        System.out.println("");
        System.out.println("--- Calcular Salarios Totales ---");
        e1.mostrarInforme();
        e2.mostrarInforme();
        e3.mostrarInforme();
        e4.mostrarInforme();


        System.out.println("");
        System.out.println("--- Resetear horas ---");
        e1.resetearHorasExtras();
        e2.resetearHorasExtras();
        e3.resetearHorasExtras();
        e4.resetearHorasExtras();

        System.out.println("");
        System.out.println("--- Aplicar Aumento ---");
        e1.aplicarAumento(15);
        e2.aplicarAumento(30);
        e3.aplicarAumento(32);
        e4.aplicarAumento(20);

        System.out.println("");
        System.out.println("--- Calcular Salarios Totales ---");
        e1.mostrarInforme();
        e2.mostrarInforme();
        e3.mostrarInforme();
        e4.mostrarInforme();
    }
}
