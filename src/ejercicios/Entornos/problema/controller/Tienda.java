package ejercicios.Entornos.problema.controller;

import ejercicios.Entornos.problema.model.Producto;

import java.util.HashMap;

public class Tienda {

    private HashMap<String, Producto> itemsTienda;

    public Tienda(){
        itemsTienda = new HashMap<>();
    }

    public void mostrarMenu(){

        System.out.println("""
                Lista de Opciones
                1. Ver 
                2. Comprar
                3. Añadir
                4. Buscar
                5. Informe
                6. Salir
                """);

    }

   public void addProducto(Producto producto){
        itemsTienda.put(producto.getNombre(), producto);
   }

}
