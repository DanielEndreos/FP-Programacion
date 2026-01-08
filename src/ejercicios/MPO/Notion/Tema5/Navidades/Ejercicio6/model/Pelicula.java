package ejercicios.MPO.Notion.Tema5.Navidades.Ejercicio6.model;

import java.time.LocalDate;

public class Pelicula {
    private String titulo, director;
    private int duracion, anio;
    private double calificacion;

    public Pelicula(String titulo, String director, int duracion, int anio, double calificacion){
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.anio = anio;
        this.calificacion = calificacion;
    }

    public String obtenerDuracionFormateada(){
        return duracion/60+"h "+(duracion%60)+"min";
    }

    public boolean esClasica(){
        return (LocalDate.now().getYear() - anio) > 25;
    }

    public boolean esRecomendable(){
        return calificacion >= 7;
    }

    public void mostrarInfo(){
        System.out.println("Pelicula {" +
                "título='" + titulo + '\'' +
                ", director='" + director + '\'' +
                ", duracion=" + duracion +
                ", año=" + anio +
                ", calificación=" + calificacion +
                '}');
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getCalificacion() {
        return calificacion;
    }
    public void setCalificacion(double calificacion) {
        if (calificacion>=0.0 && calificacion<=10.0){
            this.calificacion = calificacion;
        } else {
            System.out.printf("Error: Valor de calificación fuera de rango. Valor introducido: (%.1f)\n", calificacion);
        }
    }
}
