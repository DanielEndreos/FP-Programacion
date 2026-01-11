package ejercicios.Programacion.Notion.POO.Ejercicio11.model;

import java.util.ArrayList;

public class Carrito {
    private Producto producto;
    private static ArrayList<Object[]> listaProductos = new ArrayList<>();

    public static void addToCarrito(Producto producto, int cantidad){
        if(producto.getStock()>0 && cantidad <= producto.getStock()){
            System.out.printf("Añadiendo %s x%d al carrito...✓\n",producto, cantidad);
            listaProductos.add(new Object[]{producto, cantidad});
        }else if (cantidad == 0){
            System.out.printf("No se puede añadir 0 objetos al carrito...✗\n",producto, cantidad);
        }else{
            System.out.printf("No existen unidades suficientes del producto '%s'...✗\n",producto.getNombre());
        }
    }

    public static void rmvFromCarrito(Producto producto){
        boolean eliminado = listaProductos.removeIf(objects -> ((Producto)objects[0]).getNombre().equals(producto.getNombre()));
        if (eliminado){
            System.out.printf("\nEliminando %s del carrito...✓\n",producto.getNombre());
        } else{
            System.out.printf("\nEl producto '%s' no se encuentra en la lista, por lo que no puede ser eliminado.\n", producto.getNombre());
        }

    }

    public static void verCarrito(){
        System.out.println("\n--- CARRITO DE COMPRA ---");
        double precioTotal = 0.0;
        for (int i = 0; i < listaProductos.size(); i++) {
            Producto producto = (Producto) listaProductos.get(i)[0];
            System.out.printf("%d. %s x%d - %.2f€\n",i+1, producto.getNombre(), (int)listaProductos.get(i)[1], producto.getPrecio() );
            precioTotal += producto.getPrecio()*(int)listaProductos.get(i)[1];
        }
        System.out.printf("Total: %.2f\n", precioTotal);
    }

    public static void finalizarCompra(){
        System.out.println("\nFinalizando compra...");
        System.out.println("✓ Compra realizada con éxito");
        listaProductos.forEach(objects -> ((Producto)objects[0]).setStock( ((Producto) objects[0]).getStock() - ((int)objects[1])  ));
        listaProductos.clear();
        System.out.println("Stock actualizado.");
    }

}
