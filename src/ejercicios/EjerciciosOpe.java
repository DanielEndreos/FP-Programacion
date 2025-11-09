package ejercicios;

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


}
