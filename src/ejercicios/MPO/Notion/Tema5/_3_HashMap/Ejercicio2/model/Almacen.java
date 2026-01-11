package ejercicios.MPO.Notion.Tema5._3_HashMap.Ejercicio2.model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Almacen {
    HashMap<String, Integer> almacen;

    public Almacen (){
        almacen = new HashMap<>();
    }

    public void agregarProducto(String codigo, int cantidad){
        System.out.println("Producto " + codigo+": "+cantidad+" unidades");
        almacen.put(codigo, cantidad);
    }

    public boolean venderProducto(String codigo, int cantidad){
        int cantidadExistente = almacen.get(codigo);
        System.out.println("Venta de "+cantidad+" unidades de "+codigo);
        if (cantidad <= cantidadExistente){
            almacen.put(codigo, (cantidadExistente-cantidad));
            System.out.println("Venta realizada. Stock restante: "+almacen.get(codigo));
            return true;
        } else {
            return false;
        }
    }

    public Integer consultarStock(String codigo){
        if (almacen.get(codigo) == null){
            return null;
        } else {
            return almacen.get(codigo);
        }
    }

    public void listarInventario(){
        Set<String> listadoKeys = almacen.keySet();

        System.out.println("Inventario completo:");
        for (String s : listadoKeys){
            System.out.println("- "+s+": "+almacen.get(s)+" unidades");
        }
    }

    public void listarProductosBajoStock(int minimo){
        System.out.println("Productos con stock bajo (menos de "+minimo+" unidades):");
        Set<String> listadoKeys = almacen.keySet();

        for (String s : listadoKeys){
            if (almacen.get(s)<minimo){
                System.out.println("- "+s+": "+almacen.get(s)+" unidades");

            }
        }
    }

    public int calcularStockTotal(){
        Set<String> listadoKeys = almacen.keySet();

        int cantidad = 0;
        for (String s : listadoKeys){
            cantidad += almacen.get(s);
        }
    return cantidad;
    }

    public String productoConMasStock(){
        Set<String> listadoKeys = almacen.keySet();

        String key ="";
        int valorMax = 0;
        for (String s : listadoKeys){
            if (almacen.get(s)>valorMax){
                valorMax = almacen.get(s);
                key = s;
            }
        }
        return "Producto con más stock: "+ key + " ("+ almacen.get(key) +" unidades)";
    }
}
