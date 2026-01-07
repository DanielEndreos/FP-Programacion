package ejercicios.Programacion.Notion.POO.Ejercicio8;

import ejercicios.Programacion.Notion.POO.Ejercicio8.model.Empleado;

import javax.sql.rowset.Predicate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        // Crea una clase Empleado con atributos nombre, puesto y salario. En el metodo main, crea
        // un array de 5 empleados, inicialízalos con datos y luego muestra: todos los empleados, el
        // empleado con mayor salario y el salario promedio.

        // Ejemplo de salida por consola:
        //
        // Lista de empleados:
        // 1. Ana Pérez - Desarrolladora - 35000.0€
        // 2. Luis García - Diseñador - 28000.0€
        // 3. María Torres - Project Manager - 42000.0€
        // 4. Jorge Díaz - Analista - 32000.0€
        // 5. Laura Sánchez - Tester - 26000.0€

        // Empleado con mayor salario: María Torres (42000.0€)
        // Salario promedio: 32600.0€

        Scanner scn = new Scanner (System.in);
        ArrayList<Empleado> empleados = new ArrayList<>();

        empleados.add(new Empleado("Ana Pérez", "Desarrolladora", 35000.0));
        empleados.add(new Empleado("Luis García", "Diseñador", 28000.0));
        empleados.add(new Empleado("María Torres", "Project Manager", 42000.0));
        empleados.add(new Empleado("Jorge Díaz", "Analista", 32000.0));
        empleados.add(new Empleado("Laura Sánchez", "Tester", 26000.0));


        System.out.println("Lista de empleados: ");
        for (int i = 0; i < empleados.size(); i++) {
            System.out.printf("%d. %s\n", i+1,empleados.get(i));
        }

        System.out.println("");

        //Empleado con mayor salario
        int posicion = 0;
        double salario = 0.0;
        double promedio = 0.0;
        for (int i = 0; i < empleados.size(); i++) {
             if (empleados.get(i).getSalario()>salario){
                posicion = i;
                salario = empleados.get(i).getSalario();
            }
            promedio += empleados.get(i).getSalario();
        }

        promedio /= empleados.size();

        System.out.printf("Empleado con mayor salario: %s (%.1f€)\n", empleados.get(posicion).getNombre(), empleados.get(posicion).getSalario());
        System.out.printf("Salario promedio: %.1f€", promedio);
    }
}
