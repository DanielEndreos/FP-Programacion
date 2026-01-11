package ejercicios.Programacion.Notion.Herencia.Ejercicio4.model;

public class Cuadrado extends Figura{
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        System.out.printf("Cuadrado con lado: %.1f\n", lado);
        System.out.printf("Área: %.1f\n",((lado+lado)*2));
    }


}
