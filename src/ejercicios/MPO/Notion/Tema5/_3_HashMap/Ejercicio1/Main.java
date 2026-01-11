package ejercicios.MPO.Notion.Tema5._3_HashMap.Ejercicio1;

import ejercicios.MPO.Notion.Tema5._3_HashMap.Ejercicio1.model.Agenda;

public class Main {
    static void main(String[] args) {

        /*
        Objetivo:
        Crear un programa que gestione una agenda de contactos
        usando un HashMap donde la clave sea el nombre y el valor
        sea el número de teléfono.

        Requisitos:

        1. Crear un HashMap<String, String> para almacenar contactos
        (nombre como clave, teléfono como valor).

        2. Crear metodo: void agregarContacto(String nombre, String telefono)
           que añada o actualice un contacto.

        3. Crear metodo: String buscarContacto(String nombre)
           que devuelva el teléfono del contacto o un mensaje si no existe.

        4. Crear metodo: boolean eliminarContacto(String nombre)
           que elimine un contacto si existe.

        5. Crear metodo: void listarContactos()
           que muestre todos los contactos en la agenda.

        6. Crear metodo: int contarContactos()
           que devuelva el número total de contactos.

        7. Crear metodo: boolean existeContacto(String nombre)
           que verifique si un contacto existe.

        8. En el main, crear una agenda, añadir varios contactos, buscar, eliminar y listar.


        Ejemplo de salida:

        Agenda de Contactos
        ===================

        Agregando contactos...
        Contacto agregado: Ana - 666123456
        Contacto agregado: Carlos - 666789012
        Contacto agregado: María - 666345678

        Total de contactos: 3

        Buscando a Ana...
        Teléfono de Ana: 666123456

        Listado de contactos:
        - Ana: 666123456
        - Carlos: 666789012
        - María: 666345678

        Eliminando contacto Carlos...
        Contacto eliminado exitosamente.

        Total de contactos: 2

         */

        Agenda agenda = new Agenda();

        System.out.println("Agenda de contactos");
        System.out.println("===================");

        System.out.println("Agregando Contactos...");
        agenda.agregarContacto("Ana","666123456");
        agenda.agregarContacto("Carlos","666789012");
        agenda.agregarContacto("María","666345678");
        System.out.println(" ");
        agenda.contarContactos();

        System.out.println(" ");
        System.out.println(agenda.buscarContacto("Ana"));

        System.out.println(" ");
        agenda.listarContactos();

        System.out.println(" ");
        agenda.eliminarContacto("Carlos");

        System.out.println(" ");
        agenda.contarContactos();

        System.out.println(" ");
        System.out.println("Buscando a Daniel");
        System.out.println(agenda.existeContacto("Daniel")?"Existe el contacto":"No existe el contacto");

    }
}
