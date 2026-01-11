package ejercicios.MPO.Notion.Tema5._2_Navidades.Ejercicio7.model;

public class Empleado {
    private String nombre, dni;
    private double salarioBase;
    private int horasExtras;

    public Empleado(String nombre, String dni, double salarioBase) {
        this.nombre = nombre;
        this.dni = dni;
        this.salarioBase = salarioBase;
        this.horasExtras = 0;
    }

    public void agregarHorasExtras(int horas){
        horasExtras+=horas;
    }

    public double calcularSalarioTotal(){
        return salarioBase+(horasExtras*20);
    }

    public void aplicarAumento(double porcentaje){
    salarioBase*=(1+(porcentaje/100));
    }

    public void resetearHorasExtras(){
    horasExtras = 0;
    }

    public void mostrarInforme(){
        System.out.println("Empleado{" +
                "Nombre: '" + nombre + '\'' +
                ", DNI: '" + dni + '\'' +
                ", Salario Base: " + salarioBase +
                ", Horas Extras: " + horasExtras +
                ", Salario Total: "+ calcularSalarioTotal() + "}");
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getHorasExtras() {
        return horasExtras;
    }
    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }
}
