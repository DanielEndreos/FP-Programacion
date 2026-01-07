package ejercicios.Programacion.Notion.POO.Ejercicio8.model;

public class Empleado {
    private String nombre, puesto;
    private double salario;

    public Empleado(String nombre, String puesto, double salario){
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return nombre+" - "+
                puesto+" - "+
                salario+"€";
    }

    public double getSalario() {
        return salario;
    }

    public String getNombre() {
        return nombre;
    }
}
