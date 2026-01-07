package ejercicios.Programacion.Notion.POO.Ejercicio9.model;

public class Calculadora {
    private int valorA;
    private int valorB;
    private double resultado;

    public Calculadora(){}

    public static int sumar (int valorA, int valorB){
        return valorA+valorB;
    }

    public static int resta (int valorA, int valorB){
        return valorA-valorB;
    }

    public static int multiplicar (int valorA, int valorB){
        return valorA*valorB;
    }

    public static double dividir (int valorA, int valorB){
        return valorA/valorB;
    }

    public static double potencia (int valorA, int valorB){
        return Math.pow(valorA, valorB);
    }

}
