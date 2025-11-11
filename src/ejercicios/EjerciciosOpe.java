package ejercicios;

import enums.CateogriaPlato;
import enums.Moneda;

import java.util.Scanner;

public class EjerciciosOpe {

    public void ejercicioOpe1Scanner (Scanner scn){
        //Crear un programa que convierta una calificación numérica (0-10)
        //en su equivalente alfabético usando un switch.
        //Requisitos:
        //Declara una variable double calificacion con un valor entre 0 y 10.
        //Usa un switch para convertir la calificación a una letra (A, B, C, D, F).
        //Considera: 9-10 = A, 7-8.9 = B, 5-6.9 = C, 4-4.9 = D, 0-3.9 = F
        //Muestra un mensaje apropiado para cada calificación.


    }

    public void ejercicioOpe2(Scanner scn){
        //Crear un programa que convierta una cantidad en euros a otras monedas según la opción seleccionada.
        //Crea un enum Moneda con: DOLAR, LIBRA, YEN, PESO.
        //Declara una variable double euros con una cantidad.
        //Usa un switch con el enum para aplicar la tasa de conversión correspondiente.
        //Muestra el resultado de la conversión.

        System.out.print("Introduce una cantidad en €: ");
        double euros = scn.nextDouble();

        System.out.print("¿A que moneda quieres convertirlo?: ");
        String moneda = scn.next().toUpperCase();

        switch (Moneda.valueOf(moneda)){
            case YEN -> {System.out.printf("El cambio de %.1f€ a %s es %.1f¥.", euros, moneda, euros*Moneda.valueOf(moneda).getValorMoneda());}
            case PESO ->{System.out.printf("El cambio de %.1f€ a %s es %.1f$ (peso).", euros, moneda, euros*Moneda.valueOf(moneda).getValorMoneda());}
            case DOLAR -> {System.out.printf("El cambio de %.1f€ a %s es %.1f$.", euros, moneda, euros*Moneda.valueOf(moneda).getValorMoneda());}
            case LIBRA -> {System.out.printf("El cambio de %.1f€ a %s es %.1f£.", euros, moneda, euros*Moneda.valueOf(moneda).getValorMoneda());}
        }
    }

    public void ejercicioOpe3(Scanner scn){
        //Crear un programa que clasifique la temperatura en categorías usando rangos.
        //Requisitos:
        // 1. Declara una variable int temperatura en grados Celsius.
        // 2. Usa Switch(true) para clasificar la temperatura en: Helado(<0), Frío(0-15), Templado(16-25), Calor(26-35), Muy Caliente(>35).
        // 3. Muestra un mensaje descriptivo y una recomendación de vestimenta




    } //TODO

    public void ejercicioOpe4(Scanner scn){
        //Simular un sistema de pedidos de restaurante con diferentes categorías.
        //Requisitos:
        // 1. Crea un enum CateogriaPlato con: ENTRADA, PRINCIPAL, POSTRE, BEBIDA.
        // 2. Declara una variable del tipo enum.
        // 3. Usa un switch para mostrar 3 opciones disponibles de cada categoría.
        // 4. Agrupa categorías similares si es apropiado.

        System.out.print("¿Que quieres saber del menú (Entrada / Principal / Bebida / Postre? ");
        String categoria = scn.next().toUpperCase();

    switch(CateogriaPlato.valueOf(categoria)){
        case ENTRADA -> {
            System.out.println("Croquetas de Jamón");
            System.out.println("Croquetas de Salmón");
            System.out.println("Croquetas de Bacalao");
        }
        case PRINCIPAL -> {
            System.out.println("Paella");
            System.out.println("Canelones");
            System.out.println("Arroz al Horno");
        }
        case BEBIDA -> {
            System.out.println("Coca-Cola");
            System.out.println("Pepsi");
            System.out.println("Agua");
        }
        case POSTRE -> {
            System.out.println("Crema Catalana");
            System.out.println("Helado de Coco");
            System.out.println("Brownie de Chocolate");
        }

    }


    }

    public void ejercicioOpe5(Scanner scn) {
        //Crear una calculadora simple que realice operaciones según un operador.
        //Requisitos:
        // 1. Declara dos variables double num1 y double num2.
        // 2. Declara una variable char operador con valores posibles: '+','-','*','/'
        // 3. Usa un switch para realizar la operación correspondiente.
        // 4. Maneja el caso especial de división por cero.

        double num1 = 10;
        double num2 = 5.5;
        char operador = '*';

        switch (operador) {
            case '+' -> {System.out.printf("El valor de la suma de %.1f + %.1f, es %.1f", num1, num2, num1 + num2);}
            case '-' -> {System.out.printf("El valor de la suma de %.1f - %.1f, es %.1f", num1, num2, num1 - num2);}
            case '*' -> {System.out.printf("El valor de la suma de %.1f * %.1f, es %.1f", num1, num2, num1 * num2);}
            case '/' -> {
                if (num2 != 0) {
                    System.out.printf("El valor de la suma de %.1f / %.1f, es %.1f", num1, num2, num1 / num2);
                } else {
                    System.out.println("Un número no puede divirse entre 0.");
                }
            }
        }
    }

}
