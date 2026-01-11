package ejercicios.Programacion.Notion.Herencia.Ejercicio1;

import ejercicios.Programacion.Notion.Herencia.Ejercicio1.model.Gato;
import ejercicios.Programacion.Notion.Herencia.Ejercicio1.model.Perro;

public class Main {
    static void main(String[] args) {
        /*
        Crea una clase Animal con atributos nombre y edad, y un metodo hacerSonido().
        Luego crea dos clases hijas: Perro y Gato que hereden de Animal. Sobrescribe el
        metodo hacerSonido() en cada clase hija para que muestre el sonido correspondiente.
        Crea objetos de cada tipo y prueba los métodos.

        Ejemplo de salida por consola:

        Animal: Rex, 5 años
        Rex hace: Guau guau

        Animal: Mishi, 3 años
        Mishi hace: Miau miau

         */
        Gato mishi = new Gato("Mishi", 3);
        Perro rex = new Perro("Rex", 5);

        rex.hacerSonido();
        System.out.println("");
        mishi.hacerSonido();

    }
}
