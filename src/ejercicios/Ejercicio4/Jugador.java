package ejercicios.Ejercicio4;

import java.util.Scanner;

public class Jugador {

    String name = "";
    int puntuacion = 301;
    int contador = 0;

    public void defNombre(Scanner scn){
        System.out.print("Introduce el nombre del jugador: ");
        this.name = scn.next();
    };

    public void defTirarDardos(){
        int dardo = 0;
        for (int i = 1; i <= 3; i++) {
            dardo += (int)(Math.random()*61);
        }

        if (dardo <= this.puntuacion){
            this.puntuacion -= dardo;
        }

        this.contador++;
    };

}
