package ejercicios.Programacion.Notion.POO.Ejercicio3.model;

public class Rectangulo {

    double base, altura;

    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea(){
        return (base*altura);
    };

    public double calcularPerimetro(){
        return (2*(base+altura));
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
}
