package Ejercicio1.controller;

import Ejercicio1.model.UserRespuesta;
import tools.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class GestorJSON {
    private String urlBase = "https://randomuser.me/api/";

    public void lecturaJSON(){
        ObjectMapper mapper = new ObjectMapper();
        UserRespuesta respuesta = null;

        try{
            respuesta = mapper.readValue(new URL(urlBase).openStream(), UserRespuesta.class);
            respuesta.mostrarDatos();
        } catch (MalformedURLException e) {
            System.out.println("Esto no es una URL.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
