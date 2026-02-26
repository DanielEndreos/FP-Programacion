package ejemplo.controller;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import ejemplo.model.Clasificacion;
import ejemplo.model.Equipo;
import ejemplo.model.Liga;
import ejemplo.model.Team;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Locale;

public class APIController {
    private String urlBase = "https://www.thesportsdb.com/api/v1/json/123/";

    public void obtenerLigas(){
        String urlLigas = urlBase + "all_leagues.php";

        try {
            Gson gson = new Gson();


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest
                .newBuilder()
                .uri(URI.create(urlLigas))
                .GET().build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String body = response.body();
            JSONObject objectLigas = new JSONObject(response.body());
            JSONArray arrayLigas = objectLigas.getJSONArray("leagues");
            for (int i = 0; i < arrayLigas.length(); i++) {
                JSONObject ligaJSON = arrayLigas.getJSONObject(i);
              //  System.out.println(ligaJSON.toString());
               Liga liga = gson.fromJson(ligaJSON.toString(), Liga.class);
                System.out.println(liga);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void obtenerClasificacion(String id){
        String urlClasificacion = urlBase+"lookuptable.php?l="+id;

        try {
            Gson gson = new Gson();

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest
                    .newBuilder()
                    .uri(URI.create(urlClasificacion))
                    .GET().build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String body = response.body();
            JSONObject objectEquipo = new JSONObject(response.body());
            JSONArray arrayEquipo = objectEquipo.getJSONArray("table");
            for (int i = 0; i < arrayEquipo.length(); i++) {
                JSONObject equipoJSON = arrayEquipo.getJSONObject(i);
                //  System.out.println(ligaJSON.toString());
                Equipo equipo = gson.fromJson(equipoJSON.toString(), Equipo.class);
                System.out.printf("%s - %s - %s - %s - %s%n",
                        equipo.getIntRank(),
                        equipo.getStrTeam(),
                        equipo.getIntWin(),
                        equipo.getIntDraw(),
                        equipo.getIntLoss());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void obtenerClasificacionCompleta (String id){
        String urlClasificacion = urlBase+"lookuptable.php?l="+id;

        try {
            Gson gson = new Gson();

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest
                    .newBuilder()
                    .uri(URI.create(urlClasificacion))
                    .GET().build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            JSONObject objectClasificacion = new JSONObject(response.body());
           Clasificacion clasificacion = gson.fromJson(objectClasificacion.toString(), Clasificacion.class );

            for (int i = 0; i < clasificacion.getTable().length; i++) {
                Team team = clasificacion.getTable()[i];
                System.out.printf("%s - %s - %s - %s - %s%n",
                        team.getIntRank(),
                        team.getStrTeam(),
                        team.getIntWin(),
                        team.getIntDraw(),
                        team.getIntLoss());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
