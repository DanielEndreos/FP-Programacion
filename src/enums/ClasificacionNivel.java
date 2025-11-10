package enums;

public enum ClasificacionNivel {
    //Usa switch(true) para clasificar en niveles: Principiante (0-100), Intermedio (101-500), Avanzado (501-1000), Experto (1001-5000), Maestro (>5000).
Principiante(0, 100),
Intermedio(101,500),
Avanzado(501,1000),
Experto(1001,5000),
Maestro(5001, 0);

private int min, max;

ClasificacionNivel(int minP, int maxP){
    min = minP;
    max = maxP;
}

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

    public static ClasificacionNivel getNivel(int puntos){
    for (ClasificacionNivel nivel : values()){
        if (puntos >= nivel.min && nivel.max == 0){
            return nivel;
        } else if (puntos >= nivel.min && puntos <= nivel.max){
            return nivel;
        }
    }
    return null;
    }
}
