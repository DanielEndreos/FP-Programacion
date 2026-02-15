package ejercicios.Programacion.Notion.Ficheros.Ejercicio6;

import ejercicios.Programacion.Notion.Ficheros.Ejercicio6.model.Estudiante;

import java.io.*;
import java.util.Scanner;

public class Operaciones {

    public void addEstudianteToCSV(Estudiante estudiante){

        Scanner scn = new Scanner(System.in);
        BufferedWriter bfw = null;

        try {
            File file = new File("src/ejercicios/Programacion/Notion/Ficheros/Ejercicio6/estudiantes.csv");
            boolean exists = file.exists();

            bfw = new BufferedWriter(new FileWriter(new File("src/ejercicios/Programacion/Notion/Ficheros/Ejercicio6/estudiantes.csv"), true));

            if (!exists) {
                bfw.write("Nombre,Edad,Calificación");
                bfw.newLine();
            }

            bfw.write(estudiante.getNombre()+","+estudiante.getEdad()+","+estudiante.getCalificacion());
            bfw.newLine();

            if (!exists){
                System.out.println("Archivo creado correctamente.");
            } else {
                System.out.println("Archivo actualizado correctamente.");
            }

        } catch (IOException e) {
            System.out.println("No tienes permisos de escritura.");
        } finally {
            scn.close();
            try {
                if (bfw!=null) bfw.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Error al cerrar el FileWriter.");
            }
        }

    }

    public void leerContenidoArchivo(){

        Scanner scn = new Scanner(System.in);
        BufferedReader bfr = null;

        try {
            File file = new File("src/ejercicios/Programacion/Notion/Ficheros/Ejercicio6/estudiantes.csv");

            bfr = new BufferedReader(new FileReader(new File("src/ejercicios/Programacion/Notion/Ficheros/Ejercicio6/estudiantes.csv")));

            System.out.printf("""
                    Contenido del archivo:
                    %s
                    """, bfr.readAllAsString());

        } catch (IOException e) {
            System.out.println("No tienes permisos de escritura.");
        } finally {
            scn.close();
            try {
                if (bfr!=null) bfr.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Error al cerrar el FileWriter.");
            }
        }

    }


}
