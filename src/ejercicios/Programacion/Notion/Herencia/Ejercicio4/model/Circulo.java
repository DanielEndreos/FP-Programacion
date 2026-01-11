package ejercicios.Programacion.Notion.Herencia.Ejercicio4.model;

public class Circulo extends Figura{
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        System.out.printf("Círculo con radio: %.1f\n", radio);
        System.out.printf("Área: %.1f\n", (2*Math.PI*radio));
    }


}
