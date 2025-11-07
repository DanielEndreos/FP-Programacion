package ejercicios;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class EjerciciosWhileDoWhile {

    //Ejercicio 1: Contador básico con while
    public void ejercicio1WdW(Scanner scn){
        //Crea un programa que pida un número N y use un bucle while para contar
        //desde 1 hasta N, mostrando cada número.
        //
        //Ejemplo de salida por consola:
        //
        //Introduce un número: 5
        // Contando con while:
        // 1
        // 2
        // 3
        // 4
        // 5
        // Fin del conteo
        int i = 1;

        System.out.print("\n\nIntroduce un número: ");
        int num = scn.nextInt();

        System.out.println("Contando con while:");
        while (i <= num ) {
            System.out.println(i);
            i++;}
        System.out.println("Fin del conteo");
    };

    //Ejercicio 2: Validación de contraseña con do-while
    public void ejercicio2WdW(Scanner scn){
        // Desarrolla un programa que pida al usuario una contraseña. La contraseña
        //correcta es "1234". Usa un bucle do-while para seguir pidiendo la contraseña
        // hasta que el usuario la introduzca correctamente.
        //
        //Ejemplo de salida por consola:
        // Introduce la contraseña: hola
        // Contraseña incorrecta. Intenta de nuevo.
        // Introduce la contraseña: 5678
        // Contraseña incorrecta. Intenta de nuevo.
        // Introduce la contraseña: 1234
        // ¡Contraseña correcta! Acceso permitido.

        String passwordOk = "1234";
        String password = "";
        do{
            System.out.print("\nIntroduce la contraseña: ");
            password = scn.next();
            if (password.equals(passwordOk)){
                System.out.print("¡Contraseña correcta! Acceso permitido.");
            } else {
                System.out.print("Contraseña incorrecta. Intenta de nuevo.");
            }
        }while(!password.equals(passwordOk));
    };

    //Ejercicio 3: Suma acumulativa con while
    public void ejercicio3WdW(Scanner scn){
        // Escribe un programa que pida números al usuario y los vaya sumando.
        //El bucle while debe continuar mientras el usuario introduzca números
        //positivos. Cuando introduzca un número negativo o cero, el programa
        //debe terminar y mostrar la suma total.
        //
        //Ejemplo de salida por consola:

        //Introduce un número (0 o negativo para terminar): 5
        //Suma actual: 5
        //Introduce un número (0 o negativo para terminar): 10
        //Suma actual: 15
        //Introduce un número (0 o negativo para terminar): 3
        //Suma actual: 18
        //Introduce un número (0 o negativo para terminar): 0
        //Programa terminado. Suma total: 18

        int numA = 0;
        int total = 0;

        while (numA > 0 || total==0){
            System.out.print("\nIntroduce un número (0 o negativo para terminar): ");
            numA = scn.nextInt();
            if (numA > 0){
                total+=numA;
                System.out.printf("Suma actual: %d  ", total);
            }
        }
        System.out.printf("Programa terminado. Suma total: %d  ", total);
    };

    //Ejercicio 4: Adivinar número con do-while
    public void ejercicio4WdW(Scanner scn){
        // Crea un juego donde el programa elige un número secreto entre 1 y 10
        //(por ejemplo, 7). Usa un bucle do-while para pedir al usuario que adivine
        //el número. El programa debe indicar si el número es mayor o menor, y continuar
        //hasta que el usuario acierte.   //
        //
        //1.¡Adivina el número entre 1 y 10!
        //Introduce tu intento: 5
        //El número es mayor. Intenta de nuevo.
        //Introduce tu intento: 8
        //El número es menor. Intenta de nuevo.
        //Introduce tu intento: 7
        //¡Correcto! Has adivinado el número en 3 intentos.
        int numberToFind = (int)(Math.random()*10)+1;
        int numA = 0;
        int intentos = 0;

        System.out.print("\n¡Adivina el número entre 1 y 10!\n");
        do{
            intentos++;
            System.out.print("Introduce tu intento: ");
            numA = scn.nextInt();
            if (numA > numberToFind){
                System.out.println("El número es menor. Intenta de nuevo.");
            } else if (numA < numberToFind){
                System.out.println("El número es mayor. Intenta de nuevo.");
            } else {
                System.out.printf("¡Correcto! Has adivinado el número en %d intentos.", intentos);
            }
        }while(numA!=numberToFind);

    };

    //Ejercicio 5: Menú interactivo con do-while y switch
    public void ejercicio5WdW(Scanner scn){
        // Desarrolla un programa con un menú que se repita usando do-while.
        //El menú debe tener 4 opciones: 1=Saludar, 2=Despedirse, 3=Ver hora actual
        //(puedes mostrar un mensaje fijo), 4=Salir. Usa switch para procesar cada
        //opción. El programa solo debe terminar cuando el usuario elija la opción 4.
        //
        //Ejemplo de salida por consola:
        //--- MENÚ ---
        //1. Saludar
        //2. Despedirse
        //3. Ver hora
        //4. Salir
        //Elige una opción: 1
        //¡Hola! ¿Cómo estás?

        //--- MENÚ ---
        //1. Saludar
        //2. Despedirse
        //3. Ver hora
        //4. Salir
        //Elige una opción: 3
        //La hora actual es: 10:30

        //--- MENÚ ---
        //1. Saludar
        //2. Despedirse
        //3. Ver hora
        //4. Salir
        //Elige una opción: 4
        //¡Hasta luego!

        System.out.println("""
                --- MENÚ ---
                  1. Saludar
                  2. Despedirse
                  3. Ver hora
                  4. Salir""");
        System.out.print("Elige una opción:  ");
        int opt= scn.nextInt();
        String txtopt = "";
        Date data = new Date();

        switch (opt){
            case 1 ->{System.out.print("¡Hola! ¿Cómo estás?");}
            case 2 ->{System.out.print("¡Hasta luego!");}
            case 3 ->{System.out.printf("La hora actual es: %s:%s",data.getHours(), data.getMinutes());}
            case 4 ->{System.out.print("¡Hasta luego!");}
            default -> {System.out.println("Operación no esperada/válida."); return;}
        }
    };

    //Ejercicio 6: Cuenta atrás con while
    public void ejercicio6WdW(Scanner scn){
        // Escribe un programa que pida un número N y use un bucle while
        //para hacer una cuenta atrás desde N hasta 1, mostrando cada número.
        //Al llegar a 1, debe mostrar "¡Despegue!".
        //
        //Ejemplo de salida por consola:
        //Introduce un número: 5
        //Cuenta atrás:
        //5
        //4
        //3
        //2
        //1
        //¡Despegue!

        System.out.print("\n\nIntroduce un número: ");
        int num = scn.nextInt();
        System.out.println("Cuenta atrás: ");
        while (num > 0) {
            System.out.println(num);
            num--;
        }
        System.out.println("¡Despegue!");


    };

    //Ejercicio 7: Calcular promedio con while
    public void ejercicio7WdW(Scanner scn){
        // Crea un programa que pida al usuario cuántas calificaciones va a introducir.
        // Luego, usa un bucle while para pedir cada calificación una por una, sumarlas
        // y al final calcular y mostrar el promedio.
        //
        //Ejemplo de salida por consola:
        //¿Cuántas calificaciones vas a introducir?: 4
        //Introduce la calificación 1: 7.5
        //Introduce la calificación 2: 8.0
        //Introduce la calificación 3: 6.5
        //Introduce la calificación 4: 9.0
        //Suma total: 31.0
        //Promedio de calificaciones: 7.75

        System.out.print("¿Cuántas calificaciones vas a introducir?: ");
        int calificaciones = scn.nextInt();
        int i = 1;
        double totalSuma = 0;
        while (calificaciones > 0){
            System.out.printf("¿Introduce la calificación %d: ",i);
            double valor = scn.nextDouble();
            totalSuma += valor;
            i++;
            calificaciones--;
        }
        System.out.printf("Suma total: %.1f ",totalSuma);
        System.out.printf("\nPromedio de calificaciones: %.2f ",totalSuma/(i-1));
    };

    //Ejercicio 8: Validación de edad con do-while
    public void ejercicio8WdW(Scanner scn){
        // Desarrolla un programa que pida la edad del usuario.
        // Usa un bucle do-while para validar que la edad introducida
        // esté entre 0 y 120. Si no es válida, debe volver a pedirla.
        // Una vez válida, muestra un mensaje de confirmación.
        //
        //Ejemplo de salida por consola:
        //Introduce tu edad: -5
        //Edad no válida. Debe estar entre 0 y 120.
        //Introduce tu edad: 150
        //Edad no válida. Debe estar entre 0 y 120.
        //Introduce tu edad: 25
        //Edad válida: 25 años. ¡Gracias!

        int edad = 0;
        do{
            System.out.print("Introduce tu edad: ");
            edad = scn.nextInt();
            if(edad <0 || edad > 120){
                System.out.println("Edad no válida. Debe estar entre 0 y 120.");
            }
        }while(edad < 0 || edad > 120);
        System.out.printf("Edad válida: %d años.", edad);
    };

    //Ejercicio 9: Combinando while, for y switch - Sistema de notas
    public void ejercicio9WdW(Scanner scn){
        // Crea un programa que pida al usuario cuántos estudiantes hay en una clase.
        // Para cada estudiante, usa un bucle while para pedir su calificación numérica (0-10).
        // Luego, usa un bucle for para mostrar todas las calificaciones y usa un switch para
        // convertir cada nota numérica en letra: 9-10=A, 7-8=B, 5-6=C, 3-4=D, 0-2=F.

        //¿Cuántos estudiantes hay?: 3
        //Introduce la nota del estudiante 1 (0-10): 8
        //Introduce la nota del estudiante 2 (0-10): 6
        //Introduce la nota del estudiante 3 (0-10): 9

        //--- REPORTE DE CALIFICACIONES ---
        //Estudiante 1: 8 puntos = Calificación B
        //Estudiante 2: 6 puntos = Calificación C
        //Estudiante 3: 9 puntos = Calificación A

        System.out.print("¿Cuántos estudiantes hay?: ");
        int num= scn.nextInt();
        int i = 0;
        ArrayList<Integer> listadoNotas = new ArrayList<>();

        while(i < num){
            i++;
            System.out.printf("Introduce la nota del estudiante %d (0-10): ", i);
            int nota= scn.nextInt();
            listadoNotas.add(nota);
        }

        System.out.println("\n--- REPORTE DE CALIFICACIONES ---");
        for (int j = 0; j < listadoNotas.toArray().length; j++) {
            switch (listadoNotas.get(j)){
                case 0,1,2  -> {System.out.printf("Estudiante %d: %d puntos = Calificación %s\n",j+1,listadoNotas.get(j),"F");}
                case 3,4    -> {System.out.printf("Estudiante %d: %d puntos = Calificación %s\n",j+1,listadoNotas.get(j),"D");}
                case 5,6    -> {System.out.printf("Estudiante %d: %d puntos = Calificación %s\n",j+1,listadoNotas.get(j),"C");}
                case 7,8    -> {System.out.printf("Estudiante %d: %d puntos = Calificación %s\n",j+1,listadoNotas.get(j),"B");}
                case 9,10   -> {System.out.printf("Estudiante %d: %d puntos = Calificación %s\n",j+1,listadoNotas.get(j),"A");}
            }
        }
    };

    //Ejercicio 10: Cajero automático con do-while, switch y while
    public void ejercicio10WdW(Scanner scn){
        // Desarrolla un programa que simule un cajero automático.
        // El saldo inicial es 1000€. Usa un bucle do-while para mostrar
        // un menú con opciones: 1=Consultar saldo, 2=Retirar dinero,
        // 3=Depositar dinero, 4=Salir. Usa switch para cada opción. Para
        // retirar dinero, usa un bucle while para validar que no se retire
        // más del saldo disponible (si intenta retirar más, debe volver a
        // pedir la cantidad). Para depositar, valida que sea una cantidad
        // positiva.

        //--- CAJERO AUTOMÁTICO ---
        //Saldo inicial: 1000€

        //--- MENÚ ---
        //. Consultar saldo
        //2. Retirar dinero
        //3. Depositar dinero
        //4. Salir
        //Elige una opción: 1
        //Tu saldo actual es: 1000€

        //--- MENÚ ---
        //1. Consultar saldo
        //2. Retirar dinero
        //3. Depositar dinero
        //4. Salir
        //Elige una opción: 2
        //¿Cuánto deseas retirar?: 1500
        //Fondos insuficientes. Tu saldo es: 1000€
        //¿Cuánto deseas retirar?: 300
        //Retiro exitoso. Has retirado: 300€
        //Nuevo saldo: 700€

        //--- MENÚ ---
        //1. Consultar saldo
        //2. Retirar dinero
        //3. Depositar dinero
        //4. Salir
        //Elige una opción: 3
        //¿Cuánto deseas depositar?: 200
        //Depósito exitoso. Has depositado: 200€
        //Nuevo saldo: 900€

        //--- MENÚ ---
        //1. Consultar saldo
        //2. Retirar dinero
        //3. Depositar dinero
        //4. Salir
        //Elige una opción: 4
        //Gracias por usar el cajero. ¡Hasta luego!

        int saldoActual= 1000;
        int dinero = 0;
        int opcion = 0;

        System.out.printf("""
        --- CAJERO AUTOMÁTICO ---
        Saldo inicial: %d€
        """,saldoActual);

        do{
            System.out.print("""
        \n--- MENÚ ---
        1. Consultar saldo
        2. Retirar dinero
        3. Depositar dinero
        4. Salir
        """);
            System.out.print("Elige una opción: ");
            opcion = scn.nextInt();
            switch (opcion){
                case 1 -> {System.out.printf("Tu saldo actual es: %d€\n", saldoActual);}
                case 2 -> {
                    do{
                        System.out.print("¿Cuánto deseas retirar?: ");
                        dinero = scn.nextInt();
                        if (dinero > saldoActual){
                            System.out.printf("Fondos insuficientes. Tu saldo es: %d€\n",saldoActual);
                        }
                    }while(dinero > saldoActual);
                    saldoActual-=dinero;
                    System.out.printf("Retiro exitoso. Has retirado: %d€\n",dinero);
                    System.out.printf("Nuevo saldo: %d€\n",saldoActual);
                }
                case 3 -> {
                    do{
                        System.out.print("¿Cuánto deseas depositar?: ");
                        dinero = scn.nextInt();
                        if (dinero < 0){
                            System.out.print("No se puede ingresar valores negativos.");
                        }
                    }while(dinero < 0);
                    saldoActual+=dinero;
                    System.out.printf("Depósito exitoso. Has depositado: %d€\n",dinero);
                    System.out.printf("Nuevo saldo: %d€\n",saldoActual);
                }
            }
        }while(opcion != 4);
        System.out.print("Gracias por usar el cajero. ¡Hasta luego!");
    };
}
