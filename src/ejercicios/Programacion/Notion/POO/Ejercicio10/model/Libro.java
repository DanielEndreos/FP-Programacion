package ejercicios.Programacion.Notion.POO.Ejercicio10.model;

public class Libro {
    private String titulo, autor;
    private int isbn;
    private boolean disponible;

    public Libro(String titulo, String autor, int isbn, boolean disponible){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponible = disponible;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "- "+ titulo +
                " ("+autor+")"+
                " ISBN: "+ isbn;
    }
}
