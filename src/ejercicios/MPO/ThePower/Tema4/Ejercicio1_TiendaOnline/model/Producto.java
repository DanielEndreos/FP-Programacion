package ejercicios.MPO.ThePower.Tema4.Ejercicio1_TiendaOnline.model;

public class Producto {
    private String nombre, categoria, codigo;
    private double precio;

    //Constructor vacio
    public Producto() {}

    //Constructor completo
    public Producto(String nombre, String categoria, String codigo, double precio ){
        this.nombre = nombre;
        this.categoria = categoria;
        this.codigo = codigo;
        this.precio = precio;
    }

    //Constructor sin precio
    public Producto(String nombre, String categoria, String codigo) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.codigo = codigo;
        this.precio = -1;
    }

    public void mostrarDatos(){
        System.out.printf("Nombre: %s, categoría: %s, código: %s, precio: %.2f€\n",nombre, categoria, codigo, precio);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
