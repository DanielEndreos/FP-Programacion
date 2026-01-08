package ejercicios.MPO.Notion.Tema5.Navidades.Ejercicio2.model;

public class Estudiante {
    private String nombre;
    private int edad;
    private double notaMatematicas, notaProgramacion, notaIngles;

    public Estudiante(String nombre, int edad, double notaMatematicas, double notaProgramacion, double notaIngles){
        this.nombre = nombre;
        this.edad = edad;
        this.notaMatematicas = notaMatematicas;
        this.notaProgramacion = notaProgramacion;
        this.notaIngles = notaIngles;
    }

    public double calcularPromedio(){
        return ((notaProgramacion+notaMatematicas+notaIngles)/3);
    }

    public boolean estaAprobado(){
        return calcularPromedio()>=5;
    }

    public String obtenerCalificacion(){
             if (calcularPromedio()>9){return "Sobresaliente";}
        else if (calcularPromedio()>7){return "Notable";}
        else if (calcularPromedio()>6){return "Bien";}
        else if (calcularPromedio()>5){return "Suficiente";}
        else            {return "Insuficiente";}
    }

    public void mostrarInforme(){
        System.out.printf("""
                Estudiante: %s
                Edad: %d
                Notas:
                     - Matematicas: %.1f
                     - Programación: %.1f
                     - Inglés: %.1f
                
                Promedio: %.1f
                Calificación: %s 
                """, nombre, edad, notaMatematicas, notaProgramacion, notaIngles, calcularPromedio(), obtenerCalificacion());
    }

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

    public double getNotaMatematicas() {
        return notaMatematicas;
    }
    public void setNotaMatematicas(double notaMatematicas) {
        this.notaMatematicas = notaMatematicas;
    }

    public double getNotaProgramacion() {
        return notaProgramacion;
    }
    public void setNotaProgramacion(double notaProgramacion) {
        this.notaProgramacion = notaProgramacion;
    }

    public double getNotaIngles() {
        return notaIngles;
    }
    public void setNotaIngles(double notaIngles) {
        this.notaIngles = notaIngles;
    }
}
