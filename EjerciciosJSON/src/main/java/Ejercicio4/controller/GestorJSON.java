package Ejercicio4.controller;

import Ejercicio4.model.PostRespuesta;
import Ejercicio4.model.UserRespuesta;
import tools.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class GestorJSON {
    private String urlBase = "https://jsonplaceholder.typicode.com/";
    private String userID = "";

    public void leerJSON() {
        ObjectMapper mapper = new ObjectMapper();
        //1. Coger UserID

        try {
            PostRespuesta postRespuesta = mapper.readValue(new URL(urlBase + "posts/1").openStream(), PostRespuesta.class);

            userID = postRespuesta.getUserId();

            UserRespuesta userRespuesta = mapper.readValue(new URL(urlBase + "users/" + userID).openStream(), UserRespuesta.class);

            System.out.println("Título Post: " + postRespuesta.getTitle());
            System.out.println("Nombre: " + userRespuesta.getName());
            System.out.println("Ciudad: " + userRespuesta.getAddress().getCity());

        } catch (MalformedURLException e) {
            System.out.println("Esa URL no existe.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
