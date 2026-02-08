package ejercicios.MPO.ThePower.Tema4.Ejercicio1_TiendaOnline.controller;


import ejercicios.MPO.ThePower.Tema4.Ejercicio1_TiendaOnline.model.Producto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;

public class GestorProductos {

    private ArrayList<Producto> listaProductos;

    public GestorProductos() {
        this.listaProductos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        buscarPorCodigo(p.getCodigo()).ifPresentOrElse( prod -> {
            System.out.print("Este producto ya existía: ");
            prod.mostrarDatos();
        },() -> listaProductos.add(p) );

        /*
        boolean codExists = listaProductos.stream().anyMatch(producto -> producto.getCodigo().equals(p.getCodigo())); // Gpt

        if (!codExists) {
            listaProductos.add(p);
            System.out.println("Producto añadido correctamente.");
        } else {
            System.out.print("Código Repetido, producto no añadido (");
            p.mostrarDatos();
            System.out.println(").");
        }*/
    }

    public void asignarPrecios(){
        listaProductos.stream().filter(producto -> producto.getPrecio()<0).forEach(producto -> producto.setPrecio( (Math.random()*100)+1 ));
    }

    public void mostrarProductos(){
        listaProductos.forEach(Producto::mostrarDatos);
    }

    public double calcularPrecioMedio(){
        if (listaProductos.size()>0) {
            return listaProductos.stream().mapToDouble(Producto::getPrecio).sum() / listaProductos.size();
        } else {
            return 0.0;
        }
    }

    public long getNumeroProductosCaros(double limite){
        return listaProductos.stream().filter(producto -> producto.getPrecio()>=limite).count();
    }

    public List<Producto> getProductosCaros(double limite){
        return listaProductos.stream().filter(producto -> producto.getPrecio()>=limite).toList();
    }

    public Optional<Producto> buscarPorCodigo(String codigo){
        return listaProductos.stream().filter(producto -> producto.getCodigo().equals(codigo)).findFirst();
    }

    public void ordenarProPrecioDesc(){
        listaProductos.sort(Comparator.comparingDouble(Producto::getPrecio).reversed());
    }

    public List<Producto> getProductosPorCondicion(BiPredicate<Producto, Double> condicion, double valor){
        return listaProductos.stream().filter(producto -> condicion.test(producto, valor)).toList();
    }
}
