package ejercicios.MPO.Notion.Tema5._3_HashMap.Ejercicio1.model;

import java.util.HashMap;
import java.util.Set;

public class Agenda {
    public HashMap<String, String> listaContactos;

    public Agenda (){
        listaContactos = new HashMap<>();
    }

    public void agregarContacto(String nombre, String telefono){
        String value =listaContactos.put(nombre, telefono);
        if ( value == (null)){
            System.out.printf("Contacto agregado: %s - %s\n", nombre, telefono);
        } else {
            System.out.printf("Contacto actualizado: %s - %s se actualiza por %s\n", nombre, value, telefono);
        }
    }

    public String buscarContacto(String nombre){
        System.out.printf("Buscando a %s\n", nombre);
        return listaContactos.get(nombre).equals(null)?"Contacto no encontrado":"Teléfono de "+nombre+": "+listaContactos.get(nombre);
    }

    public boolean eliminarContacto(String nombre){
            String value = listaContactos.remove(nombre);
            if ( value == null){
                System.out.printf("El contacto %s no existe.", nombre);
                return false;
            } else {
                System.out.printf("Eliminando contacto %s\n", nombre);
                System.out.println("Contacto eliminado exitosamente.");
                return true;
            }
    }

    public void listarContactos(){
        System.out.println("Listado de contactos: ");
        Set<String> claves = listaContactos.keySet();

        for (String s: claves){
            System.out.println("- " +s+": "+listaContactos.get(s));
        }
    }

    public void contarContactos(){
        System.out.printf("Total de contactos: %d\n",listaContactos.size());
    }

    public boolean existeContacto(String nombre){
        if (listaContactos.get(nombre) == null){
            return false;
        } else {
            return true;
        }
    }
}