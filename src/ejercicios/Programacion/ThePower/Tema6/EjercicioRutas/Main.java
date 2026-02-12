package ejercicios.Programacion.ThePower.Tema6.EjercicioRutas;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        int profundidad = -1;
        String rutaBase= "src/ejercicios/Programacion/ThePower/Tema6/EjercicioRutas/rutasejemplo/";

//        System.out.println("""
//
//                Estructura tipo 1:
//                -----------------------------""");
//        profundidad = tree(rutaBase, profundidad);
//
//        System.out.println("""
//
//                Estructura tipo 2:
//                -----------------------------""");
//        profundidad = -1;
//        profundidad = tree2(rutaBase, profundidad);
//
//        System.out.println("""
//
//                Estructura tipo 3:
//                -----------------------------""");
//        profundidad = -1;
//        profundidad = tree3(rutaBase, profundidad);


        Operaciones operaciones = new Operaciones();

       // operaciones.leerContenidoFichero("src/ejercicios/Programacion/ThePower/Tema6/EjercicioRutas/rutasejemplo/file.txt");
        // operaciones.leerContenidoFicheroLineas("src/ejercicios/Programacion/ThePower/Tema6/EjercicioRutas/rutasejemplo/file2.txt");
        //operaciones.descifrarContenido("src/ejercicios/Programacion/ThePower/Tema6/EjercicioRutas/rutasejemplo/file.txt");
        operaciones.escrituraFichero("src/ejercicios/Programacion/ThePower/Tema6/EjercicioRutas/rutasejemplo/escritura.txt");
    

    }
//
//    public static int tree(String rutaBase, int profundidad){
//
//        profundidad +=1;
//        File ruta = new File(rutaBase);
//
//
//        for (File file : ruta.listFiles(File::isFile)) {
//            for (int i = 0; i < profundidad; i++) {
//                    System.out.print("\t");
//            }
//
//                System.out.println(file.getName());
//        }
//
//        for (File file : ruta.listFiles(File::isDirectory)) {
//            for (int i = 0; i < profundidad; i++) {
//                  System.out.print("\t");
//            }
//            System.out.println(file.getName());
//            profundidad = tree(file.getPath(), profundidad);
//            profundidad -=1;
//        }
//        return profundidad;
//    }
//
//    public static int tree2(String rutaBase, int profundidad){
//
//        profundidad +=1;
//        File ruta = new File(rutaBase);
//
//        for (File file : ruta.listFiles(File::isFile)) {
//            for (int i = 0; i < profundidad; i++) {
//                System.out.print("\t");
//            }
//
//            System.out.println("..\\"+file.getName());
//        }
//
//        for (File file : ruta.listFiles(File::isDirectory)) {
//            for (int i = 0; i < profundidad; i++) {
//                System.out.print("\t");
//            }
//            System.out.println("..\\"+file.getName());
//            profundidad = tree2(file.getPath(), profundidad);
//            profundidad -=1;
//        }
//        return profundidad;
//    }
//
//    public static int tree3(String rutaBase, int profundidad){
//
//        profundidad +=1;
//        File ruta = new File(rutaBase);
//
//        for (File file : ruta.listFiles(File::isFile)) {
//            String[] a = file.getPath().split("\\\\");
//            for (int i = profundidad; i >= 0; i--) {
//                System.out.print(a[a.length-2-i]+'\\');
//            }
//
//            System.out.println(file.getName());
//        }
//
//        for (File file : ruta.listFiles(File::isDirectory)) {
//            String[] a = file.getPath().split("\\\\");
//            for (int i = profundidad; i >= 0; i--) {
//                System.out.print(a[a.length-2-i]+'\\');
//            }
//
//            System.out.println(file.getName());
//            profundidad = tree3(file.getPath(), profundidad);
//            profundidad -=1;
//        }
//        return profundidad;
//    }
}
