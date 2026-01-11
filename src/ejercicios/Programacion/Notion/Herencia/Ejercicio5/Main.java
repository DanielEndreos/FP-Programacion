package ejercicios.Programacion.Notion.Herencia.Ejercicio5;

import ejercicios.Programacion.Notion.Herencia.Ejercicio5.model.Desarrollador;
import ejercicios.Programacion.Notion.Herencia.Ejercicio5.model.Gerente;

public class Main {
    static void main(String[] args) {

        /*
        Crea una clase Empleado con atributos nombre y salarioBase.
        Crea dos clases hijas: Gerente (con atributo bonus) y Desarrollador
        (con atributo lenguajePrincipal). Implementa un método calcularSalarioTotal()
        en Gerente que sume el bonus al salario base. Crea objetos de ambos tipos y
        muestra su información completa.

        Ejemplo de salida por consola:
            Empleado: Ana García
            Puesto: Gerente
            Salario base: 40000.0€
            Bonus: 10000.0€
            Salario total: 50000.0€

            Empleado: Luis Martínez
            Puesto: Desarrollador
            Salario base: 35000.0€
            Lenguaje principal: Java
         */

        Gerente gerente = new Gerente("Ana García", 40000.0,10000.0);
        Desarrollador desarrollador = new Desarrollador("Luis Martínez", 35000.0,"Java");

        System.out.println(gerente);
        System.out.println(" ");
        System.out.println(desarrollador);
    }
}
