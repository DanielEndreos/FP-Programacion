package ejercicios.Programacion.Notion.Ficheros.Ejercicio5;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        ## Ejercicio 5: Contar líneas de un archivo

        Desarrolla un programa que cuente el número de líneas que contiene un archivo de texto.
        El programa debe solicitar al usuario la ruta del archivo a analizar.

        Ejemplo de entrada:
        Introduce la ruta del archivo: C:/Datos/poema.txt

        Ejemplo de salida:
        El archivo contiene 14 líneas.
         */

        Scanner scn = new Scanner(System.in);
        System.out.print("Introduce la ruta del archivo: ");
        String path = scn.nextLine();

        BufferedReader br = null;


        try {
            br = new BufferedReader(new FileReader(new File(path)));

            String linea;
            int cantidadLineas = 0;
            while ( (linea = br.readLine())!=null ){
                cantidadLineas += 1;
            }
            System.out.printf("El archivo contiene %d líneas.\n", cantidadLineas);
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe.");
        } catch (IOException e) {
            System.out.println("No hay permisos de lectura.");
        } finally {

            try {
                if (br != null) br.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("No ha podido cerrarse.");
            }

        }

    }
}
