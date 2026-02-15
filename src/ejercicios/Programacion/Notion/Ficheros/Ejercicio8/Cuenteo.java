package ejercicios.Programacion.Notion.Ficheros.Ejercicio8;

public class Cuenteo {
    private String nombre;
    private long cantidad;

    public Cuenteo() {
    }

    public Cuenteo(String nombre, long cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public long getCantidad() {
        return cantidad;
    }

    public void setCantidad(long cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
