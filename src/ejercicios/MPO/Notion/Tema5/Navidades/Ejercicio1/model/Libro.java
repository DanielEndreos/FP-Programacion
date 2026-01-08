package ejercicios.MPO.Notion.Tema5.Navidades.Ejercicio1.model;

public class Libro {
    private String titulo, autor;
    private int numPaginas;
    private double precio;

    public Libro (String titulo, String autor, int numPaginas, double precio){
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.precio = precio;
    }

    public String mostrarInfo(){
        return "Título: " + titulo + ", Autor: " + autor + ", Páginas: " + numPaginas + ", Precio: " + precio + "€";
    }

    public boolean esLibroLargo(){
        return this.numPaginas > 300;
    }

    public void aplicarDescuentos(double porcentaje){
        this.precio *= 1-(porcentaje/100);
        System.out.printf("Aplicando descuento del %.1f%%\n", porcentaje);
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }
    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
