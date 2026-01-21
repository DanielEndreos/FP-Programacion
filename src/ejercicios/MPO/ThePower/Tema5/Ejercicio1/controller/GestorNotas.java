package ejercicios.MPO.ThePower.Tema5.Ejercicio1.controller;

import ejercicios.MPO.ThePower.Tema5.Ejercicio1.model.Alumno;

import java.util.*;

public class GestorNotas {
    private Scanner scn;
    private HashMap<String, Alumno> listaAlumnos;

    public GestorNotas(Scanner scn) {
        listaAlumnos = new HashMap<>();
        this.scn = scn;
    }

    public void startGestor(){
    int opcion = 0;

        do {
            System.out.print("""
                    
                    Elige la opción deseada:
                    ----------------------------
                    1 - Introducir Alumno
                    2 - Buscar Nota ALumno
                    3 - n Mejores Expedientes
                    4 - Expedientes Nota Corte
                    >5 - Salir
                    ----------------------------
                    """);

            opcion = scn.nextInt();

            switch (opcion){
                case 1 -> {introducirAlumno();}
                case 2 -> {buscarAlumnoNota();}
                case 3 -> {mejoresExpedientes();}
                case 4 -> {expedientesNotaCorte();}
            }

        } while (opcion<5);
    }

    private void introducirAlumno(){
        Alumno tAlumno = new Alumno();
        System.out.println("Introduciendo alumno n# " + (listaAlumnos.size()+1));

        System.out.print("DNI: ");
        tAlumno.setDni(scn.next());

        if (listaAlumnos.containsKey(tAlumno.getDni())){
            System.out.println("Este DNI ya existe en el sistema. Proceso cancelado.");
            return;
        }

        System.out.print("Nombre: ");
        tAlumno.setNombre(scn.next());

        System.out.print("Apellido: ");
        tAlumno.setApellido(scn.next());

        System.out.print("Nota: ");
        tAlumno.setNota(scn.nextDouble());

        listaAlumnos.put(tAlumno.getDni(), tAlumno);
    }

    private void buscarAlumnoNota(){
        System.out.print("Introduce el DNI del usuario: ");
        String dni = scn.next();

        if(listaAlumnos.containsKey(dni)){
            System.out.println("La nota del alumno con DNI "+dni+" es: "+ listaAlumnos.get(dni).getNota());
        } else {
            System.out.println("Este alumno no existe en la BBDD.");
        }

    }

    private void mejoresExpedientes(){
        System.out.print("¿Que cantidad de mejores expedientes quieres ver? ");
        int nExp = scn.nextInt();

        ArrayList<Alumno> listaParaOrdenar = new ArrayList<>(listaAlumnos.values());
        listaParaOrdenar.sort((o1, o2) -> Double.compare(o2.getNota(), o1.getNota()));

        for (int i = 0; i < nExp; i++) {
            if(i>=listaParaOrdenar.size()){
                System.out.println("No quedan alumnos que mostrar.");
                break;
            }
            System.out.println((i+1)+"- Alumno con DNI "+listaParaOrdenar.get(i).getDni() +
                                    " y nombre " + listaParaOrdenar.get(i).getNombre() +
                                    " con nota " + listaParaOrdenar.get(i).getNota() );
        }

    }

    private void expedientesNotaCorte(){
        System.out.print("Introduce la nota de corte: ");
        double nota = scn.nextDouble();

        listaAlumnos.forEach((s, alumno) -> {
            if (alumno.getNota()>=nota){
                System.out.println("- Alumno con DNI "+alumno.getDni() +
                        " y nombre " + alumno.getNombre() +
                        " con nota " + alumno.getNota() );
            }
        });
    }
}
