package Ejercicio5.model.Pokemon.subclass;
import lombok.Data;

import java.util.List;

@Data
public class PastAbility {
    private List<Ability> abilities;
    private Species generation;
}
