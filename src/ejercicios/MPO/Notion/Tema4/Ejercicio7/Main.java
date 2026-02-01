package ejercicios.MPO.Notion.Tema4.Ejercicio7;

import ejercicios.MPO.Notion.Tema4.Ejercicio7.model.Producto;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Main {
    static void main(String[] args) {
        /*
        **Ejercicio 7 - BiFunction con Objetos: Gestión de Productos**

        Crea una clase Producto con nombre y precio. Implementa una BiFunction que reciba dos Productos y devuelva el producto con mayor precio. Pruébala con una lista de al menos 5 productos.
         */

        ArrayList<Producto> listaProductos = new ArrayList<>(
                List.of(
                        new Producto("Camiseta", 5.55),
                        new Producto("Sudadera", 18.55),
                        new Producto("Mochila", 27.55),
                        new Producto("Pantalones", 33.55),
                        new Producto("Chaqueta", 42.55)
                )
        );

        BiFunction<Producto, Producto, Producto> prodMasCaro = (item1, item2) -> item1.getPrecio() >= item2.getPrecio()?item1:item2;


        Producto productoMasCaro = listaProductos.get(0);

        for (int i = 1; i < listaProductos.size(); i++) {
            productoMasCaro = prodMasCaro.apply(productoMasCaro, listaProductos.get(i));
        }

        System.out.println("El producto más caro es "+ productoMasCaro.getNombre() + ", con un valor de "+productoMasCaro.getPrecio()+"€.");


    }
}
