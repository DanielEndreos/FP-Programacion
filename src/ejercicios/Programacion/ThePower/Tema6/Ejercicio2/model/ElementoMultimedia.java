package ejercicios.Programacion.ThePower.Tema6.Ejercicio2.model;

public abstract class  ElementoMultimedia {
    private String identificador, titulo, autor, formato;
    private int tamanio;

    public ElementoMultimedia(){}

    public ElementoMultimedia(String identificador, String titulo, String autor, String formato, int tamanio){
        this.identificador = identificador;
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.tamanio = tamanio;
    }

}
