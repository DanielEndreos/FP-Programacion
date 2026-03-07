package controller;

import model.*;
import tools.jackson.databind.ObjectMapper;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class GestorFicheros {

    private String urlBase = "https://dummyjson.com/products/";

    public void exportarXML(){
        Agenda agenda = new Agenda();
        agenda.getLista().add(new Usuario(1,"Borja1","Martin1", new Direccion("Madrid1", "Madrid", "Madrid"), "123123A", 41));
        agenda.getLista().add(new Usuario(2,"Borja2","Martin2", new Direccion("Madrid2", "Madrid", "Madrid"), "223123A", 42));
        agenda.getLista().add(new Usuario(3,"Borja3","Martin3", new Direccion("Madrid3", "Madrid", "Madrid"), "323123A", 43));
        agenda.getLista().add(new Usuario(4,"Borja4","Martin4", new Direccion("Madrid4", "Madrid", "Madrid"), "423123A", 44));
        agenda.getLista().add(new Usuario(5,"Borja5","Martin5", new Direccion("Madrid5", "Madrid", "Madrid"), "523123A", 45));
        agenda.getLista().add(new Usuario(6,"Borja6","Martin6", new Direccion("Madrid6", "Madrid", "Madrid"), "523123A", 45));
        agenda.getLista().add(new Usuario(7,"Borja7","Martin7", new Direccion("Madrid7", "Madrid", "Madrid"), "523123A", 45));
        agenda.getLista().add(new Usuario(8,"Borja8","Martin8", new Direccion("Madrid8", "Madrid", "Madrid"), "523123A", 45));
        agenda.getLista().add(new Usuario(9,"Borja9","Martin9", new Direccion("Madrid9", "Madrid", "Madrid"), "523123A", 45));

        try {
            JAXBContext context = JAXBContext.newInstance(Agenda.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.marshal(agenda, new File("Clase_XML/src/main/java/ficheros/usuarios.xml"));
        } catch (JAXBException e) {
            System.out.println("Error en la codificación del fichero XML");
            System.out.println(e.getMessage());
        }

    }

    public void importarXML(){
        try {
            JAXBContext context = JAXBContext.newInstance(Agenda.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            Agenda respuesta = (Agenda) unmarshaller.unmarshal(new File("Clase_XML/src/main/java/ficheros/usuarios.xml"));

            respuesta.getLista().forEach(Usuario::mostrarDatos);
        } catch (JAXBException e) {
            System.out.println("Error en la traducción XML -> JAVA");
        } catch (ClassCastException e){
            System.out.println("Clase incompatible");
            System.out.println(e.getMessage());
        }
    }

    public void lecturaJSON(){
        ObjectMapper mapper = new ObjectMapper();
        ProductosRespuesta respuesta = null;

        try {
            respuesta = mapper.readValue(new URL(urlBase).openStream(), ProductosRespuesta.class);
        } catch (MalformedURLException e) {
            System.out.println("Esto no es una URL.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        respuesta.getProducts().forEach(Producto::mostrarDatos);
    }
}
