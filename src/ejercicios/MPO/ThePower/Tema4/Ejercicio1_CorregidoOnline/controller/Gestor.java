package ejercicios.MPO.ThePower.Tema4.Ejercicio1_CorregidoOnline.controller;
import ejercicios.MPO.ThePower.Tema4.Ejercicio1_CorregidoOnline.model.Producto;

import java.util.*;
import java.util.function.BiPredicate;

public class Gestor {

    private List<Producto> productos;

    public Gestor(){
        productos = new ArrayList<>();
    }

    public void agregarproducto(Producto p){
        boolean existe = productos.stream().anyMatch(item -> item.getCodigo().equalsIgnoreCase(p.getCodigo()));

        if (existe){
            System.out.println("Codigo utilizado, puedes volver a intentarlo.");
        }else{
            productos.add(p);
        }

    }

    public void asignarPrecios(){
        productos.stream().filter(producto -> producto.getPrecio()<0).forEach(producto -> producto.setPrecio( (Math.random()*100)+1 ));
    }

    public void mostrarDatos(){
        productos.forEach(Producto::mostrarDatos);
    }

    public double calcularPrecioMedio(){
            return productos.stream().mapToDouble(Producto::getPrecio).average().orElse(0.0);
    }

    public long getNumeroProductosCaros(double limite){
        return productos.stream().filter(item -> item.getPrecio()>=limite).count();
    }

    public List<Producto> getProductosCaros(double limite){
        return productos.stream().filter(item -> item.getPrecio()>=limite).toList();
    }

    public Optional<Producto> buscarPorCodigo(String codigo){
        return productos.stream().filter(item -> item.getCodigo().equalsIgnoreCase(codigo)).findFirst();
    }

    public void ordenarPorPrecioDesc(){
        productos.sort(Comparator.comparingDouble(Producto::getPrecio).reversed());
    }

    public List<Producto> getProductosPorCondicion(BiPredicate<Producto, Double> condicion, double param){
        return productos.stream().filter(item -> condicion.test(item, param)).toList();
    }
}
