package ejercicios.Programacion.Notion.Ficheros.Ejercicio6;

import ejercicios.Programacion.Notion.Ficheros.Ejercicio6.model.Estudiante;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        /*
        ## Ejercicio 6: Crear un archivo CSV simple

        Escribe un programa que cree un archivo CSV (valores separados por comas) con información de 3 estudiantes.
        Para cada estudiante, guarda su nombre, edad y calificación.
        Luego, lee el archivo y muestra su contenido en la consola.

        Ejemplo de salida:
        Archivo CSV creado correctamente.

        Contenido del archivo:
        Nombre,Edad,Calificación
        Ana García,20,8.5
        Carlos Martín,19,7.2
        Laura Pérez,21,9.3
        */

        Operaciones ope = new Operaciones();

        ope.addEstudianteToCSV(new Estudiante("Daniel", 35, 7.9));
        ope.addEstudianteToCSV(new Estudiante("Yago", 33, 4.9));
        ope.addEstudianteToCSV(new Estudiante("Izan", 34, 9.9));

        ope.leerContenidoArchivo();
    }
}
