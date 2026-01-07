package ejercicios.Programacion.Notion.POO.Ejercicio11.model;

public class Producto {
    private int codigo, stock;
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio, int stock, int codigo){
        this.codigo = codigo;
        this.stock = stock;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    @Override
    public String toString() {
        return nombre+" ("+precio+"€)";
    }
}
