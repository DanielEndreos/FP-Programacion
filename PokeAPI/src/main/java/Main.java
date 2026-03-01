import controller.GestorDatosPokemon;

public class Main {
    public static void main(String[] args) {

        GestorDatosPokemon gestorDatosPokemon = new GestorDatosPokemon();

        gestorDatosPokemon.addPokemonsToList();



        
//
//        GestorJSON gestorJSON = new GestorJSON();
//
//        JSONObject object = gestorJSON.getDataFromAPI("https://pokeapi.co/api/v2/pokemon?limit=10&offset=0");
//        JSONArray array = gestorJSON.getArrayFromObject(object, "results");
//
//        gestorJSON.getStringFromObject(array.getJSONObject(0), "url");
//
//
//        System.out.println(gestorJSON.getStringFromObject(array.getJSONObject(0), "url"));

    }
}
