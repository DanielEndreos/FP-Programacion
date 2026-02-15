package ejercicios.Programacion.Notion.Ficheros.Ejercicio2;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Ejercicio 2: Buscar palabra en archivo

        Escribe un programa que busque cuántas veces aparece una palabra específica en un archivo de texto.
        El usuario debe introducir la ruta del archivo y la palabra a buscar.

        Ejemplo de entrada:
        Ruta del archivo: C:/Datos/articulo.txt
        Palabra a buscar: Java

        Ejemplo de salida:
        La palabra "Java" aparece 7 veces en el archivo.
         */

        Scanner scn = new Scanner(System.in);
        System.out.print("Ruta del archivo: ");
        String path = scn.next();
        System.out.print("Palabra a buscar: ");
        String word = scn.next();

        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(new File(path)));

            String texto = bufferedReader.readAllAsString();

            String[] textoDividido= texto.split("[,.\\s!?]+");

            long qtyWords = Arrays.stream(textoDividido).filter(item -> item.equalsIgnoreCase(word)).count();

            System.out.printf("La palabra \"%s\" aparece %d veces en el archivo.", word, qtyWords);

        } catch (FileNotFoundException e) {
            System.out.println("El archivo no se ha encontrado.");
        } catch (IOException e) {
            System.out.println("No tienes permiso de lectura.");
        }

    }
}
