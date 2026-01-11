package ejercicios.MPO.Notion.Tema5._2_Navidades.Ejercicio10.model;

import java.util.ArrayList;

public class Biblioteca {
    private String nombre;
    private ArrayList<LibroHeredado> libros;
    private int numLibros;

    public Biblioteca(String nombre){
        this.nombre = nombre;
        this.libros = new ArrayList<>();
        this.numLibros = 0;
    }

    public boolean agregarLibro(LibroHeredado libro){

        for (LibroHeredado libroHeredado : libros) {
            if (libroHeredado.equals(libro)){
                System.out.println("El libro que intentas agregar ya existe en la Biblioteca.");
                return false;
            }
        }
        libros.add(libro);
        numLibros = libros.size();
        return true;
    }

    public LibroHeredado buscarLibroPorIsbn(String isbn){
        for (LibroHeredado libro : libros) {
            if (libro.getIsbn().equals(isbn)){
                return libro;
            }
        }
    return null;
    }

    public boolean prestarLibro(String isbn){
        System.out.printf("Préstamos del libro %s...\n",isbn);
        return buscarLibroPorIsbn(isbn).prestar();
    }

    public boolean devolverLibro(String isbn){
        System.out.printf("Devolución del libro %s...\n",isbn);
        return buscarLibroPorIsbn(isbn).devolver();
    }
    public void listarLibrosDisponibles(){
        for (LibroHeredado libro : libros) {
            if (!libro.isPrestado()){
                System.out.println("- "+libro.mostrarInfo());
            }
        }
    }

    public void listarLibrosPrestados(){
        for (LibroHeredado libro : libros) {
            if (libro.isPrestado()){
                System.out.println("- "+libro.mostrarInfo());
            }
        }
    }

    @Override
    public String toString() {
        return "Biblioteca Creada: " + nombre;
    }
}
