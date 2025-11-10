package ejercicios;

import enums.ClasificacionNivel;
import enums.EstadoPedido;
import enums.TipoFile;

import java.util.Scanner;

public class MPO {

    public void ejercicio6(Scanner scn){

        //Objetivo: Crear un programa que genere saludos diferentes según la hora del día.
        //Requisitos:
        //Crea un métod.o obtenerHoraActual() que devuelva un número entre 0 y 23.
        //En el main, llama al métod.o y usa switch(true) para clasificar en: Madrugada (0-5), Mañana (6-11), Tarde (12-19), Noche (20-23).
        //Muestra un saludo apropiado para cada período del día.

        int randomHour = obtenerHoraActual();
        System.out.println(randomHour);
        switch(randomHour){
            case 0,1,2,3,4,5 -> {System.out.println("Quien madruga dios le ayuda!");}
            case 6,7,8,9,10,11 -> {System.out.println("Buenos días!");}
            case 12,13,14,15,16,17 -> {System.out.println("Buenas tardes!");}
            case 18,19,20,21,22,23 -> {System.out.println("Buenas noches!");}
        }
    }

    private int obtenerHoraActual(){
        int hora = (int)(Math.random()*24);
    return hora;
    }

    public void ejercicio7(Scanner scn){
    //Objetivo: Crear un sistema que determine el nivel del jugador según su puntuación.
    //Requisitos:
    //Declara una variable int puntuacion.
    //Usa switch(true) para clasificar en niveles: Principiante (0-100), Intermedio (101-500), Avanzado (501-1000), Experto (1001-5000), Maestro (>5000).
    //Muestra el nivel alcanzado y un mensaje motivacional.
    //Otorga una recompensa virtual diferente para cada nivel.
        System.out.print("Introduce los puntos: ");
        int puntuacion = scn.nextInt();
        switch (ClasificacionNivel.getNivel(puntuacion)){
            case Principiante -> {System.out.printf("Has alcanzado el nivel %s.", ClasificacionNivel.getNivel(puntuacion));}
            case Intermedio -> {System.out.printf("Has alcanzado el nivel %s.", ClasificacionNivel.getNivel(puntuacion));}
            case Avanzado -> {System.out.printf("Has alcanzado el nivel %s.", ClasificacionNivel.getNivel(puntuacion));}
            case Experto -> {System.out.printf("Has alcanzado el nivel %s.", ClasificacionNivel.getNivel(puntuacion));}
            case Maestro -> {System.out.printf("Has alcanzado el nivel %s.", ClasificacionNivel.getNivel(puntuacion));}
        }

    }

    public void ejercicio8(Scanner scn){
        // Objetivo: Crear un programa que identifique el tipo de archivo según su extensión.
        // Requisitos:
        // Declara una variable String extension (por ejemplo: "jpg", "pdf", "txt", "mp3").
        //Usa un switch para agrupar extensiones similares: Imágenes (jpg, png, gif),
        // Documentos (pdf, doc, txt), Audio (mp3, wav), Video (mp4, avi).
        // Muestra el tipo de archivo y el programa recomendado para abrirlo.

        String extension = "jpg";

        switch (extension){
            case "jpg","png","gif"   -> {System.out.println("El archivo es una imagen. Puedes utilizar el Visor de Imágenes de Windows.");}
            case "pdf", "doc", "txt" -> {System.out.println("El archivo es un documento. Puedes utilizar Microsoft Word.");}
            case "mp3", "wav"        -> {System.out.println("El archivo es un audio. Puedes utilizar Reproductor de Musica.");}
            case "mp4", "avi"        -> {System.out.println("El archivo es una pelicula. Puedes utilizar VLC.");}
        }

        System.out.printf("\nOpción con ENUM: El archivo es de tipo %s.", TipoFile.findByType(extension));

    }

    public void ejercicio9(Scanner scn){
        //Crear un programa que calcule y clasifique el Índice de Masa Corporal (IMC).
        //Requisitos:
        //Declara variables double peso (en kg) y double altura (en metros).
        //Calcula el IMC: peso / (altura * altura).
        //Usa switch(true) para clasificar: Bajo peso (<18.5), Normal (18.5-24.9), Sobrepeso (25-29.9), Obesidad (>=30).
        //Muestra el IMC calculado y la clasificación correspondiente.



    }  // TODO SWITCH(TRUE)

    public void ejercicio10(Scanner scn){
        //Objetivo: Simular un sistema de seguimiento de pedidos con diferentes estados.
        //Requisitos:
        //1. Crea un enum EstadoPedido con: PENDIENTE, PROCESANDO, ENVIADO, EN_TRANSITO, ENTREGADO, CANCELADO.
        //2. Crea un métod.o obtenerEstadoActual() que devuelva aleatoriamente uno de estos estados.
        //3. En el main, usa un switch para mostrar un mensaje detallado del estado.
        //4. Indica el siguiente paso esperado para cada estado (excepto ENTREGADO y CANCELADO).

    switch (EstadoPedido.obtenerEstadoActual()){
        case PENDIENTE   -> {System.out.println("El producto se encuentra pendiente.");}
        case PROCESANDO  -> {System.out.println("El producto se encuentra procesando.");}
        case ENVIADO     -> {System.out.println("El producto se encuentra enviado.");}
        case EN_TRANSITO -> {System.out.println("El producto se encuentra en transito.");}
        case ENTREGADO   -> {System.out.println("El producto se encuentra entregado.");}
        case CANCELADO   -> {System.out.println("El producto se encuentra cancelado.");}
    }

    }

}
