package ejercicios.Programacion.Notion.Ficheros.Ejercicio8;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        Desarrolla una aplicación que lea un archivo de texto y cuente cuántas palabras contiene.
        El programa debe mostrar también cuáles son las 5 palabras más frecuentes y cuántas veces aparece cada una.
        Ignora signos de puntuación y trata las palabras sin distinguir entre mayúsculas y minúsculas.

        Ejemplo de entrada:
        Archivo: C:/Datos/articulo.txt

        Contenido del archivo:
        Java es un lenguaje de programación muy popular.
        Java se utiliza para desarrollar aplicaciones web, aplicaciones móviles y aplicaciones de escritorio.
        Java es un lenguaje orientado a objetos que fue diseñado para tener la menor cantidad posible de dependencias de implementación.

        Ejemplo de salida:
        Archivo: C:/Datos/articulo.txt
        Número total de palabras: 42

        Las 5 palabras más frecuentes:
        1. java: 3 veces
        2. aplicaciones: 3 veces
        3. de: 3 veces
        4. es: 2 veces
        5. un: 2 veces
         */

        BufferedReader bufferedReader = null;

        String path = "src/ejercicios/Programacion/Notion/Ficheros/Ejercicio8/articulo.txt";
        System.out.println("Archivo: "+path);

        try {
            bufferedReader = new BufferedReader(new FileReader(new File(path)));

            // Recojo el texto del archivo
            String textoSinProcesar = bufferedReader.readAllAsString();


            // Filtro el texto y cambio los acentos por vocales simples además de quitar mayusculas
            char[] vocales = {'a','e','i','o','u'};
            char[] acentuadas = {'á', 'é', 'í', 'ó', 'ú'};

            for (int i=0; i<vocales.length; i++){
                textoSinProcesar = textoSinProcesar.replace(acentuadas[i],vocales[i]).toLowerCase();
            }

            // Divido el texto por .,!¡:;?¿ y espacios
            String[] textoArray = textoSinProcesar.split("[.,!¡:;?¿\\s]+");

            // He creado una clase para controlar la cantidad de veces que sale una palabra.
            List<Cuenteo> textoOrdenado = new ArrayList<>();

            System.out.println("Número total de palabras: "+ textoArray.length);
            System.out.println("\nLas 5 palabras más frecuentes:");

            // He creado una cla
            Arrays.stream(textoArray).distinct().forEach(palabra -> {

                long cantidad = Arrays.stream(textoArray).filter(a -> a.equalsIgnoreCase(palabra)).count();

                textoOrdenado.add(new Cuenteo(palabra, cantidad));

            });

            textoOrdenado.stream()
                         .sorted(Comparator.comparingLong(Cuenteo::getCantidad).reversed())
                         .limit(5)
                         .forEach(a-> System.out.println(a.getNombre()+": "+a.getCantidad()));

        } catch (FileNotFoundException e) {
            System.out.println("El archivo no ha podido ser encontrado o la ruta no existe.");
        } catch (IOException e) {
            System.out.println("No tienes permisos de lectura en este archivo.");
        } finally {
            try {
                if (bufferedReader!=null) bufferedReader.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("No se ha podido cerrar el BufferedReader.");
            }
        }
    }
}
