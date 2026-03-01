package controller;

import com.google.gson.JsonObject;
import model.Pokemon;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class GestorDatosPokemon {

    private GestorJSON gestorJSON;
    private final String baseURL = "https://pokeapi.co/api/v2/pokemon/?limit=10&offset=0";
    private JSONObject mainObject;
    List<Pokemon> listPokemon;

    public GestorDatosPokemon(){
        gestorJSON = new GestorJSON();
        listPokemon = new ArrayList<>();
    }

    public void addPokemonsToList(){
        JSONObject resultsObject = gestorJSON.getDataFromAPI(baseURL);

        JSONArray resultsArray = gestorJSON.getArrayFromObject(resultsObject, "results");

        for (int i = 0; i < resultsArray.length(); i++) {
            String url = resultsArray.getJSONObject(i).getString("url");
            JSONObject resultsObject2 = gestorJSON.getDataFromAPI(url);

            Pokemon pokemon = new Pokemon();
            listPokemon.add(new Pokemon(
                    resultsObject2.getInt("id"),
                    resultsObject2.getString("name"),
                    resultsObject2.getInt("height"),
                    resultsObject2.getInt("weight")
            ));
        }


        System.out.println(listPokemon.get(10).getName());
    }




}
