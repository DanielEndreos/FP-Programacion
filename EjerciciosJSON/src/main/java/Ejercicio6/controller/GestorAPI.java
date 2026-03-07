package Ejercicio6.controller;

import Ejercicio6.model.TriviaList;
import org.apache.commons.lang3.StringEscapeUtils;
import tools.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;

public class GestorAPI {

    private String url = "https://opentdb.com/api.php?amount=3&type=multiple";

    public void readAPI(){
        ObjectMapper mapper = new ObjectMapper();

        try {
            TriviaList triviaList = mapper.readValue(new URL(url).openStream(),TriviaList.class);

            triviaList.getResults().forEach(item ->{
                System.out.println("Category: "+ StringEscapeUtils.unescapeHtml4(item.getCategory()));
                System.out.println("Question: "+ StringEscapeUtils.unescapeHtml4(item.getQuestion()));
                System.out.println("Correct Answer: "+ StringEscapeUtils.unescapeHtml4(item.getCorrectAnswer())+"\n");

            });
        } catch (IOException e) {
            System.out.println("Algo ha ocurrido");
            System.out.println(e.getMessage());
        }

    }
}
