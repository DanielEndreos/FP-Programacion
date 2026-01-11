package ejercicios.Programacion.Notion.Herencia.Ejercicio3.Model;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void presentarse(){
        System.out.printf("Hola, soy %s y tengo %d años.\n", nombre, edad);
    };

}
