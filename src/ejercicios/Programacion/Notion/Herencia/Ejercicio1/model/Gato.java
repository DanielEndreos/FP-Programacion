package ejercicios.Programacion.Notion.Herencia.Ejercicio1.model;

public class Gato extends Animal{

    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        super.hacerSonido();
        System.out.println("Miau miau");
    }
}
