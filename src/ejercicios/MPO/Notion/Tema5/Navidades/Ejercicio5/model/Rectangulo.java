package ejercicios.MPO.Notion.Tema5.Navidades.Ejercicio5.model;

public class Rectangulo {
    private double base, altura;

    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea(){
        return base*altura;
    }

    public double calcularPerimetro(){
        return (base+altura)*2;
    }

    public boolean esCuadrado(){
        return base==altura;
    }

    public void escalar(double factor){
        if(factor>0.0){
            System.out.printf("Escalando con un factor de: %.1f\n", factor);
            base *= factor;
            altura *= factor;
        } else {
            System.out.println("El factor introducido es negativo o erróneo.");
        }
    }

    public void mostrarInfo(){
        System.out.printf("Base: %.1f - Altura: %.1f - Área: %.1f - Perímetro: %.1f - Cuadrado: %s\n", base, altura, calcularArea(), calcularPerimetro(), esCuadrado());
    }

    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        if(base>0.0){
            System.out.printf("Introduciendo el valor %.1f como base.\n", base);
            this.base = base;
        } else {
            System.out.println("El valor de la base es incorrecto.");
        }
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        if(altura>0.0){
            System.out.printf("Introduciendo el valor %.1f como altura.\n", altura);
            this.altura = altura;
        } else {
            System.out.println("El valor de la altura es incorrecto.");
        }
    }
}
