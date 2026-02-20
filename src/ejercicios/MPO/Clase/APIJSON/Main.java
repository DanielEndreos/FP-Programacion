package ejercicios.MPO.Clase.APIJSON;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) {

        String url = "https://pokeapi.co/api/v2/pokemon/";

        HttpClient httpClient = HttpClient.newHttpClient();

        HttpRequest peticion = HttpRequest.newBuilder().uri(URI.create(url)).build();

        HttpResponse<String> response = null;

        try {

            response = httpClient.send( peticion, HttpResponse.BodyHandlers.ofString() );

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //System.out.println(response.body());

        JSONObject jsonObject = new JSONObject(response.body());
//
        JSONArray jsonArray = jsonObject.getJSONArray("results");


        for (int i=0; i<jsonArray.length() ; i++) {
            if (jsonArray.getJSONObject(i).get("name").equals("beedrill")){
                System.out.printf("Has encontrado al pokemon en la posición %d! (nombre: %s, url: %s)",i,jsonArray.getJSONObject(i).get("name"), jsonArray.getJSONObject(i).get("url"));
                break;
            };
        }



//        JSONObject pokemon1 = jsonArray.getJSONObject(0);
//
//        System.out.println(pokemon1.get("name"));

        httpClient.close();

    }
}
