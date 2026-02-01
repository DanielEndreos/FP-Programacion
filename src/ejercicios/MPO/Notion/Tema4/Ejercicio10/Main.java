package ejercicios.MPO.Notion.Tema4.Ejercicio10;

import ejercicios.MPO.Notion.Tema4.Ejercicio10.model.Alumno;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        /*
        **Ejercicio 10 - Sistema Completo: Gestor de Calificaciones Avanzado**

        Crea un sistema de gestión de calificaciones que utilice:

        - BiFunction para calcular la nota final (teoría 60%, práctica 40%)
        - BiPredicate para verificar si un alumno ha aprobado (nota >= 5)
        - Function para convertir notas numéricas a letras (A, B, C, D, F)
        - BiConsumer para imprimir el informe completo del alumno
        - Predicate para filtrar alumnos aprobados/suspensos

        Implementa una clase Alumno con nombre, nota de teoría y nota de práctica. Crea una lista de al menos 8 alumnos y aplica todas las funciones lambda para generar un informe completo.
         */

        ArrayList<Alumno> listaAlumnos = new ArrayList<>(
                List.of(
                        new Alumno("Daniel", 2.0, 3.0),
                        new Alumno("Yago", 5.0, 5.0),
                        new Alumno("Izan", 10.0, 6.0),
                        new Alumno("Bruno", 7.0, 7.0),
                        new Alumno("Javier", 10.0, 10.0),
                        new Alumno("Jose", 5.0, 10.0),
                        new Alumno("Hugo", 4.0, 2.0),
                        new Alumno("Toni", 3.0, 6.0)
                )
        );

        //- BiFunction para calcular la nota final (teoría 60%, práctica 40%)
        BiFunction<Double, Double, Double> calcularNotaFinal = (notaPractica, notaTeorica)-> (notaPractica*0.6)+(notaTeorica*0.4);

        //   - BiPredicate para verificar si un alumno ha aprobado (nota >= 5)
        BiPredicate<Double, Double> aprobado = (nota, notaCorte) -> nota>=notaCorte;

        //   - Function para convertir notas numéricas a letras (A, B, C, D, F)
        Function<Double, String> convNotaToString = nota -> {
            if (nota >= 9) return "A";
            if (nota >= 7) return "B";
            if (nota >= 5) return "C";
            if (nota >= 3) return "D";
            return "F";
        };

        //   - BiConsumer para imprimir el informe completo del alumno
        BiConsumer<Alumno, Double> imprimirInforme =
                (a, n) -> System.out.printf(
                        "Alumno: %-6s | Nota: %.1f | Letra: %s | %s%n",
                        a.getNombre(),
                        n,
                        convNotaToString.apply(n),
                        aprobado.test(n, 5.0) ? "APROBADO" : "SUSPENSO"
                );

        //        - Predicate para filtrar alumnos aprobados/suspensos
        Predicate<Alumno> alumnoAprobado = alumno -> aprobado.test(calcularNotaFinal.apply(alumno.getNotaPractica(), alumno.getNotaTeorica()), 5.0);

        System.out.println("\n--- ALUMNOS APROBADOS ---");
        listaAlumnos.stream()
                .filter(alumnoAprobado)
                .forEach(a -> imprimirInforme.accept(
                        a,
                        calcularNotaFinal.apply(a.getNotaPractica(), a.getNotaTeorica())
                ));

        System.out.println("\n--- ALUMNOS SUSPENDIDOS ---");
        listaAlumnos.stream()
                .filter(alumnoAprobado.negate())
                .forEach(a -> imprimirInforme.accept(
                        a,
                        calcularNotaFinal.apply(a.getNotaPractica(), a.getNotaTeorica())
                ));
    }
}
