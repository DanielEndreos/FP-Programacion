package ejercicios.MPO.Notion.Tema5._0_Agenda;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        /*
        Crear una agenda de personas gestionada por menú con operaciones básicas.

        Realizar una aplicación que gestione usuarios mediante arrays.
        Cada usuario: nombre (string), apellido (string), teléfono (int) y dni (string).
        Funcionalidad guiada por menú:
         */

        Scanner scn = new Scanner (System.in);
        ArrayList<Object[]> agenda = new ArrayList<>();
        int opcion = 0;

        do{
            System.out.print("""
                
                --- MENÚ AGENDA ---
                1. Agregar persona
                2. Buscar persona
                3. Borrar persona
                4. Listar personas
                5. Salir
                """);
            System.out.print("Seleccione una opción: ");
            opcion = scn.nextInt();

            switch (opcion){
                case 1 ->{addContacto(agenda, scn);}
                case 2 ->{buscarContacto(agenda, scn);}
                case 3 ->{eliminarContacto(agenda, scn);}
                case 4 ->{listarContactos(agenda);}
            };
        }while(opcion!=5);
    }

    public static void addContacto(ArrayList<Object[]> iAgenda, Scanner iScanner){
        Object[] contacto = new Object[4];

        System.out.print("\nIntroduce el nombre: ");
        contacto[0] = iScanner.next();
        System.out.print("Introduce el apellido: ");
        contacto[1] = iScanner.next();
        System.out.print("Introduce el teléfono: ");
        contacto[2] = iScanner.nextInt();
        System.out.print("Introduce el DNI: ");
        contacto[3] = iScanner.next();

        if (busqueda(iAgenda, (String)contacto[3])==-1){
            iAgenda.add(contacto);
            System.out.println("Persona agregada correctamente.");
        }else{
            System.out.println("La persona ya existe en la agenda.");
        }
    }
    public static void buscarContacto(ArrayList<Object[]> iAgenda, Scanner iScanner){

        System.out.print("\nIntroduce el DNI a buscar: ");
        String dniBusq = iScanner.next();
        int posicion = busqueda(iAgenda, dniBusq);

        if (posicion == -1){
            comprobarParecidos(iAgenda, dniBusq);
        } else{
            System.out.println("\nPersona encontrada: ");
            System.out.printf("Nombre: %s, Apellido: %s, Teléfono: %d\n", iAgenda.get(posicion)[0],iAgenda.get(posicion)[1],(int)iAgenda.get(posicion)[2]);
        }
    }
    public static int busqueda(ArrayList<Object[]> iAgenda, String iDniBusq ){
        for (int i = 0; i < iAgenda.size(); i++) {
            if (iAgenda.get(i)[3].equals(iDniBusq)){
                return i;
            };
        }
        return -1;
    }
    public static void eliminarContacto(ArrayList<Object[]> iAgenda, Scanner iScanner){

        System.out.print("\nIntroduce el DNI a borrar: ");
        String dniRemove = iScanner.next();

        boolean eliminado = iAgenda.removeIf(new Predicate<Object[]>() {
            @Override
            public boolean test(Object[] objects) {
                return objects[3].equals(dniRemove);
            }
        });

        if (eliminado){
            System.out.println("Persona eliminada correctamente.");
        } else {
            comprobarParecidos(iAgenda, dniRemove);
        }
    }
    public static void comprobarParecidos(ArrayList<Object[]> iAgenda, String iDNI){
        boolean existe = false;
        for (int i = 0; i < iAgenda.size(); i++) {
            if(iAgenda.get(i)[3].toString().contains(iDNI)){
                existe = true;
                break;
            }
        }

        if (existe){
            System.out.println("No se ha encontrado el usuario. ");
            System.out.printf("Existen usuarios que contienen '%s': \n",iDNI);
            for (int i = 0; i < iAgenda.size(); i++) {
                if(iAgenda.get(i)[3].toString().contains(iDNI)){
                    System.out.printf("%s -> Nombre: %s, Apellido: %s, Teléfono: %d, DNI: %s\n", iAgenda.indexOf(iAgenda.get(i)), iAgenda.get(i)[0],iAgenda.get(i)[1],(int)iAgenda.get(i)[2], iAgenda.get(i)[3] );
                }
            }
        } else {
            System.out.println("Persona no encontrada.");
        }

    }
    public static void listarContactos(ArrayList<Object[]> iAgenda){

        if (iAgenda.size()!=0){
            System.out.println("\nLista de personas:");
            for (Object[] contactoAgenda : iAgenda) {
                System.out.printf("%s -> Nombre: %s, Apellido: %s, Teléfono: %d, DNI: %s\n", iAgenda.indexOf(contactoAgenda), contactoAgenda[0],contactoAgenda[1],(int)contactoAgenda[2], contactoAgenda[3] );
            }
        }else{
            System.out.println("\nNo hay personas en la agenda.");
        }
    }

}
