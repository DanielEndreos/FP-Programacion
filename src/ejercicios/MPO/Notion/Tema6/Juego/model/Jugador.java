package ejercicios.MPO.Notion.Tema6.Juego.model;

import ejercicios.MPO.Notion.Tema6.Juego.model.tipoPersonaje.*;

import java.util.HashMap;
import java.util.Scanner;

public class Jugador {
    private String nombre, rango;
    private HashMap<String, Personaje> equipo;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.rango = "noob";
        equipo = new HashMap<>();
    }

    public void addPersonaje(Scanner scn) {
        System.out.println("¿Que personaje quieres añadir?");
        System.out.println((equipo.keySet().contains("Mago")) ? "1 - Mago (Ya añadido)" : "1 - Mago");
        System.out.println((equipo.keySet().contains("Clerigo")) ? "2 - Clerigo (Ya añadido)" : "2 - Clerigo");
        System.out.println((equipo.keySet().contains("Guerrero")) ? "3 - Guerrero (Ya añadido)" : "3 - Guerrero");
        System.out.println((equipo.keySet().contains("Arquero")) ? "4 - Arquero (Ya añadido)" : "4 - Arquero");
        System.out.println((equipo.keySet().contains("Soldado")) ? "5 - Soldado (Ya añadido)" : "5 - Soldado");
        System.out.print("Elige el personaje: ");
        int tipo = scn.nextInt();
        switch (tipo) {
            case 1 -> {
                if (equipo.keySet().contains("Mago")) {
                    System.out.println("El personaje que has intentado añadir ya existia. Volviendo al menú.");
                } else {
                    System.out.println("¿Que tipo de mago quieres agregar?");
                    System.out.println("1 - Magia Blanca (Cura)");
                    System.out.println("2 - Magia Negra (Daño)");
                    System.out.print("Elige la especialidad: ");
                    int especialidad = scn.nextInt();
                    switch (especialidad) {
                        case 1 -> {
                            equipo.put("Mago", new MagoBlanco());
                        }
                        case 2 -> {
                            equipo.put("Mago", new MagoNegro());
                        }
                    }
                }
            }
            case 2 -> {
                if (equipo.keySet().contains("Clerigo")) {
                    System.out.println("El personaje que has intentado añadir ya existía. Volviendo al menú.");
                } else {
                    equipo.put("Clerigo", new Clerigo());
                }
            }
            case 3 -> {
                if (equipo.keySet().contains("Guerrero")) {
                    System.out.println("El personaje que has intentado añadir ya existía. Volviendo al menú.");
                } else {
                    equipo.put("Guerrero", new Guerrero());
                }
            }
            case 4 -> {
                if (equipo.keySet().contains("Arquero")) {
                    System.out.println("El personaje que has intentado añadir ya existía. Volviendo al menú.");
                } else {
                    equipo.put("Arquero", new Arquero());
                }
            }
            case 5 -> {
                if (equipo.keySet().contains("Soldado")) {
                    System.out.println("El personaje que has intentado añadir ya existía. Volviendo al menú.");
                } else {
                    equipo.put("Soldado", new Soldado());
                }
            }
        }
    }

    public void listarEquipo() {
        System.out.println("\nEquipo jugador " + nombre);
        System.out.println("--------------------------");
        if (equipo.size() > 0) {
            equipo.values().forEach(Personaje::mostrarDatos);
        } else {
            System.out.println("No hay personajes disponibles.");
        }
    }

    public void buscarPersonaje(String tipo) {
        System.out.println("\nJugador "+nombre+", buscando el personaje de tipo "+tipo+"...");
        System.out.println("-------------------------------------------------------------");
        if (equipo.keySet().contains(tipo)){
            equipo.get(tipo).mostrarDatos();
        } else {
            System.out.println("No se encuentra el tipo de personaje seleccionado ("+tipo+").");
        }
    }

    public boolean jugadorVivo(){
        int vidaTotal = 0;
        if (equipo.size()==5){
            for(Personaje pj : equipo.values()){
                vidaTotal+=pj.getVida();
            }
            if (vidaTotal==0){
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRango() {
        return rango;
    }
    public void setRango(String rango) {
        this.rango = rango;
    }

    public HashMap<String, Personaje> getEquipo() {
        return equipo;
    }
    public void setEquipo(HashMap<String, Personaje> equipo) {
        this.equipo = equipo;
    }
}
