package ejercicios.MPO.Notion.Tema5._3_HashMap.Ejercicio4.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Calificador {
    private HashMap<String, ArrayList<Double>> sistema;

    public Calificador(){
        sistema = new HashMap<>();
    }

    public void agregarEstudiante(String nombre){
        sistema.put(nombre, new ArrayList<>());
    }

    public void agregarCalificacion(String nombre, double calificacion){
        if ( sistema.get(nombre) != null){
            sistema.get(nombre).add(calificacion);
        } else {
            System.out.println("El estudiante no existe.");
        }
    }

    public double calcularPromedio(String nombre){
        if ( sistema.get(nombre) != null){
            double sumaTotal = 0.0;
            for (double h : sistema.get(nombre)){
                sumaTotal+=h;
            }
            return sumaTotal/sistema.get(nombre).size();
        } else {
            System.out.println("El estudiante no existe.");
            return 0;
        }
    }

    public void mostrarCalificaciones(String nombre){
        if ( sistema.get(nombre) != null){
            System.out.printf("%s: %s\n", nombre, sistema.get(nombre).toString());
        } else {
            System.out.println("El estudiante no existe.");
        }
    }

    public String mejorEstudiante(){
        Set<String> listaUsuarios = sistema.keySet();

        String nombre = "";
        double promedio = 0.0;
        for (String s: listaUsuarios){
            if(calcularPromedio(s)>promedio){
                promedio = calcularPromedio(s);
                nombre = s;
            }
        }
        return nombre;
    }

    public void listarEstudiantesAprobados(double notaMinima){
        Set<String> listaUsuarios = sistema.keySet();
        System.out.println("Estudiantes aprobados (nota mínima "+notaMinima+"): ");
        for (String s: listaUsuarios){
            if(calcularPromedio(s)>=notaMinima){
                System.out.printf("- %s: %.2f\n", s, calcularPromedio(s));
            }
        }
    }

    public double promedioGeneral(){
        Set<String> listaUsuarios = sistema.keySet();
        System.out.print("Promedio general de la clase: ");
        double sumaPromedios = 0.0;
        for (String s: listaUsuarios){
            sumaPromedios += calcularPromedio(s);
        }
        return sumaPromedios/listaUsuarios.size();
    }

}
