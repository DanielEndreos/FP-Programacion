package ejercicios.Programacion.Notion.POO.Ejercicio3;

import ejercicios.Programacion.Notion.POO.Ejercicio3.model.Rectangulo;

public class Main {
    static void main(String[] args) {
        // Crea una clase Rectangulo con atributos base y altura. Añade métodos calcularArea()
        // y calcularPerimetro() que devuelvan el área y el perímetro respectivamente.
        // Crea un objeto y muestra los resultados.

        // Ejemplo de salida por consola:
        // Rectangulo con base 5.0 y altura 3.0
        // Área: 15.0
        // Perímetro: 16.0

        Rectangulo prueba = new Rectangulo(5.0, 3.0);

        System.out.printf("Rectangulo con base %.1f y altura %.1f\n", prueba.getBase(),  prueba.getAltura());
        System.out.printf("Área: %.1f\n", prueba.calcularArea());
        System.out.printf("Perímetro: %.1f\n", prueba.calcularPerimetro());
    }
}
