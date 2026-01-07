package ejercicios.Programacion.Notion.POO.Ejercicio9;

import ejercicios.Programacion.Notion.POO.Ejercicio9.model.Calculadora;

public class Main {
    static void main(String[] args) {

        // Crea una clase Calculadora con métodos estáticos para sumar, restar, multiplicar y dividir dos números.
        // Añade también un metodo estático potencia(base, exponente). Usa estos metodos sin crear objetos de la clase.

        // Ejemplo de salida por consola:
        // Suma: 10 + 5 = 15
        // Resta: 10 - 5 = 5
        // Multiplicación: 10 * 5 = 50
        // División: 10 / 5 = 2.0
        // Potencia: 2^3 = 8.0

        System.out.printf("Suma: 10 + 5 = %d\n",Calculadora.sumar(10, 5));;
        System.out.printf("Suma: 10 - 5 = %d\n",Calculadora.resta(10, 5));;
        System.out.printf("Suma: 10 * 5 = %d\n",Calculadora.multiplicar(10, 5));;
        System.out.printf("Suma: 10 / 5 = %.1f\n",Calculadora.dividir(10, 5));;
        System.out.printf("Suma:  2 ^ 3 = %.1f\n",Calculadora.potencia(2, 3));;
    }
}
