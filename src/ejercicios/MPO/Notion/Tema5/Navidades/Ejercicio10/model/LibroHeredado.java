package ejercicios.MPO.Notion.Tema5.Navidades.Ejercicio10.model;

import ejercicios.MPO.Notion.Tema5.Navidades.Ejercicio1.model.Libro;

public class LibroHeredado extends Libro {

    private String isbn;
    private boolean prestado;

    public LibroHeredado(String titulo, String autor, int numPaginas, double precio, String isbn, boolean prestado) {
        super(titulo, autor, numPaginas, precio);
        this.isbn = isbn;
        this.prestado = prestado;
    }
    @Override
    public String mostrarInfo() {
        return super.getTitulo() +" (ISBN: " + isbn + ")";
    }

    public boolean prestar(){
        if (!prestado){
            prestado = true;
            System.out.println("El libro ha sido prestado correctamente.");
            return true;
        } else {
            System.out.println("El libro ya había sido prestado, por lo que no se puede prestar.");
            return false;
        }
    }

    public boolean devolver(){
        if (prestado){
            prestado = false;
            System.out.println("El libro ha sido devuelto correctamente.");
            return true;
        } else {
            System.out.println("El libro ya había sido devuelto con anterioridad.");
            return false;
        }
    }

    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isPrestado() {
        return prestado;
    }
    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }
}
