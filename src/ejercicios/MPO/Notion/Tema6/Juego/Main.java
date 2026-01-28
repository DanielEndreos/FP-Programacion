package ejercicios.MPO.Notion.Tema6.Juego;

import ejercicios.MPO.Notion.Tema6.Juego.controller.Juego;

import java.util.Scanner;

public class Main {

    static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Juego juego = new Juego(scn);
        juego.startJuego();

    }


}
