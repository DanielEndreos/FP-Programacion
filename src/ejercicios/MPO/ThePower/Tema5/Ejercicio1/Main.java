package ejercicios.MPO.ThePower.Tema5.Ejercicio1;

import ejercicios.MPO.ThePower.Tema5.Ejercicio1.controller.GestorNotas;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        /*
        Realiza una aplicación para poder gestionar las notas de los alumnos de
        una asignatura. Para ello el sistema contará con un menú que permite la
        selección de la acción a realizar. Este menú contará con las siguientes
        opciones:
            a. Introducir alumno: el sistema pedirá dni, nombre, apellido y nota del
            alumno. en caso de una introducción incorrecta mostrará un
            mensaje de aviso. No se podrán meter dnis duplicados
            b. Buscar alumno nota: el sistema pedirá un dni y mostrará la nota de
            todos los alumnos con ese nombre
            c. Ver mejores expedientes: El sistema pedirá cuál es el límite de
            búsqueda y mostrará las n mejores notas
            d. Ver expedientes superiores a una nota: El sistema pedirá una nota y
            mostrará los expedientes con mínimo esa nota
            e. Vaciar lista
         */

        Scanner scn = new Scanner(System.in);
        GestorNotas gn = new GestorNotas(scn);

        gn.startGestor();


    }
}
