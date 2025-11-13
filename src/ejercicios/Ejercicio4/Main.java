package ejercicios.Ejercicio4;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

    /*
    Crea un programa para jugar una partida virtual de dardos entre dos
    jugadores. El objetivo es que uno de los jugadores llegue exactamente a 0 puntos
    partiendo desde 301.
    Reglas:
    • Nada más empezar pide el nombre de cada jugador
    • Cada jugador comienza con 301 puntos.
    • En cada turno, un jugador lanza 3 dardos. Cada dardo genera un número
    aleatorio entre 0 y 60 (simulando puntuación en dardos).
    • La puntuación del turno es la suma de los 3 dardos.
    • Resta la puntuación del turno al total de puntos del jugador.
    • Si la puntuación restante es menor que 0, se considera que el jugador "se
    pasa" y su total no cambia ese turno.
    • El primer jugador que llegue exactamente a 0 gana la partida.
    • Después de cada turno, muestra las puntuaciones actuales y quién va
    ganando (el que tiene menos puntos).
    • Al finalizar, muestra el ganador y cuántos turnos tomó la partida.
     */

        //Importamos Scanner
        Scanner scn = new Scanner(System.in);

        //Declaramos los jugadores
        Jugador j1 = new Jugador();
        Jugador j2 = new Jugador();

        //Damos nombre a los jugadores
        j1.defNombre(scn);
        j2.defNombre(scn);

        do{
            j1.defTirarDardos();
            if (j1.puntuacion ==0){
                System.out.printf("¡Ha ganado %s!\n en %d tiradas (3 dardos por tirada)", j1.name, j2.contador);
                break;
            }
            j2.defTirarDardos();
            if (j2.puntuacion ==0){
                System.out.printf("¡Ha ganado %s!\n en %d tiradas (3 dardos por tirada)", j2.name, j2.contador);
                break;
            }
            if (j1.puntuacion < j2.puntuacion){
                System.out.printf("Va ganando %s con %d puntos, pierde %s con %d puntos\n", j1.name, j1.puntuacion, j2.name, j2.puntuacion);
            }
        }while(j1.puntuacion>0 && j2.puntuacion>0);
        System.out.println("Juego finalizado...");
    }
}
