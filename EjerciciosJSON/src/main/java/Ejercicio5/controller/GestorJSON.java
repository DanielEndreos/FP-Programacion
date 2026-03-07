package Ejercicio5.controller;

import Ejercicio5.model.Pokemon.PokemonResponse;
import tools.jackson.databind.ObjectMapper;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class GestorJSON {

    private String urlBase = "https://pokeapi.co/api/v2/pokemon/";

    public void buscarPokemon(){
        Scanner scn = new Scanner(System.in);
        System.out.print("¿Que pokemon buscas? ");
        String nombre = scn.next();

        ObjectMapper mapper = new ObjectMapper();

        try {
            PokemonResponse pokemonResponse = mapper.readValue(new URL(urlBase+nombre).openStream(), PokemonResponse.class);
            System.out.println("Nombre: "+pokemonResponse.getName());
            System.out.println("Altura: "+pokemonResponse.getHeight());
            System.out.println("Peso: "+pokemonResponse.getWeight());

            for (int i = 0; i < pokemonResponse.getStats().size(); i++) {
                System.out.println(pokemonResponse.getStats().get(i).getStat().getName()+": "+pokemonResponse.getStats().get(i).getBaseStat());
                if (i==2) break;
            }

        } catch (MalformedURLException | FileNotFoundException e) {
            System.out.println("No existe esa URL.");
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Se ha encontrado un campo érroneo.");
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
