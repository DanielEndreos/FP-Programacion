package ejercicios.Programacion.Notion.POO.Ejercicio6.model;

public class Estudiante {
    private String nombre;
    private int edad;
    private double nota;


    public Estudiante(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarNota(){
        System.out.printf("Nota actual: %.1f\n", this.nota);
    }
    public void setNota(double nota) {
        if (nota >= 0.0 && nota <=10.0){
            this.nota = nota;
            System.out.printf("Asignando nota %.1f: Correcto\n", this.nota);
        } else {
            System.out.printf("Asignando nota %.1f: Error - La nota debe estar entre 0 y 10\n", nota);
        }
    }

}
