package Ejercicio5.model.Pokemon.subclass;

import lombok.Data;

import java.util.Map;

@Data
public class Versions {
    private GenerationI generationI;
    private GenerationIi generationIi;
    private GenerationIii generationIii;
    private GenerationIv generationIv;
    private GenerationIx generationIx;
    private GenerationV generationV;
    private Map<String, Home> generationVi;
    private GenerationVii generationVii;
    private GenerationViii generationViii;
}
