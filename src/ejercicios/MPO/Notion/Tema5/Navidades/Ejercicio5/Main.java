package ejercicios.MPO.Notion.Tema5.Navidades.Ejercicio5;

import ejercicios.MPO.Notion.Tema5.Navidades.Ejercicio5.model.Rectangulo;

public class Main {
    static void main(String[] args) {

        /*
         **Objetivo:** Crear una clase `Rectangulo` que calcule área y perímetro.

         **Requisitos:**
         * 1. Crear una clase Rectangulo con atributos: base (double), altura (double).
         * 2. Crear constructor con ambos parámetros.
         * 3. Crear getters y setters que validen que base y altura sean positivas.
         * 4. Crear método double calcularArea() que devuelva base × altura.
         * 5. Crear método double calcularPerimetro() que devuelva 2 × (base + altura).
         * 6. Crear método boolean esCuadrado() que devuelva true si base y altura son iguales.
         * 7. Crear método void escalar(double factor) que multiplique base y altura por el factor dado.
         * 8. Crear método void mostrarInfo() que muestre base, altura, área, perímetro y si es cuadrado.
         * 9. En el main, crear varios rectángulos y probar todos los métodos.
         */


        //Creando Objeto
        System.out.println("");
        System.out.println("Creando rectángulo:");
        Rectangulo r1 = new Rectangulo(10.0, 2.0);
        r1.mostrarInfo();

        //Introducción de valores erroneos
        System.out.println("");
        System.out.println("Valores erroneos:");
        r1.setBase(-10);
        r1.setAltura(0);

        //Introducción valor ok
        System.out.println("");
        System.out.println("Valores correctos:");
        r1.setBase(2.0);
        r1.mostrarInfo();

        //Escalar
        System.out.println("");
        System.out.println("Escalando:");
        r1.escalar(2.1);
        r1.mostrarInfo();
    }
}
