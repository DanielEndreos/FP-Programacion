package Ejercicio2.controller;

import Ejercicio2.model.Product;
import Ejercicio2.model.ProductList;
import tools.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class GestorJSON {

    private String url = "https://dummyjson.com/products?limit=5";

    public void leerJSON(){
        ObjectMapper mapper = new ObjectMapper();
        ProductList result = null;
        try {
            result = mapper.readValue(new URL(url).openStream(), ProductList.class);
            result.getProducts().forEach(Product::mostrarDatos);
        } catch (MalformedURLException e) {
            System.out.println("Esto no es una URL.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
