package ejercicios.Programacion.ThePower.Tema6.EjercicioRutas;

import java.io.*;
import java.util.Scanner;

public class Operaciones {

    public void leerContenidoFichero(String path){
        // File -> FileReader

        File file = new File(path);

        FileReader fileReader = null;

        try {
            fileReader = new FileReader(file);
            int codigo = -1;

            String texto = "";
            while((codigo = fileReader.read()) !=-1){
/*//                System.out.print(codigo);
//                System.out.print(" - ");
//                System.out.println((char)codigo);

//                System.out.println("");
               // System.out.print((char)codigo);*/
                texto += (char)codigo;
            }
            String[] a = texto.split(" ");

            for (String b : a){
                System.out.print((char)Integer.parseInt(b));

            }

        } catch (FileNotFoundException e) {
            System.out.println("El fichero que intentas leer no existe");
        } catch (IOException e){
            System.out.println("No cuentas con los permisos suficientes.");
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                System.out.println("Error en el cerrado.");
            }
        }

    }

    public void leerContenidoFicheroLineas(String path){
        //File -> FileReader -> BufferedReader
        File file = new File(path);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try{
            bufferedReader = new BufferedReader(new FileReader(file));

            String linea;
            while ((linea = bufferedReader.readLine())!=null) {
               System.out.println(linea);
            }

        } catch (FileNotFoundException e){
            System.out.println("La ruta es incorrecta");
        } catch (IOException e) {
            System.out.println("No tienes permisos de lectura.");
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException  | NullPointerException e) {
                System.out.println("Error en el cerrado del fichero");
            }
        }
    }

    public void descifrarContenido(String path){
        File file = new File(path);
        BufferedReader reader = null;

        try{
            reader = new BufferedReader(new FileReader(file));
            String linea = reader.readLine();
            System.out.println(linea);
            String[] numeros = linea.split(" ");

            for (String texto : numeros){
                System.out.print((char)Integer.parseInt(texto));
            }

        } catch (FileNotFoundException e) {
            System.out.println("El fichero no es válido");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                reader.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Error en el cerrado-");
            }
        }
    }

    public void escrituraFichero(String path){
        File file = new File(path);
        FileWriter fileWriter = null;
        Scanner scn = new Scanner(System.in);

        try {

            fileWriter = new FileWriter(file, true);
            System.out.print("Dime que quieres guardar en el fichero: ");
            String mensaje = scn.nextLine();
            //fileWriter.write(mensaje+"\n");

            for (int i = 0; i < mensaje.length(); i++) {
                char letra = mensaje.charAt(i);
                int valor = (int) letra;
                fileWriter.write(String.valueOf(valor));
                fileWriter.write(" ");
            }
//            fileWriter.write("Esto es un ejemplo");
            fileWriter.append("\n");

        } catch (IOException e) {
            System.out.println("Error en la escritura del fichero.");
        } finally {
            try {
                fileWriter.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Error en el cerrado.");
            }
        }
    }
}
