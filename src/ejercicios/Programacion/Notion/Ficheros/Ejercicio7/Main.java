package ejercicios.Programacion.Notion.Ficheros.Ejercicio7;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Crea un programa que solicite al usuario una ruta de directorio y muestre una lista de todos los archivos
        y subdirectorios contenidos en él.
        Para cada elemento, indica si es un archivo o un directorio,
        su tamaño en bytes (si es un archivo) y la fecha de última modificación.

        Ejemplo de entrada:
        Ruta: C:/Users/usuario/Documents

        Ejemplo de salida:
         Directorio: C:/Users/usuario/Documents
        - [ARCHIVO] informe.pdf (245678 bytes) - Última modificación: 23/09/2025 09:45
        - [DIRECTORIO] Proyectos - Última modificación: 20/09/2025 14:30
        - [ARCHIVO] presupuesto.xlsx (35420 bytes) - Última modificación: 15/09/2025 11:20
        - [DIRECTORIO] Imágenes - Última modificación: 10/09/2025 16:15
         */

        Scanner scn = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm");

        System.out.print("Ruta: ");
        String path = scn.nextLine();

        File file = new File(path);

        System.out.println("Directorio: "+file.getAbsolutePath());
        for (File f : file.listFiles()){
            String date = sdf.format(f.lastModified());

            if (f.isFile()){
                System.out.printf("[%s] %s (%s bytes) - Última modificación: %s\n", f.isFile()?"ARCHIVO":"DIRECTORIO", f.getName(), f.length(), date);
            } else {
                System.out.printf("[%s] %s - Última modificación: %s\n", f.isFile()?"ARCHIVO":"DIRECTORIO", f.getName(), date);
            }

        }

    }
}
