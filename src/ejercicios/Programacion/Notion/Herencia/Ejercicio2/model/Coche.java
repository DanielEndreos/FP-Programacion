package ejercicios.Programacion.Notion.Herencia.Ejercicio2.model;

public class Coche extends Vehiculo{

    private int numeroPuertas;

    public Coche(String marca, String modelo, int numeroPuertas) {
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String toString() {
        return "Coche: " +
                getMarca() + " " +
                getModelo() +
                ", " + numeroPuertas +
                " puertas";
    }
}
