package ejercicios.Programacion.Notion.Herencia.Ejercicio5.model;

public class Gerente extends Empleado{
    private double bonus;

    public Gerente(String nombre, double salarioBase, double bonus) {
        super(nombre, salarioBase);
        this.bonus = bonus;
    }

    public double calcularSalarioTotal(){
        return super.getSalarioBase() + bonus;
    }

    @Override
    public String toString() {
        return  "\nEmpleado: " + getNombre() +
                "\nPuesto: Gerente" +
                "\nSalario base: " + getSalarioBase() +"€"+
                "\nBonus: " + bonus + "€"+
                "\nSalario Total:" + calcularSalarioTotal() +"€";
    }
}
