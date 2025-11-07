package enums;

public enum DiasSemana {
    Lunes(1),
    Martes(2),
    Miercoles(3),
    Jueves(4),
    Viernes(5),
    Sabado(6),
    Domingo(7);

    int numero;

    DiasSemana(int numP){
        numero = numP;
    }
}
