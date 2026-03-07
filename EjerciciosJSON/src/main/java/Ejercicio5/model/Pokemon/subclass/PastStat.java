package Ejercicio5.model.Pokemon.subclass;

import lombok.Data;

import java.util.List;

@Data
public class PastStat {
    private Species generation;
    private List<Stat> stats;
}
