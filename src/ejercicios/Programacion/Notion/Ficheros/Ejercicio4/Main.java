package ejercicios.Programacion.Notion.Ficheros.Ejercicio4;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        ## Ejercicio 4: Obtener información de un archivo

        Desarrolla un programa que obtenga y muestre información detallada sobre un archivo especificado por el usuario,
        como su tamaño, fecha de última modificación, permisos de lectura/escritura y si es un archivo oculto o no.

        Ejemplo de entrada:
        Introduce la ruta del archivo: C:/Datos/informe.pdf

        Ejemplo de salida:
        Información del archivo C:/Datos/informe.pdf:
        - Tamaño: 2456789 bytes (2.3 MB)
        - Última modificación: 05/10/2025 14:32:45
        - Permisos: Lectura (sí), Escritura (sí), Ejecución (no)
        - Archivo oculto: no
        - Ruta absoluta: C:/Datos/informe.pdf
         */

        Scanner scn = new Scanner(System.in);

        System.out.print("Introduce la ruta del archivo: ");
        String path = scn.nextLine();

        File file = new File(path);

        if (file.exists()){

            long bytes = file.length();
            double mb = bytes / (1024.0 * 1024.0);

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            String fecha = sdf.format(new Date(file.lastModified()));

            System.out.printf("""
                Información del archivo %s
                - Tamaño: %d bytes (%.2f MB)
                - Última modificación; %s
                - Permisos: Lectura(%s), Escritura (%s), Ejercución (%s)
                - Archivo oculto: %s
                - Ruta absoluta: %s
                """,
                    path,
                    bytes, mb,
                    fecha,
                    file.canRead()?"sí":"no",
                    file.canWrite()?"sí":"no",
                    file.canExecute()?"sí":"no",
                    file.isHidden()?"sí":"no",
                    file.getAbsolutePath()
            );
        } else {
            System.out.println("El archivo / ruta no existe.");
        }


    }
}
