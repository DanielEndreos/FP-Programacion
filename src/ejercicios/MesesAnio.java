package ejercicios;

public enum MesesAnio {
    Enero("invierno", 1),
    Febrero("invierno", 2),
    Marzo("primavera", 3),
    Abril("primavera", 4),
    Mayo("primavera", 5),
    Junio("verano", 6),
    Julio("verano", 7),
    Agosto("verano", 8),
    Septiembre("otoño", 9),
    Octubre("otoño", 10),
    Noviembre("otoño", 11),
    Diciembre("invierno", 12);

    String estacion;
    int numero;
    MesesAnio(String estacionP, int numeroP){
        estacion = estacionP;
        numero = numeroP;
    }


}
