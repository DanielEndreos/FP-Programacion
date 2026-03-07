package Ejercicio5.model.Pokemon.subclass;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Stat {
    @JsonProperty("base_stat")
    private long baseStat;
    private long effort;
    private Species stat;
}
