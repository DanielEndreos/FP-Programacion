package ejercicios.MPO.Notion.Tema5._3_HashMap.Ejercicio4;

import ejercicios.MPO.Notion.Tema5._3_HashMap.Ejercicio4.model.Calificador;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    static void main(String[] args) {
        /*
        Objetivo: Crear un sistema que gestione las calificaciones de estudiantes usando un
        HashMap donde la clave sea el nombre del estudiante y el valor sea un ArrayList de
        calificaciones.

        Requisitos:

        1. Crear un HashMap<String, ArrayList<Double>> para almacenar
           estudiantes y sus calificaciones.

        2. Crear metodo void agregarEstudiante(String nombre) que añada un estudiante
           con lista de calificaciones vacía.

        3. Crear metodo void agregarCalificacion(String nombre, double calificacion)
           que añada una calificación al estudiante.

        4. Crear metodo double calcularPromedio(String nombre) que calcule el promedio
           de calificaciones de un estudiante.

        5. Crear metodo void mostrarCalificaciones(String nombre) que muestre todas las
           calificaciones de un estudiante.

        6. Crear metodo String mejorEstudiante() que devuelva el nombre del estudiante
           con mejor promedio.

        7. Crear metodo void listarEstudiantesAprobados(double notaMinima) que muestre
           estudiantes con promedio mayor o igual a la nota mínima.

        8. Crear metodo double promedioGeneral() que calcule el promedio de todos los
           estudiantes.

        9. En el main, crear varios estudiantes, añadir calificaciones y generar reportes.


        EJEMPLO DE SALIDA:

        Sistema de Calificaciones
        =========================

        Agregando estudiantes...
        Estudiante agregado: Ana
        Estudiante agregado: Carlos
        Estudiante agregado: María

        Agregando calificaciones...
        Ana: [8.5, 9.0, 7.5]
        Carlos: [6.0, 7.0, 6.5]
        María: [9.5, 9.0, 10.0]

        Promedios:
        - Ana: 8.33
        - Carlos: 6.50
        - María: 9.50

        Mejor estudiante: María (9.50)

        Estudiantes aprobados (nota mínima 7.0):
        - Ana: 8.33
        - María: 9.50

        Promedio general de la clase: 8.11

         */

        Calificador cal = new Calificador();

        cal.agregarEstudiante("Ana");
        cal.agregarEstudiante("Carlos");
        cal.agregarEstudiante("María");

        System.out.println("Agregando calificaciones...");
        cal.agregarCalificacion("Ana", 8.5);
        cal.agregarCalificacion("Ana", 9.0);
        cal.agregarCalificacion("Ana", 7.5);
        cal.agregarCalificacion("Carlos", 6.0);
        cal.agregarCalificacion("Carlos", 7.0);
        cal.agregarCalificacion("Carlos", 6.5);
        cal.agregarCalificacion("María", 9.5);
        cal.agregarCalificacion("María", 9.0);
        cal.agregarCalificacion("María", 10.0);

        cal.mostrarCalificaciones("Ana");
        cal.mostrarCalificaciones("Carlos");
        cal.mostrarCalificaciones("María");


        System.out.println("\nPromedios:");
        System.out.printf("- Ana: %.2f\n", cal.calcularPromedio("Ana"));
        System.out.printf("- Carlos: %.2f\n", cal.calcularPromedio("Carlos"));
        System.out.printf("- María: %.2f\n", cal.calcularPromedio("María"));

        System.out.println("");
        System.out.printf("Mejor estudiante: %s (%.2f)\n", cal.mejorEstudiante(), cal.calcularPromedio(cal.mejorEstudiante()));

        System.out.println("");
        cal.listarEstudiantesAprobados(7.0);

        System.out.println("");
        System.out.printf("%.2f",cal.promedioGeneral());
    }


}
