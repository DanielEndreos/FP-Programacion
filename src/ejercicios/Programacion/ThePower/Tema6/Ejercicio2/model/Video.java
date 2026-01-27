package ejercicios.Programacion.ThePower.Tema6.Ejercicio2.model;

import java.util.ArrayList;

public class Video extends ElementoMultimedia{
    private String director;
    private ArrayList<String> actores;

    public Video() {}

    public Video(String identificador, String titulo, String autor, String formato, int tamanio, String director, ArrayList<String> actores) {
        super(identificador, titulo, autor, formato, tamanio);
        this.director = director;
        this.actores = actores;
    }
}
