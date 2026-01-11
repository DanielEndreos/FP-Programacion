package ejercicios.Programacion.Notion.Herencia.Ejercicio4;

import ejercicios.Programacion.Notion.Herencia.Ejercicio4.model.Circulo;
import ejercicios.Programacion.Notion.Herencia.Ejercicio4.model.Cuadrado;

public class Main {
    static void main(String[] args) {
        /*
        Crea una clase Figura con un metodo calcularArea().
        Crea dos clases hijas: Circulo (con atributo radio)
        y Cuadrado (con atributo lado). Implementa el metodo
        calcularArea() en cada clase hija con la fórmula
        correspondiente. Crea objetos de cada tipo y muestra sus áreas.

        Ejemplo de salida por consola:
            Círculo con radio 5.0
            Área: 31.4

            Cuadrado con lado 4.0
            Área: 16.0

        */
        Circulo circulo = new Circulo(5);
        circulo.calcularArea();

        Cuadrado cuadrado = new Cuadrado(4);
        cuadrado.calcularArea();

    }
}
