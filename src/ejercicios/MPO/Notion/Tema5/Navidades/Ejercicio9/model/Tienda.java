package ejercicios.MPO.Notion.Tema5.Navidades.Ejercicio9.model;

import ejercicios.MPO.Notion.Tema5.Navidades.Ejercicio4.model.Producto;


public class Tienda {
    private String nombre;
    private Producto[] productos;
    private int numProductos;

    public Tienda(String nombre){
        this.nombre = nombre;
        this.productos = new Producto[50];
    }

    public boolean agregarProducto(Producto producto){
        for (int i = 0; i < productos.length; i++) {
            if(productos[i]==null){
                productos[i] = producto;
                return true;
            }
        }
        System.out.println("Ya no caben más objetos en la lista.");
        return false;
    }

    public Producto buscarProducto(String codigo){
        for (Producto producto : productos) {
            if (producto.getCodigo().equals(codigo)){
                return producto;
            }
        }
        return null;
    }

    public void listarProductos(){
        for (Producto producto : productos) {
            producto.mostrarInfo();
        }
    }

    public double calcularValorTotalInventario(){
        double valorTotal = 0.0;
        for (Producto producto : productos) {
            if (producto.hayStock()){
                valorTotal += producto.calcularValorInventario();
            }
        }
        return valorTotal;
    }

    public void listarProductosSinStock(){
        for (Producto producto : productos) {
            if (!producto.hayStock()){
                producto.mostrarInfo();
            }
        }
    }

}
