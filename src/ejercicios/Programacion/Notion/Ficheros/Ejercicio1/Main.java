package ejercicios.Programacion.Notion.Ficheros.Ejercicio1;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        ## Ejercicio 1: Leer un archivo de texto

        Escribe un programa que lea el contenido de un archivo de texto existente y lo muestre por consola. El programa debe solicitar al usuario la ruta del archivo a leer.

        **Ejemplo de entrada:**
        Introduce la ruta del archivo: C:/Datos/notas.txt

        **Ejemplo de salida:**
        Contenido del archivo:
        Esta es la primera línea del archivo.
        Esta es la segunda línea del archivo.
        Y esta es la tercera línea.
         */

        Scanner scn = new Scanner(System.in);

        System.out.print("Introduce la ruta del archivo: ");
        String path = scn.next();

        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(new File(path)));

            System.out.println("Contenido del archivo:");
            String linea;
            while((linea = bufferedReader.readLine())!=null){
                System.out.println(linea);
            }

        } catch (FileNotFoundException e) {
            System.out.println("El arhivo no existe.");
        } catch (IOException e) {
            System.out.println("No tienes permisos de lectura.");
        } finally {
            try {
                if(bufferedReader!=null){
                    bufferedReader.close();
                }
            } catch (IOException | NullPointerException e) {
                System.out.println("Error en el cerrado del fichero.");
            }
        }


    }
}
