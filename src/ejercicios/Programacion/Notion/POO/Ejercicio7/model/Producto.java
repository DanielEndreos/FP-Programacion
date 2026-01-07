package ejercicios.Programacion.Notion.POO.Ejercicio7.model;

public class Producto {
    private String nombre="Chocolate";
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Producto{nombre='"+this.nombre+"', precio="+precio+"€, cantidad="+cantidad+"}" ;
    }
}
