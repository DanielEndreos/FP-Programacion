package ejercicios.Programacion.Notion.Ficheros.Ejercicio3;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Ejercicio 3: Copiar un archivo
        Crea un programa que copie el contenido de un archivo a otro.
        El programa debe solicitar al usuario la ruta del archivo de origen y la ruta del archivo de destino.

        Archivo de origen: C:/Datos/original.txt
        Archivo de destino: C:/Datos/copia.txt

        El archivo ha sido copiado correctamente.
         */

        Scanner scn = new Scanner(System.in);
        System.out.print("Archivo de origen: ");
        String fromPath = scn.next();
        System.out.print("Archivo de origen: ");
        String toPath = scn.next();

        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(new File (fromPath)));
            bufferedWriter = new BufferedWriter(new FileWriter(new File (toPath)));

            bufferedWriter.write(bufferedReader.readAllAsString());

        } catch (FileNotFoundException e) {
            System.out.println("El archivo no ha sido encontrado en la ruta seleccionada.");
        } catch (IOException e) {
            System.out.println("No hay permisos de Lectura/Escritura.");
        } finally {
            try {
                if (bufferedReader!=null) bufferedReader.close();
                if(bufferedWriter!=null) bufferedWriter.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("No ha podido cerrarse correctamente");
            }
        }


    }
}
