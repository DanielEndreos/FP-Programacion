package ejercicios.MPO.Notion.Tema5._2_Navidades.Ejercicio6;

import ejercicios.MPO.Notion.Tema5._2_Navidades.Ejercicio6.model.Pelicula;

public class Main {
    static void main(String[] args) {

        /*
         **Objetivo:** Crear una clase `Pelicula` para gestionar información de películas.

         **Requisitos:**
         *
         * 1. Crear una clase Pelicula con atributos: titulo (String), director (String), duracion (int en minutos), anio (int), calificacion (double de 0 a 10).
         * 2. Crear constructor con todos los parámetros.
         * 3. Crear getters y setters. El setter de calificación debe validar que esté entre 0 y 10.
         * 4. Crear metodo String obtenerDuracionFormateada() que devuelva la duración en formato "Xh Ymin" (ej: "2h 15min").
         * 5. Crear metodo boolean esClasica() que devuelva true si la película tiene más de 25 años.
         * 6. Crear metodo boolean esRecomendable() que devuelva true si la calificación es mayor o igual a 7.
         * 7. Crear metodo void mostrarInfo() con toda la información de la película.
         * 8. En el main, crear una colección de películas y mostrar cuáles son recomendables.
         *
         */

        Pelicula p1 = new Pelicula("Origen", "Christopher Nolan", 148, 2010, 8.8);
        Pelicula p2 = new Pelicula("El Padrino", "Francis Ford Coppola", 175, 1972, 9.2);
        Pelicula p3 = new Pelicula("Interstellar", "Christopher Nolan", 169, 2014, 8.6);
        Pelicula p4 = new Pelicula("Mad Max: Fury Road", "George Miller", 120, 2015, 8.1);
        Pelicula p5 = new Pelicula("Batman & Robin", "Joel Schumacher", 125, 1997, 5.6);


        System.out.println("");
        System.out.println("--- Info Peliculas ---");
        p1.mostrarInfo();
        p2.mostrarInfo();
        p3.mostrarInfo();
        p4.mostrarInfo();
        p5.mostrarInfo();

        System.out.println("");
        System.out.println("--- Duraciones Formateadas ---");
        System.out.println(p1.getTitulo() + " - " + p1.obtenerDuracionFormateada());
        System.out.println(p2.getTitulo() + " - " + p2.obtenerDuracionFormateada());
        System.out.println(p3.getTitulo() + " - " + p3.obtenerDuracionFormateada());
        System.out.println(p4.getTitulo() + " - " + p4.obtenerDuracionFormateada());
        System.out.println(p5.getTitulo() + " - " + p5.obtenerDuracionFormateada());

        System.out.println("");
        System.out.println("--- Recomendadas ---");
        System.out.println(p1.getTitulo() + " - " + (p1.esRecomendable()?"Es recomendable.":"No es recomendable."));
        System.out.println(p2.getTitulo() + " - " + (p2.esRecomendable()?"Es recomendable.":"No es recomendable."));
        System.out.println(p3.getTitulo() + " - " + (p3.esRecomendable()?"Es recomendable.":"No es recomendable."));
        System.out.println(p4.getTitulo() + " - " + (p4.esRecomendable()?"Es recomendable.":"No es recomendable."));
        System.out.println(p5.getTitulo() + " - " + (p5.esRecomendable()?"Es recomendable.":"No es recomendable."));

    }
}
