package ejercicios.Entornos.Antonio;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Import Scanner
        Scanner scn = new Scanner(System.in);

        // Inicialización variables
        boolean valido = false;
        int valorInt = 0;
        int[] numList = new int[0];

        // Primera parte, solicitar cantidad
        do{
            System.out.print("¿Cuantos números quieres introducir, ordenar y clasificar por par/impar? ");
            try {
                valorInt = Integer.parseInt(scn.next());
                numList = new int[valorInt];
            } catch (NumberFormatException e){
                System.out.println("Error: El valor introducido no es un número válido.");
            } catch (NegativeArraySizeException e){
                System.out.println("Error: El valor debe ser mayor que 0.");
            }
            if (valorInt >0) valido=true;
        }while(!valido);

        // Segunda parte, solicitar cada valor
        System.out.println("Escribe " + numList.length + " números.");

        for (int i = 0; i < numList.length; i++) {
            System.out.printf("Num %d: ", i+1);
            try{
                valorInt = Integer.parseInt(scn.next());
                numList[i] = valorInt;
            } catch (NumberFormatException e) {
                System.out.println("Error: El valor introducido no es un número válido.");
                i--;
            }
        }

        // Filtrar por pares e impares
        long pares   = Arrays.stream(numList).filter(n -> n%2==0).count();
        long impares = numList.length - pares;

        // Ordenar y mostrar valores
        System.out.println("Desordenados: \t" +Arrays.toString(numList));
        Arrays.sort(numList);
        System.out.println("Ordenados: \t\t" + Arrays.toString(numList));
        System.out.println("Pares: " + pares + " Impares: " + impares);

        scn.close();
    }

}
