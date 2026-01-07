package ejercicios.Programacion.Notion.POO.Ejercicio1.model;

public class Persona {

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDatos(){
        System.out.printf("""
                Nombre: %s
                Edad: %d
                """, this.nombre, this.edad);
    }

}
