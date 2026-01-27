package ejercicios.Programacion.ThePower.Tema6.Ejercicio2;

import ejercicios.Programacion.ThePower.Tema6.Ejercicio2.controller.GestionColeccMultimedia;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        GestionColeccMultimedia gcm = new GestionColeccMultimedia(scn);

        gcm.start();
    }
}
