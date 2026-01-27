package ejercicios.Entornos.problema;

import ejercicios.Entornos.problema.controller.Tienda;
import ejercicios.Entornos.problema.model.Producto;

import java.util.Scanner;

public class Main {

    static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        // Inicialización Controlador
        Tienda tienda = new Tienda();

        // Inicialización Productos en Tienda
        tienda.addProducto(new Producto("Camiseta", 12.99, 10));
        tienda.addProducto(new Producto("Sudadera", 29.99, 5));
        tienda.addProducto(new Producto("Gorra", 9.99, 20));

        // Inicialización Variables
        int opcion = 0;

        do{

        }while(opcion!=6);
    }

}
