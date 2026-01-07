package ejercicios.Programacion.Notion.POO.Ejercicio4.model;

public class Libro {
    private String titulo = "Sin título", autor = "Autor desconocido";
    private int paginas = 0;

    public Libro(){}

    public Libro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    public Libro(String titulo, String autor, int paginas){
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void mostrarDatos(){
        System.out.printf("%s, %s, %d páginas", this.titulo, this.autor, this.paginas);
    }
}
