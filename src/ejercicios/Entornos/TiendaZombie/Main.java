package ejercicios.Entornos.TiendaZombie;

import ejercicios.Entornos.TiendaZombie.controller.Tienda;
import ejercicios.Entornos.TiendaZombie.model.Producto;

import java.util.Scanner;

public class Main {

    static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        // Inicialización Controlador
        Tienda tienda = new Tienda(scn);

        // Inicialización Productos en Tienda
        tienda.addProductoAuto(new Producto("Camiseta", 12.99, 10));
        tienda.addProductoAuto(new Producto("Sudadera", 29.99, 5));
        tienda.addProductoAuto(new Producto("Gorra", 9.99, 20));

        menu:
        do{
            tienda.mostrarMenu();
            int opcion = scn.nextInt();

            switch (opcion){
                case 1 -> {tienda.mostrarProductos();}
                case 2 -> {tienda.comprarProducto();}
                case 3 -> {tienda.addProductoManual();}
                case 4 -> {tienda.buscarProducto();}
                case 5 -> {tienda.mostrarInforme();}
                case 6 -> {
                    System.out.println("Saliendo de la aplicación...");
                    break menu;}
                default -> { System.out.println("\nLa opción seleccionada no existe.\n");}
            }

        }while(true);
    }

}
