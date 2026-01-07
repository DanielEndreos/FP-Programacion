package ejercicios.Programacion.Notion.POO.Ejercicio1;

import ejercicios.Programacion.Notion.POO.Ejercicio1.model.Persona;

public class Main {

    static void main(String[] args) {
        // Crea una clase llamada Persona con dos atributos:
        // nombre y edad. Define un constructor que inicialice
        // estos atributos. En el metodo main, crea un objeto
        // de tipo Persona y muestra sus datos.

        //Ejemplo de salida por consola:
        //Nombre: Juan
        //Edad: 25

        Persona pax = new Persona("Juan", 25);
        pax.mostrarDatos();

    }
}
