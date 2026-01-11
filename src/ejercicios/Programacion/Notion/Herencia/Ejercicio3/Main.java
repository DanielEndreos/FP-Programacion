package ejercicios.Programacion.Notion.Herencia.Ejercicio3;

import ejercicios.Programacion.Notion.Herencia.Ejercicio3.Model.Estudiante;

public class Main {
    static void main(String[] args) {
        /*
        Crea una clase Persona con atributos nombre y edad, y un metodo presentarse().
        Crea una clase Estudiante que herede de Persona y añada el atributo curso.
        Añade un metodo estudiar() en la clase Estudiante. Crea objetos y prueba todos los métodos.

        Ejemplo de salida por consola:

            Hola, soy Laura y tengo 20 años
            Estoy estudiando 2º de DAM

            Hola, soy Carlos y tengo 19 años
            Estoy estudiando 1º de DAM

         */
        Estudiante estudiante1 = new Estudiante("Laura", 20, "2º de DAM");
        Estudiante estudiante2 = new Estudiante("Carlos", 19, "1º de DAW");

        estudiante1.presentarse();
        estudiante1.estudiar();
        System.out.println(" ");
        estudiante2.presentarse();
        estudiante2.estudiar();

    }
}
