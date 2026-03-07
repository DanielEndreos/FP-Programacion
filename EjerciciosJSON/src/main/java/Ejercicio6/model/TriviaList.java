package Ejercicio6.model;

import lombok.Data;

import java.util.List;

@Data
public class TriviaList {
    private long responseCode;
    private List<Trivia> results;
}

