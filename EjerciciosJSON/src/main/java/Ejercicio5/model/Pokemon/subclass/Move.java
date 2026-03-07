package Ejercicio5.model.Pokemon.subclass;

import lombok.Data;

import java.util.List;

@Data
public class Move {
    private Species move;
    private List<VersionGroupDetail> versionGroupDetails;
}
