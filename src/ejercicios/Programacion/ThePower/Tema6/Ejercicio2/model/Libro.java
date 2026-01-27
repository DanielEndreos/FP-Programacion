package ejercicios.Programacion.ThePower.Tema6.Ejercicio2.model;

public class Libro extends ElementoMultimedia{
    private String isbn;
    private int numPaginas;

    public Libro() {}

    public Libro(String identificador, String titulo, String autor, String formato, int tamanio, String isbn, int numPaginas) {
        super(identificador, titulo, autor, formato, tamanio);
        this.isbn = isbn;
        this.numPaginas = numPaginas;
    }
}
