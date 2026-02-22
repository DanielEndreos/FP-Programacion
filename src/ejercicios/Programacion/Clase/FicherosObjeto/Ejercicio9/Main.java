package ejercicios.Programacion.Clase.FicherosObjeto.Ejercicio9;

import ejercicios.Programacion.Clase.FicherosObjeto.Ejercicio9.controller.Gestor;
import ejercicios.Programacion.Clase.FicherosObjeto.Ejercicio9.controller.Operaciones;
import ejercicios.Programacion.Clase.FicherosObjeto.Ejercicio9.model.Usuario;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        ## Ejercicio 9: Agenda

        Crea una aplicación que permita gestionar una agenda de contactos.
        Para ello crea una clase Usuario que tenga las características: nombre, apellido, dni.
        Además de esta clase, crea un main que permita gestionar los usuarios, con las siguientes opciones:

        1. Agregar usuario: pedirá por consola todos los datos
        2. Listar usuarios: mostrará por consola todos los usuarios del sistema
        3. Exportar usuarios: guardará en un fichero .txt todos los usurios de la lista
         */

        Scanner scn = new Scanner(System.in);
        Gestor gestor = new Gestor();
        Operaciones operaciones = new Operaciones();

        operaciones.escribirObjeto("src/ejercicios/Programacion/Clase/FicherosObjeto/Ejercicio9/resources/objetos.dat");



/*
        int opcion=-1;
        do {
            System.out.print("""
                    Menú:
                    ---------------------
                    1. Añadir Usuario
                    2. Listar Usuarios
                    3. Exportar Usuarios
                    4. Importar Usuarios (sobrescribir)
                    ---------------------
                    ¿Que opción quieres utilizar? """);
            try {
                opcion = scn.nextInt();
                System.out.println("");
            } catch (InputMismatchException e) {
                opcion = -1;
            }
            switch (opcion){
                case 1->{
                    System.out.print("Indica nombre: ");
                    String nombre = scn.next();
                    System.out.print("Indica apellido: ");
                    String apellido = scn.next();
                    System.out.print("Indica dni: ");
                    String dni = scn.next();
                    gestor.addUsuario(new Usuario(nombre, apellido, dni));
                }
                case 2->{gestor.listarUsuarios();}
                case 3->{gestor.exportar();}
                case 4->{gestor.importar();}
                default -> {
                    System.out.println("Caso no contemplado.");
                    scn = new Scanner(System.in);
                }
            }

        }while(opcion!=5);
*/
    }
}
