package ejercicios.MPO.ThePower.Tema4.Ejercicio1_CorregidoOnline.model;

import java.security.PublicKey;

public class Producto {

    private String nombre, codigo;
    private double precio;
    private Categoria categoria;

    public Producto() {
    }

    public Producto(String nombre, String codigo, Categoria categoria) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.categoria = categoria;
        this.precio = -1;
    }

    public Producto(String nombre, String codigo, double precio, Categoria categoria) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.categoria = categoria;
    }

    public void mostrarDatos(){
        System.out.println("nombre = " + nombre);
        System.out.println("codigo = " + codigo);
        System.out.println("precio = " + precio);
        System.out.println("categoria = " + categoria.name().toLowerCase());
    }



    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
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
}
