package controller;

import lombok.Getter;
import lombok.Setter;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Getter
@Setter
public class GestorJSON {

    private HttpClient client;
    private HttpRequest request;
    private HttpResponse<String> response;

    public GestorJSON(){
        client = HttpClient.newHttpClient();
    }

    public JSONObject getDataFromAPI(String url){
        request  = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            System.out.printf("Algo físico / red ha fallado. %s%n", e.getMessage());
        } catch (InterruptedException e) {
            System.out.printf("Ha tardado demasiado tiempo. %s%n", e.getMessage());
        }

        return new JSONObject(response.body());
    }

    public JSONArray getArrayFromObject(JSONObject jsonObject, String key){
        return new JSONArray(jsonObject.getJSONArray(key));
    }

    public String getStringFromObject(JSONObject jsonObject, String key){
        return jsonObject.getString(key);
    }

}
