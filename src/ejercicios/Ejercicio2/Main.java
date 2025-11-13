package ejercicios.Ejercicio2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        /*Crea una palabra de 5 letras. (funcionará como la palabra a adivinar)
        b. El programa debe seleccionar aleatoriamente una palabra del array y
        almacenarla como la palabra secreta.
        c. El usuario tiene 5 intentos como máximo para adivinar la palabra secreta.
        d. En cada intento, el usuario introduce una palabra por teclado.
        e. Tras cada intento, el programa debe indicar al usuario:
        i. Aciertos: cuántas letras tiene en la misma posición que la palabra
        secreta.
        ii. Aproximaciones: cuántas letras están en la palabra secreta, pero en una
        posición diferente.
        iii. Fallos: cuántas letras no están presentes en la palabra secreta.
        El juego termina cuando el usuario adivina la palabra o se acaban los 5 intentos*/

        String[] palabras = {"datos", "cosas", "lucia", "manta"};
        String palabraIntroducida = "";
        int intentos = 0;
        int aciertos = 0;
        String palabraAdivinar = palabras[(int)(Math.random()*4)];
        System.out.println(palabraAdivinar);
        Scanner scn = new Scanner(System.in);
        do{
            do{
            System.out.println("Introducir una palabra: ");
            palabraIntroducida = scn.next();
            }while(palabraIntroducida.length() != 5);

            if (palabraAdivinar.equals(palabraIntroducida)){
                System.out.println("¡Has acertado la palabra!");
                break;
            };

            aciertos = 0;
            for (int i = 0; i < palabraAdivinar.length(); i++) {
                if (palabraAdivinar.charAt(i) == (palabraIntroducida.charAt(i))){
                    aciertos++;
                };
            }
            System.out.printf("Has acertado %d letras.\n en %d intentos.", aciertos, intentos);
            intentos++;

            if (intentos>=5){
                System.out.println("Has llegado al máximo de intentos.");
            }

        }while(intentos<5);

        System.out.println("Saliendo del juego...");






    }
}
