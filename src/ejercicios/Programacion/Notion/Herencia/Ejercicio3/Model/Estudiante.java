package ejercicios.Programacion.Notion.Herencia.Ejercicio3.Model;

public class Estudiante extends Persona{

    private String curso;

    public Estudiante(String nombre, int edad, String curso) {
        super(nombre, edad);
        this.curso = curso;
    }

    public void estudiar(){
        System.out.printf("Estoy estudiando %s.\n", curso);
    }
}
