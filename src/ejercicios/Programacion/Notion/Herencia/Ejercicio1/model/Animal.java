package ejercicios.Programacion.Notion.Herencia.Ejercicio1.model;

public class Animal {

    private String nombre;
    private int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void hacerSonido(){
        System.out.printf("Animal: %s, %d años\n", nombre, edad);
        System.out.printf("%s hace: ", nombre);
    };

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
