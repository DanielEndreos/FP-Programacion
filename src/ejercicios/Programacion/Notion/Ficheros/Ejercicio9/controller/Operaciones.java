package ejercicios.Programacion.Notion.Ficheros.Ejercicio9.controller;
import ejercicios.Programacion.Notion.Ficheros.Ejercicio9.model.Usuario;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Operaciones {

    private String path = "src/ejercicios/Programacion/Notion/Ficheros/Ejercicio9/resources/usuarios.csv";
    public Operaciones(){}

    public void exportarUsuarios(List<Usuario> listaUsuarios){
        File file = new File(path);
        PrintWriter printWriter = null;
        try {

            if (!file.exists()){
                file.createNewFile();
            } else {
                file.delete();
                file.createNewFile();
            }
            printWriter = new PrintWriter(new FileWriter(file, true));
            printWriter.println("nombre,apellido,dni");
            listaUsuarios.stream().forEach(printWriter::println);


        } catch (IOException e) {
            System.out.println("Error en la creación del fichero.");
        } finally {
            try {
                if (printWriter==null){
                    System.out.println("null");
                }
                if(printWriter!=null){
                    printWriter.close();
                }
            }catch (Exception e){
                System.out.println("Fallo en el cerrado.");
            }
        }

    }

    public List<Usuario> importarUsuarios(){
        BufferedReader reader = null;
        List<Usuario> lista = new ArrayList<>();
        try {
            reader = new BufferedReader(new FileReader(new File(path)));
            String linea = reader.readLine(); // Cabecera
            while((linea = reader.readLine())!=null) {
                String[] items = linea.split(",");
                lista.add(new Usuario(items[0], items[1], items[2]));
            }
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe en la ruta.");
        } catch (IOException e) {
            System.out.println("Error en la lectura");
        } finally {
            try {
                if(reader!=null){
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Error en el cierre del lector.");;
            }
        }
        return lista;
    }

    public String getPath() {
        return path;
    }
    public void setPath(String path) {
        this.path = path;
    }

}