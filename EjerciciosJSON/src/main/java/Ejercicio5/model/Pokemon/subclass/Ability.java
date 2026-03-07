package Ejercicio5.model.Pokemon.subclass;

import lombok.Data;

@Data
public class Ability {
    private Species ability;
    private boolean isHidden;
    private long slot;
}
