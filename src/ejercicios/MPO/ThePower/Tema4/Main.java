package ejercicios.MPO.ThePower.Tema4;

import ejercicios.MPO.ThePower.Tema4.Ejercicio1_TiendaOnline.controller.GestorProductos;
import ejercicios.MPO.ThePower.Tema4.Ejercicio1_TiendaOnline.model.Producto;

import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;

public class Main {
    /*
    Desarrolla una aplicación de consola en Java para gestionar los productos de una tienda online
    pero solo utilizando funciones lamda, métodos de acceso directo y bipredicate.
    Cada producto debe tener: nombre (String), categoria (String), codigo (String, único),
    precio (double)
    Los requisitos de la aplicación son los siguientes:

    Clase Producto
        • Atributos privados para todos los campos
        • Constructores:
            o Vacío
            o Completo (todos los parámetros)
            o Sin precio (inicialízalo a 1)
        • Metodo void mostrarDatos() que imprima toda la información
        • Getters y setters completos

    Clase GestorProductos
    Gestiona una lista de productos con estos métodos exactos:
        1. void agregarProducto(Producto p): Solo agrega si el código NO existe ya en la lista
        2. void asignarPrecios(): Asigna precios aleatorios (1-100) a productos sin precio (precio <
        0)
        3. void mostrarProductos(): Muestra todos los productos de la lista
        4. double calcularPrecioMedio(): Devuelve el precio medio de todos los productos
        5. long getNumeroProductosCaros(double limite): Cuenta productos con precio ≥ límite
        6. List<Producto> getProductosCaros(double limite): Devuelve lista de productos con
        precio > límite
        7. Optional<Producto> buscarPorCodigo(String codigo): Devuelve el producto si existe
        (Optional vacío si no)
        8. void ordenarPorPrecioDesc(): Ordena la lista por precio de mayor a menor
        9. List<Producto> getProductosPorCondicion(BiPredicate<Producto,Double> condicion,
        double valor): Devuelve productos según el criterio pasado

    Clase Main
        • Crea un GestorProductos
        • Agrega varios productos de prueba (algunos con precio, otros sin precio)
        • Busca productos por código usando:
            o ifPresent() para mostrar datos si existe
            o ifPresentOrElse() para buscar/crear si no existe
        • Asigna precios, ordena por precio descendente y muestra la lista
        • Prueba getProductosPorCondicion() con distintos criterios de precio
     */

    static void main(String[] args) {

        GestorProductos gp = new GestorProductos();

        gp.agregarProducto(new Producto("Camiseta", "Ropa", "00001", 10.02 ));
        gp.agregarProducto(new Producto("Pantalón", "Ropa", "00002", 29.95));
        gp.agregarProducto(new Producto("Zapatillas", "Calzado", "00003", 79.99));
        gp.agregarProducto(new Producto("Gorra", "Accesorios", "00004"));
        gp.agregarProducto(new Producto("Calcetines", "Ropa", "00005", 5.50));
        gp.agregarProducto(new Producto("Mochila", "Accesorios", "00006"));
        gp.agregarProducto(new Producto("Chaqueta", "Ropa", "00007", 119.00));
        gp.agregarProducto(new Producto("Cinturón", "Accesorios", "00008"));
        gp.agregarProducto(new Producto("Sudadera", "Ropa", "00009", 49.90));
        gp.agregarProducto(new Producto("Botas", "Calzado", "00010"));
        gp.agregarProducto(new Producto("Bufanda", "Accesorios", "00011", 14.75));
        gp.agregarProducto(new Producto("Camiseta", "Ropa", "00001", 10.02 ));

        gp.asignarPrecios();
        System.out.printf("El precio medio es: %.2f\n",gp.calcularPrecioMedio());

        System.out.println("\n");
        gp.mostrarProductos();
        System.out.printf("Hay %d productos con un precio superior a 20€.\n",gp.getNumeroProductosCaros(20.0) );

        System.out.println("\n");
        System.out.println("Productos más caros (>80€):");
        List<Producto> caros = gp.getProductosCaros(80);
        caros.forEach(Producto::mostrarDatos);

        System.out.println("\n");
        System.out.println("Buscar producto con codigo '0003'");
        Optional buscado = gp.buscarPorCodigo("00003");
        buscado.ifPresent(o -> {
            System.out.print("Producto encontrado: ");
            if (o instanceof Producto){
                ((Producto) o).mostrarDatos();
            }
        });

        System.out.println("Ordenar y mostrar:");
        gp.ordenarProPrecioDesc();
        gp.mostrarProductos();

        System.out.println("\n");
        List<Producto> listaFiltrada = gp.getProductosPorCondicion((prod, precio ) -> prod.getPrecio()<precio , 20.0);
        listaFiltrada.forEach(Producto::mostrarDatos);

        System.out.println("\n");
        listaFiltrada = gp.getProductosPorCondicion((prod, precio ) -> prod.getPrecio()>=precio , 45.0);
        listaFiltrada.forEach(Producto::mostrarDatos);
    }
}
