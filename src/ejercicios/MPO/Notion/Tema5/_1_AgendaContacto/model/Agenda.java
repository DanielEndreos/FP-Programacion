package ejercicios.MPO.Notion.Tema5._1_AgendaContacto.model;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class Agenda {
    private Scanner scn;
    private ArrayList<Contacto> agenda;

    public Agenda(Scanner scn){
        this.agenda = new ArrayList<>();
        this.scn = scn;
    }

    public void addContacto(){

        System.out.print("\nIntroduce el nombre: ");
        String nombre = scn.next();
        System.out.print("Introduce el apellido: ");
        String apellido = scn.next();
        System.out.print("Introduce el teléfono: ");
        int telefono = scn.nextInt();
        System.out.print("Introduce el DNI: ");
        String dni = scn.next();
        System.out.print("Introduce el Email: ");
        String email = scn.next();

        if ((busquedaDNI(dni)==-1) && (busquedaEmail(email)==-1)){
            agenda.add(new Contacto(nombre, apellido, dni, email, telefono));
            System.out.println("Persona agregada correctamente.");
        }else{
            System.out.println("La persona ya existe en la agenda.");
        }
    }
    public void buscarContacto(){

        System.out.print("\nIntroduce el DNI a buscar: ");
        String dniBusq = scn.next();
        int posicion = busquedaDNI(dniBusq);

        if (posicion == -1){
            comprobarParecidos(dniBusq);
        } else{
            System.out.println("\nPersona encontrada: ");
            System.out.println(agenda.get(posicion));
        }
    }
    public void eliminarContacto(){

        System.out.print("\nIntroduce el DNI a borrar: ");
        String dniRemove = scn.next();

        boolean eliminado = agenda.removeIf(new Predicate<Contacto>() {
            @Override
            public boolean test(Contacto contacto) {
                return contacto.getDni().equals(dniRemove);
            }
        });

        if (eliminado){
            System.out.println("Persona eliminada correctamente.");
        } else {
            comprobarParecidos(dniRemove);
        }
    }
    public void listarContactos(){

        if (agenda.size()!=0){
            System.out.println("\nLista de personas:");
            for (Contacto contactoAgenda : agenda) {
                System.out.printf("%s -> %s\n", agenda.indexOf(contactoAgenda), contactoAgenda.toString() );
            }
        }else{
            System.out.println("\nNo hay personas en la agenda.");
        }
    }

    private int busquedaDNI(String iDniBusq){
        for (int i = 0; i < agenda.size(); i++) {
            if (agenda.get(i).getDni().equals(iDniBusq)){
                return i;
            };
        }
        return -1;
    }
    private int busquedaEmail(String email){
        for (int i = 0; i < agenda.size(); i++) {
            if (agenda.get(i).getEmail().equals(email)){
                return i;
            };
        }
        return -1;
    }
    private void comprobarParecidos(String iDNI){
        boolean existe = false;
        for (int i = 0; i < agenda.size(); i++) {
            if(agenda.get(i).getDni().contains(iDNI)){
                existe = true;
                break;
            }
        }

        if (existe){
            System.out.println("No se ha encontrado el usuario. ");
            System.out.printf("Existen usuarios que contienen '%s': \n",iDNI);
            for (int i = 0; i < agenda.size(); i++) {
                if(agenda.get(i).getDni().contains(iDNI)){
                    System.out.printf("%s -> %s\n", agenda.indexOf(agenda.get(i)), agenda.get(i).toString());
                }
            }
        } else {
            System.out.println("Persona no encontrada.");
        }

    }


}
