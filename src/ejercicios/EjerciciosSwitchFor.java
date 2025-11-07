package ejercicios;

import java.math.BigInteger;
import java.util.Scanner;

public class EjerciciosSwitchFor {

    //Ejercicio 1: Día de la semana
    public void ejercicio1SF(Scanner scn){
        //  Crea un programa que pida un número del 1 al 7 y use un switch para      //
        //  mostrar el día de la semana correspondiente (1=Lunes, 2=Martes, etc.).   //
        //                                                                           //
        //Ejemplo de salida por consola:                                             //
        // Introduce un número (1-7): 3                                              //
        //El día 3 es: Miércoles                                                     //

        System.out.print("\n\nIntroduce un número (1-7):");
        int num = scn.nextInt();

        switch (num){
            case 1 ->  {System.out.printf("El día %d es Lunes.",num);}
            case 2 ->  {System.out.printf("El día %d es Martes.",num);}
            case 3 ->  {System.out.printf("El día %d es Miércoles.",num);}
            case 4 ->  {System.out.printf("El día %d es Jueves.",num);}
            case 5 ->  {System.out.printf("El día %d es Viernes.",num);}
            case 6 ->  {System.out.printf("El día %d es Sábado.",num);}
            case 7 ->  {System.out.printf("El día %d es Domingo.",num);}
            default -> {System.out.println("El número introducido no es compatible con día.");}
        };
    };

    //Ejercicio 2: Calificación con switch
    public void ejercicio2SF(Scanner scn){
        // Desarrolla un programa que pida una letra de calificación (A, B, C, D, F)
        // y use un switch para mostrar el mensaje correspondiente: A="Excelente",
        // B="Muy bien", C="Bien", D="Suficiente", F="Insuficiente".
        //                                                                              //
        //Ejemplo de salida por consola:                                                //
        // Introduce tu calificación (A-F): B                                           //
        //Calificación B: Muy bien                                                      //

        System.out.print("\n\nIntroduce tu calificación (A-F):");
        String letra = scn.nextLine().toUpperCase();
        String calif = "";

        switch (letra){
            case "A" ->{calif = "Excelente";}
            case "B" ->{calif = "Muy Bien";}
            case "C" ->{calif = "Bien";}
            case "D" ->{calif = "Suficiente";}
            case "F" ->{calif = "Insuficiente";}
            default -> {System.out.println("Letra no esperada."); return;}
        }
        System.out.printf("Calificación %s: %s", letra, calif);
    };

    //Ejercicio 3: Calculadora básica con switch
    public void ejercicio3SF(Scanner scn){
        // Escribe un programa que pida dos números y una operación (+, -, *, /).   //
        // Usa un switch para realizar la operación correspondiente y mostrar el    //
        // resultado.                                                               //
        //                                                                          //
        //Ejemplo de salida por consola:

        //Introduce el primer número: 10
        //Introduce el segundo número: 5
        //Introduce la operación (+, -, *, /): *
        //Resultado: 10 * 5 = 50

        System.out.print("\nIntroduce el primer número: ");
        int numA = scn.nextInt();
        System.out.print("Introduce el segundo número: ");
        int numB = scn.nextInt();
        System.out.print("Introduce la operación (+, -, *, /): ");
        String ope = scn.next();

        double resultado = 0;
        switch (ope){
            case "+" ->{resultado = numA+numB;}
            case "-" ->{resultado = numA-numB;}
            case "*" ->{resultado = numA*numB;}
            case "/" ->{resultado = (double)numA/numB;}
            default -> {System.out.println("Operación no esperada/válida."); return;}
        }
        System.out.printf("Resultado: %d %s %d = %.1f", numA, ope, numB, resultado);
    };

    //Ejercicio 4: Menú de opciones
    public void ejercicio4SF(Scanner scn){
        // Crea un programa que muestre un menú con 4 opciones: 1=Ver perfil,        //
        // 2=Configuración, 3=Ayuda, 4=Salir. Pide al usuario que elija una opción   //
        // y usa un switch para mostrar el mensaje correspondiente a cada opción.    //
        //--- MENÚ ---
        //1. Ver perfil
        //2. Configuración
        //3. Ayuda
        //4. Salir
        //Elige una opción: 2
        //Has seleccionado: Configuración

        System.out.println("""
                --- MENÚ ---
                  1. Ver perfil
                  2. Configuración
                  3. Ayuda
                  4. Salir
                """);
        System.out.print("Elige una opción:  ");
        int opt= scn.nextInt();
        String txtopt = "";

        switch (opt){
            case 1 ->{txtopt = "Ver perfil";}
            case 2 ->{txtopt = "Configuración";}
            case 3 ->{txtopt = "Ayuda";}
            case 4 ->{txtopt = "Salir";}
            default -> {System.out.println("Operación no esperada/válida."); return;}
        }
        System.out.printf("Has seleccionado: %s", txtopt);
    };

    //Ejercicio 5: Estaciones del año
    public void ejercicio5SF(Scanner scn){
        // Desarrolla un programa que pida un mes (número del 1 al 12) y use un
        // switch para determinar la estación del año: Invierno (12, 1, 2),
        // Primavera (3, 4, 5), Verano (6, 7, 8), Otoño (9, 10, 11).
        //
        //Ejemplo de salida por consola:
        //Introduce el número del mes (1-12): 7
        //El mes 7 corresponde a: Verano

        System.out.print("Introduce el número del mes (1-12):  ");
        int mes= scn.nextInt();
        String txtEstacion = "";

        switch (mes){
            case 12, 1, 2  ->{txtEstacion = "Invierno";}
            case 3, 4, 5   ->{txtEstacion = "Primavera";}
            case 6, 7, 8   ->{txtEstacion = "Verano";}
            case 9, 10, 11 ->{txtEstacion = "Otoño";}
            default -> {System.out.println("Operación no esperada/válida."); return;}
        }
        System.out.printf("El mes %d corresponde a: %s", mes, txtEstacion);
    };

    //Ejercicio 6: Tabla de multiplicar con for
    public void ejercicio6SF(Scanner scn){
        // Escribe un programa que pida un número y use un bucle for
        // para mostrar su tabla de multiplicar del 1 al 10.
        //
        //Ejemplo de salida por consola:
        //Introduce un número: 5
        //Tabla del 5:
        //5 x 1 = 5
        //5 x 2 = 10
        //5 x 3 = 15
        //5 x 4 = 20
        //5 x 5 = 25
        //5 x 6 = 30
        //5 x 7 = 35
        //5 x 8 = 40
        //5 x 9 = 45
        //5 x 10 = 50

        System.out.print("Introduce un número: ");
        int num= scn.nextInt();

        System.out.printf("Tabla del %d:%n", num);
        for (int i = 0; i <=10; i++){
            System.out.printf("%d x %d = %d%n",num, i, i*num);
        };

    };

    //Ejercicio 7: Suma de números con for
    public void ejercicio7SF(Scanner scn){
        // Crea un programa que pida un número N y use un bucle
        // for para calcular la suma de todos los números desde
        // 1 hasta N. Muestra el resultado final.
        //
        //Ejemplo de salida por consola:
        //Introduce un número: 5
        //Sumando: 1 + 2 + 3 + 4 + 5
        //La suma de números del 1 al 5 es: 15

        System.out.print("Introduce un número: ");
        int num= scn.nextInt();

        String textoSuma= "Sumando: ";
        int contaje = 0;

        for (int i = 1; i <=num; i++){
            textoSuma += i;
            contaje += i;
            if(i != num){
                textoSuma += " + ";
            }
        };
        System.out.println(textoSuma);
        System.out.printf("La suma de los números 1 al %d es: %d", num, contaje);
    };

    //Ejercicio 8: Contar números pares e impares
    public void ejercicio8SF(Scanner scn){
        // Desarrolla un programa que pida un número N y use un bucle
        // for para contar cuántos números pares e impares hay desde 1
        // hasta N. Muestra ambos contadores.
        //
        //Ejemplo de salida por consola:
        //Introduce un número: 10
        //Recorriendo números del 1 al 10...
        //Números pares encontrados: 5
        //Números impares encontrados: 5

        System.out.print("Introduce un número: ");
        int num= scn.nextInt();
        System.out.printf("Recorriendo números del 1 al %s... ",num);
        int numpares = 0;

        for (int i = 1; i <=num; i++){
            if (i%2==0){
                numpares++;
            }
        };
        System.out.printf("%nNúmeros pares encontrados %d", numpares);
        System.out.printf("%nNúmeros impares encontrados %d", num-numpares);
    };

    //Ejercicio 9: Factorial con for
    public void ejercicio9SF(Scanner scn){
        // Escribe un programa que pida un número entero positivo y calcule
        // su factorial usando un bucle for. El factorial de N es:
        // N! = N × (N-1) × (N-2) × ... × 1

        //Introduce un número: 5
        //Calculando 5!
        //5 x 4 x 3 x 2 x 1
        //El factorial de 5 es: 120

        System.out.print("Introduce un número: ");
        int num= scn.nextInt();
        System.out.printf("Calculando %d!", num);
        String text = "";
        BigInteger contaje = BigInteger.valueOf(1);

        for (int i = num; i > 0; i--){
            text += i;
            contaje= contaje.multiply(BigInteger.valueOf(i));
            if (i > 1){
                text += " x ";
            }
        };
        System.out.printf("%n%s", text);
        System.out.printf("%nEl factorial de %d es: %d", num, contaje);
    };

    //Ejercicio 10: Combinando switch y for - Sistema de repeticiones
    public void ejercicio10SF(Scanner scn){
        // Crea un programa que muestre un menú con 3 tipos de ejercicios:
        // 1=Flexiones, 2=Abdominales, 3=Sentadillas. Pide al usuario que
        // elija un ejercicio y cuántas repeticiones quiere hacer. Usa un
        // switch para determinar el ejercicio y un for para contar las
        // repeticiones una a una.

        //--- EJERCICIOS ---
        //1. Flexiones
        //2. Abdominales
        //3. Sentadillas
        //Elige un ejercicio (1-3): 1
        //¿Cuántas repeticiones?: 5
        //Has elegido: Flexiones
        //Repetición 1 completada
        //Repetición 2 completada
        //Repetición 3 completada
        //Repetición 4 completada
        //Repetición 5 completada
        //¡Ejercicio completado! Has hecho 5 flexiones.

        System.out.print("""
        --- EJERCICIOS ---
          1. Flexiones
          2. Abdominales
          3. Sentadillas
        """);
        System.out.printf("Elige un ejercicio (1-3): ");
        int eje = scn.nextInt();

        String txteje = "";
        switch (eje){
            case 1 -> {txteje = "Flexiones";}
            case 2 -> {txteje = "Abdominales";}
            case 3 -> {txteje = "Sentadillas";}
            default -> {System.out.println("Operación no esperada/válida."); return;}
        }

        System.out.printf("¿Cuantas repeticiones? ");
        int repet = scn.nextInt();

        System.out.printf("Has elegido: %s", txteje);

        for (int i = 1; i <= repet; i++){
            System.out.printf("%nRepetición %d completada", i);
        };
        System.out.printf("%n¡Ejercicio completado! Has hecho %s flexiones.", repet);

    };

}
