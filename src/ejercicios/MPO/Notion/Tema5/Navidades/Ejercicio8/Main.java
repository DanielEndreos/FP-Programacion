package ejercicios.MPO.Notion.Tema5.Navidades.Ejercicio8;

import ejercicios.MPO.Notion.Tema5.Navidades.Ejercicio8.model.Coche;

public class Main {
    static void main(String[] args) {
        /*
         **Objetivo:** Crear una clase `Coche` que simule características y comportamientos básicos.

         **Requisitos:**
         *
         * 1. Crear una clase Coche con atributos: marca (String), modelo (String), anio (int), kilometraje (double), combustible (double, en litros).
         * 2. Crear constructor con marca, modelo y año. Kilometraje empieza en 0 y combustible en 50 litros.
         * 3. Crear getters y setters apropiados.
         * 4. Crear metodo void conducir(double km) que añada kilómetros al kilometraje y reduzca el combustible (1 litro cada 15 km). Si no hay suficiente combustible, mostrar mensaje de error.
         * 5. Crear metodo void repostar(double litros) que añada combustible sin superar los 60 litros.
         * 6. Crear metodo int calcularAntiguedad() que devuelva los años desde la fabricación (usa 2025 como año actual).
         * 7. Crear metodo boolean necesitaMantenimiento() que devuelva true si el kilometraje supera los 10000 km.
         * 8. Crear metodo void mostrarInfo() con toda la información del coche.
         * 9. En el main, crear un coche, conducir varias distancias, repostar y verificar mantenimiento.
         */

        Coche c1 = new Coche("Toyota", "Corolla", 2018);
        c1.mostrarInfo();
        System.out.println(c1.calcularAntiguedad()+" años de antiguedad.");
        System.out.println(c1.necesitaMantenimiento()?"Necesita mantenimiento":"No necesita mantenimiento");

        System.out.println("");
        System.out.println("--- Conducir ---");

        do{
            c1.conducir(600);
            c1.repostar(50);
        }while(!c1.necesitaMantenimiento());

        System.out.println(c1.getKilometraje()+" kms recorridos.");
        System.out.println(c1.necesitaMantenimiento()?"Necesita mantenimiento":"No necesita mantenimiento");

        System.out.println("");
        System.out.println("--- Información vehículo ---");
        c1.mostrarInfo();
    }

}
