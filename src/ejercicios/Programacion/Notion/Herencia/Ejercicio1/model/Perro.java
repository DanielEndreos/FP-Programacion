package ejercicios.Programacion.Notion.Herencia.Ejercicio1.model;

public class Perro extends Animal{

    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        super.hacerSonido();
        System.out.println("Guau guau");
    }
}
