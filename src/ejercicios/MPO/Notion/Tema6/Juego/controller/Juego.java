package ejercicios.MPO.Notion.Tema6.Juego.controller;

import ejercicios.MPO.Notion.Tema6.Juego.model.Jugador;
import ejercicios.MPO.Notion.Tema6.Juego.model.Personaje;
import ejercicios.MPO.Notion.Tema6.Juego.model.tipoPersonaje.Clerigo;
import ejercicios.MPO.Notion.Tema6.Juego.model.tipoPersonaje.MagoBlanco;
import ejercicios.MPO.Notion.Tema6.Juego.model.tipoPersonaje.MagoNegro;

import java.util.Scanner;

public class Juego {

    Jugador player1, player2;
    Scanner scn;

    public Juego(Scanner scn){
        this.scn = scn;
    }

    public void startJuego (){
        System.out.println("Se ha comenzado el juego...");
        System.out.print("Por favor, introduce el nombre del primer jugador: ");
        String nombre = scn.next();
        player1 = new Jugador(nombre);

        System.out.print("Por favor, introduce el nombre del segundo jugador: ");
        nombre = scn.next();
        player2 = new Jugador(nombre);
        mostrarMenu();
    }

    private void mostrarMenu(){
        boolean readyToPlay = false;
        do {
            System.out.println("");
            System.out.println("--------  Menú --------");
            System.out.println("1. Agregar Personaje a " + player1.getNombre());
            System.out.println("2. Agregar Personaje a " + player2.getNombre());
            System.out.println("3. Listar Equipos");
            System.out.println("4. Buscar Personaje");

            if (player1.getEquipo().size()==5 && player2.getEquipo().size()==5){
                System.out.println("5. Comenzar Juego");
                readyToPlay = true;
            }else{
                System.out.println("5. Comenzar Juego (No Disponible)");
            }

            System.out.print("Selecciona una opción: ");
            int opcion = scn.nextInt();
            System.out.println("");
            System.out.println("---------------------");
            System.out.println("");

            switch (opcion) {
                case 1 -> {player1.addPersonaje(scn);}
                case 2 -> {player2.addPersonaje(scn);}
                case 3 -> {
                    player1.listarEquipo();
                    player2.listarEquipo();
                }
                case 4 -> {
                    System.out.print("¿Que personaje quieres buscar? ");
                    String tipoPj = scn.next();
                    player1.buscarPersonaje(tipoPj);
                    player2.buscarPersonaje(tipoPj);}
                case 5 -> {
                    if (readyToPlay){
                        comenzandoJuego();
                    } else {
                        System.out.println("Los jugadores todavía no tienen listos sus equipos.");
                        System.out.println(player1.getNombre() +" - "+player1.getEquipo().size()+"/5 Jugadores");
                        System.out.println(player2.getNombre() +" - "+player2.getEquipo().size()+"/5 Jugadores");
                    }
                }
            }
        }while(player1.jugadorVivo() && player2.jugadorVivo());
    }

    private void comenzandoJuego(){
        do{
            turnoJugador(player1);
            turnoJugador(player2);
        }while(player1.jugadorVivo() && player2.jugadorVivo());
    }

    private void turnoJugador(Jugador jugador){
        System.out.println("\nTurno Jugador "+jugador.getNombre());
        System.out.println("------------------------------------");
        jugador.getEquipo().values().forEach(personaje -> {
            if (personaje.getVida()>0){
                System.out.println("- Jugar con "+personaje.getTipo());
            }
        });

        String pjToPlay = "";
        do {
            System.out.println("¿Con quien quieres jugar?");
            pjToPlay = scn.next();

            if (jugador.getEquipo().containsKey(pjToPlay)){
                if (jugador.getEquipo().get(pjToPlay).getVida()>0){
                    break;
                } else {
                    System.out.println("Este personaje está muerto, no puedes usarlo.");
                }
            } else {
                System.out.println("Este personaje no existe.");
            }
        }while(true);

        jugador.getEquipo().get(pjToPlay).accionesPosibles();

        player1.listarEquipo();
        player2.listarEquipo();
    }
}
