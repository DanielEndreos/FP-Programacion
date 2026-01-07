package ejercicios.Programacion.Notion.POO.Ejercicio10.model;

public class Usuario {
    private String nombre;
    private int numSocio;

    public Usuario(String nombre, int numSocio){
        this.nombre = nombre;
        this.numSocio = numSocio;
    }

    @Override
    public String toString() {
        return "Usuario "+nombre+
                "("+numSocio+")";
    }
}
