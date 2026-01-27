package ejercicios.Programacion.ThePower.Tema6.Ejercicio2.controller;

import ejercicios.Programacion.ThePower.Tema6.Ejercicio2.model.ElementoMultimedia;
import ejercicios.Programacion.ThePower.Tema6.Ejercicio2.model.Libro;

import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;


public class GestionColeccMultimedia {

    private HashMap<String, ElementoMultimedia> coleccion;
    private Scanner scn;

    public GestionColeccMultimedia(Scanner scn) {
        this.scn = scn;
        coleccion = new HashMap<>();
    }

    public void start() {
        int opcion = 0;

        do {
            System.out.print("""
                    ---------  Menú ---------
                    1. Añadir a la colección
                    2. Eliminar de la colección
                    3. Listar Elementos
                    4. Buscar por Autor
                    5. Buscar por Actor
                    6. Buscar por Director
                    7. Salir
                    
                    Opción a seleccionar: """);
            opcion = scn.nextInt();

            switch (opcion) {
                case 1 -> {
                    addToColeccion();
                }
                case 2 -> {
                }
                case 3 -> {
                }
                case 4 -> {
                }
                case 5 -> {
                }
                case 6 -> {
                }
                case 7 -> {
                    System.out.println("Saliendo...");
                }
            }

        } while (opcion != 7);


    }

    private void addToColeccion() {
        String opcion = "";
        System.out.print("¿Qué tipo de objeto es (Libro, Video o Audio)? ");
        opcion = scn.next();

        switch (opcion.toLowerCase(Locale.ROOT)) {
            case "libro" -> {
                addlibro();
            }
            case "video" -> {
            }
            case "audio" -> {
            }
            default -> {
                System.out.println("El elemento introducido no existe, saliendo...");
            }
        }
    }

    private void addlibro() {
        String identificador, titulo, autor, formato, isbn;
        int tamanio, numpaginas;

        System.out.print("Introduce el identificador: ");
        identificador = scn.next();

        System.out.print("Introduce el título: ");
        titulo = scn.next();

        System.out.print("Introduce el autor: ");
        autor = scn.next();

        System.out.print("Introduce el formato: ");
        formato = scn.next();

        System.out.print("Introduce el tamaño: ");
        tamanio = scn.nextInt();

        System.out.print("Introduce el ISBN: ");
        isbn = scn.next();

        System.out.print("Introduce el número de páginas: ");
        numpaginas = scn.nextInt();


        coleccion.put(identificador, new Libro(identificador, titulo, autor, formato, tamanio, isbn, numpaginas));


    }

}
