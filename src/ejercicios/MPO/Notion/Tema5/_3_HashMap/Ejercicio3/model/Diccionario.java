package ejercicios.MPO.Notion.Tema5._3_HashMap.Ejercicio3.model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class Diccionario {
    HashMap<String, String> diccionario;

    public Diccionario(){
        diccionario = new HashMap<>();
    }

    public void agregarTraduccion(String español, String ingles){
        diccionario.put(español, ingles);
    }

    public String traducir(String palabra){
        if (diccionario.get(palabra) == null){
            return "La palabra no existe en el diccionario";
        } else {
            System.out.printf("Traducción de \"%s\": ", palabra);
            return diccionario.get(palabra);
        }
    }

    public void agregarVariasTraduciones(String[][] traducciones){
        int contador=0;
        for (String[] fila: traducciones){
            String key ="";
            for (String valor : fila){
                if (key.equals("")){
                    key = valor;
                    continue;
                } else {
                    if (diccionario.put(key, valor) == null){
                        contador+=1;
                    }
                }
            }
        }
        System.out.println("Diccionario cargado con "+contador+" palabras.");
    }

    public void listarDiccionario(){
        Set<String> listaKeys = new TreeSet<>(diccionario.keySet());
//        String[] array = new String[listaKeys.size()];
//        Arrays.stream(array).sorted();

        for (String s : listaKeys){
            System.out.printf("Traducción de %s : %s%n", s, diccionario.get(s));
        }

    }

    public int tamanioDiccionario(){
        return diccionario.size();
    }

    public void traducirFrase(String frase){
        System.out.println("Traduciendo la frase: "+frase);
        System.out.print("Traducción: ");
        String[] palabras = frase.split(" ");

        for (String p: palabras){
            System.out.print(diccionario.get(p)+" ");
        }

    }

}
