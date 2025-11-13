package ejercicios.Ejercicio1;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        /*1. Crea un programa de adivinación de números El programa genera de manera
aleatoria un número entre 1 y 50. El usuario debe adivinar el número en un
máximo de 7 intentos. Después de cada intento, indica si el número es mayor
o menor que el elegido. Si el usuario acierta, mostrar un aviso con el número
de intentos utilizado; si no, mostrar un aviso de que debe introducir
nuevamente un número.*/

        int randomNumber = (int)(Math.random()*50)+1;
        int intentos = 0;
        int numero = 0;
        Scanner scn = new Scanner(System.in);
        do{
            System.out.print("Introduce un numero:");
            numero = scn.nextInt();
            if(numero < randomNumber){
                System.out.println("El número introducido es más pequeño que el buscado.");
            } else{
                System.out.println("El número introducido es más grande que el buscado.");
            }
            intentos++;
        }while (intentos<7 && numero !=randomNumber);

        if (numero == randomNumber){
            System.out.printf("¡Has conseguido encontrar el número en %d intentos!", intentos);
            return;
        }else{
            System.out.printf("\n¡Has perdido! Has fallado %d veces.", intentos);
        }
    }
}
