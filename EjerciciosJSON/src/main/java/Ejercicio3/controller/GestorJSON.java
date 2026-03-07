package Ejercicio3.controller;

import Ejercicio3.model.Producto;
import tools.jackson.databind.ObjectMapper;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class GestorJSON {

    private String urlBase = "https://dummyjson.com/products/";

    public void lecturaJSON(){
        Scanner scn = new Scanner(System.in);

        ObjectMapper mapper = new ObjectMapper();
        Producto respuesta = null;

        try {
            System.out.print("Introduce el ID del producto a buscar: ");
            String idProduct = scn.next();

            urlBase = urlBase + idProduct;

            respuesta = mapper.readValue(new URL(urlBase).openStream(), Producto.class);
            respuesta.mostrarDatos();
        } catch (MalformedURLException e) {
            System.out.println("La URL no es correcta.");
            System.out.println(e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println("Ese ID no existe.");
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("La URL no es correcta.");
            System.out.println(e.getMessage());
        }

    }
}
