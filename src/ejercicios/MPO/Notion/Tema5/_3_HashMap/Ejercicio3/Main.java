package ejercicios.MPO.Notion.Tema5._3_HashMap.Ejercicio3;

import ejercicios.MPO.Notion.Tema5._3_HashMap.Ejercicio3.model.Diccionario;

import java.sql.SQLOutput;

public class Main {
    static void main(String[] args) {
        /*
        Ejercicio 3: Diccionario Español-Inglés

        Objetivo:
        Crear un diccionario bilingüe usando un HashMap para traducir palabras del
        español al inglés.

        Requisitos:

        1. Crear un HashMap<String, String> para almacenar traducciones
           (español como clave, inglés como valor).

        2. Crear metodo: void agregarTraduccion(String espanol, String ingles)
           que añada o actualice una traducción.

        3. Crear metodo: String traducir(String palabra)
           que devuelva la traducción o un mensaje si no existe.

        4. Crear metodo: void agregarVariasTraducciones(String[][] traducciones)
           que permita añadir múltiples traducciones desde un array bidimensional.

        5. Crear metodo: void listarDiccionario()
           que muestre todas las palabras y sus traducciones ordenadas
           alfabéticamente.

        6. Crear metodo: int tamanioDiccionario()
           que devuelva el número de palabras en el diccionario.

        7. Crear metodo: void traducirFrase(String frase)
           que traduzca palabra por palabra una frase completa.

        8. En el main, crear un diccionario, añadir palabras y probar
           traducciones de palabras y frases.


        Ejemplo de salida:

        Diccionario Español-Inglés
        =========================

        Agregando traducciones...
        Diccionario cargado con 10 palabras.

        Traducción de "hola": hello
        Traducción de "casa": house
        Traducción de "gato": cat

        Traduciendo frase: "el gato está en la casa"
        Traducción: the cat is in the house

        Total de palabras en el diccionario: 10

         */
        Diccionario dicc = new Diccionario();
        String[][] palabras = {
                {"casa", "house"},
                {"perro", "dog"},
                {"gato", "cat"},
                {"libro", "book"},
                {"mesa", "table"},
                {"silla", "chair"},
                {"coche", "car"},
                {"agua", "water"},
                {"sol", "sun"},
                {"luna", "moon"},
                {"el", "the"},
                {"está", "is"},
                {"en", "in"},
                {"la", "the"},
                {"casa", "house"},
                {"hola", "hello"}
        };

        System.out.println("Diccionario Español-Inglés");
        System.out.println("==========================");
        System.out.println("Agregando traducciones...");
        dicc.agregarVariasTraduciones(palabras);

        System.out.println(" ");
        System.out.println(dicc.traducir("hola"));
        System.out.println(dicc.traducir("casa"));
        System.out.println(dicc.traducir("gato"));

        System.out.println(" ");
        dicc.traducirFrase("el gato está en la casa");

        System.out.println("\n");
        System.out.printf("Total de palabras en el diccionario: %d\n\n",dicc.tamanioDiccionario());

        System.out.println("Listado de palabras en diccionario:");

        dicc.listarDiccionario();
    }
}
