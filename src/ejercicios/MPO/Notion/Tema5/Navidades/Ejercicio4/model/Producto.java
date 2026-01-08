package ejercicios.MPO.Notion.Tema5.Navidades.Ejercicio4.model;

public class Producto {
    private String codigo, nombre;
    private double precio;
    private int stock;

    public Producto(String codigo, String nombre, double precio, int stock){
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public boolean hayStock(){
        return stock>0;
    }

    public boolean vender(int cantidad){
        System.out.printf("Vendiendo %d unidades de tipo %s...", cantidad, nombre);
        if(stock>=cantidad){
            stock -= cantidad;
            return true;
        }
        return false;
    }

    public void reabastecer(int cantidad){
        if (cantidad>0){
            stock += cantidad;
            System.out.printf("Se han reabastecido %d productos del tipo %s\n", cantidad, nombre);
        }
    }

    public double calcularValorInventario(){
        return stock*precio;
    }

    public void mostrarInfo(){
        System.out.printf("Código: %s, Nombre: %s, Precio: %.1f€, Stock: %d, Valor total: %.1f€\n", codigo, nombre, precio, stock, calcularValorInventario());
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
}
