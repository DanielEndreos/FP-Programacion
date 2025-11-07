package ejercicios;

import java.util.Scanner;

public class EjerciciosT2 {

    //Ejercicio 1: Operadores aritméticos básicos
    public void ejercicio1T2(Scanner scn){
        //  Crea un programa que pida al usuario dos números enteros por    //
        //  consola y muestre el resultado de las cinco operaciones         //
        //  aritméticas básicas: suma, resta, multiplicación, división y    //
        //  módulo (resto).                                                 //

        System.out.print("\n\nIntroduce el primer número:");
        int numA = scn.nextInt();
        System.out.print("Introduce el segundo número:");
        int numB = scn.nextInt();
        System.out.printf("Suma: %d", numA+numB);
        System.out.printf("\nResta: %d", numA-numB);
        System.out.printf("\nMultiplicación: %d", numA*numB);
        System.out.printf("\nDivisión: %.2f", (double)numA/numB);
        System.out.printf("\nMódulo (resto): %d", numA%numB);
    };

    //Ejercicio 2: Comparación de números
    public void ejercicio2T2(Scanner scn){
        //  Escribe un programa que pida dos números al usuario     //
        //  y muestre el resultado de todas las comparaciones       //
        //  relacionales entre ellos (mayor que, menor que,         //
        //  igual, diferente, mayor o igual, menor o igual).        //

        System.out.print("\n\nIntroduce el primer número:");
        int numA = scn.nextInt();
        System.out.print("Introduce el segundo número:");
        int numB = scn.nextInt();
        System.out.printf("¿.%d es mayor que .%d?: %s", numA, numB, (numA>numB));
        System.out.printf("\n¿.%d es menor que .%d?: %s", numA, numB, (numA<numB));
        System.out.printf("\n¿.%d es igual que .%d?: %s", numA, numB, (numA==numB));
        System.out.printf("\n¿.%d es diferente que .%d?: %s", numA, numB,(numA!=numB));
        System.out.printf("\n¿.%d es mayor o igual que .%d?: %s ", numA, numB, (numA>=numB));
        System.out.printf("\n¿.%d es menor o igual que .%d?: %s", numA, numB, (numA<=numB));
    };

    //Ejercicio 3: Operadores de asignación compuesta
    public void ejercicio3T2(){
        // Crea un programa que declare una variable con valor inicial 100      //
        // y aplique diferentes operadores de asignación compuesta (+=, -=,     //
        // *=, /=). Muestra el valor de la variable después de cada operación.  //

        int numA = 100;
        System.out.printf("Valor inicial: %d", numA);
        System.out.printf("\nDespués de sumar 50 (+=): %d", numA+= 50);
        System.out.printf("\nDespués de restar 30 (-=): %d", numA-= 30);
        System.out.printf("\nDespués de multiplicar por 2 (*=): %d", numA*= 2);
        System.out.printf("\nDespués de dividir entre 4 (/=): %d", numA/=4);
    };

    //Ejercicio 4: Número par o impar
    public void ejercicio4T2(Scanner scn){
        // Desarrolla un programa que pida un número al usuario y   //
        // determine si es par o impar usando el operador módulo.   //
        // Muestra el resultado por consola.                        //

        System.out.print("\nIntroduce un número:");
        int numA = scn.nextInt();
        int resto = numA%2;
        String parImpar = "";

        if (resto==0){
            parImpar = "par";
        }else{
            parImpar = "impar";
        };

        System.out.printf("El número %d es %s (resto al dividir entre 2: %d)", numA, parImpar, resto);
    };

    //Ejercicio 5: Operadores lógicos AND y OR
    public void ejercicio5T2(Scanner scn){
        // Crea un programa que pida la edad del usuario y si tiene     //
        // carnet de conducir (true/false). Usa operadores lógicos      //
        // para determinar si puede alquilar un coche (debe tener       //
        // 21 años o más Y tener carnet).                               //

        System.out.print("\nIntroduce tu edad: ");
        int edad = scn.nextInt();
        System.out.print("\n¿Tienes carnet de conducir? (true/false): ");
        boolean carnetConducir = scn.nextBoolean();

        System.out.printf("""
                ¿Eres mayor de 21 años?: %s
                ¿Tienes carnet?: %s
                ¿Puedes alquilar un coche? (AND): %s
                """, edad>=18, carnetConducir, edad>=18 && carnetConducir);
    };

    //Ejercicio 6: Calculadora de descuento
    public void ejercicio6T2(Scanner scn){
        // Escribe un programa que pida el precio de un producto y el       //
        // porcentaje de descuento. Calcula el precio final después del     //
        // descuento usando operadores aritméticos y muestra todos los      //
        // pasos del cálculo.                                               //

        System.out.print("\nIntroduce el precio del producto: ");
        double precio = scn.nextDouble();
        System.out.print("\nIntroduce el porcentaje de descuento: ");
        int descuento = scn.nextInt();
        System.out.printf("""
                Precio original: %.1f€
                Descuento (%d%%): %.1f€
                Precio final: %.1f€
                """, precio, descuento, precio*(descuento/100.0),((100-descuento)/100.0)*precio);
        };

    //Ejercicio 7: Operador NOT y condiciones compuestas
    public void ejercicio7T2(Scanner scn){
        // Crea un programa que pida al usuario su edad y si es             //
        // estudiante (true/false). Usa operadores lógicos (AND,            //
        // OR, NOT) para determinar si puede acceder a diferentes           //
        // descuentos: descuento joven (menor de 26 años), descuento        //
        // estudiante, o descuento especial (menor de 26 Y estudiante).     //

        System.out.print("\nIntroduce tu edad: ");
        int edad = scn.nextInt();
        System.out.print("¿Eres estudiante? (true/false): ");
        boolean estudiante = scn.nextBoolean();
        System.out.printf("""
                ¿Eres menor de 26 años?: %s
                ¿Eres estudiante?: %s
                ¿NO eres estudiante?: %s
                ¿Tienes descuento joven? (menor de 26): %s
                ¿Tienes descuento estudiante?: %s
                ¿Tienes descuento especial? (menor de 26 AND estudiante): %s                
                """, edad<26, estudiante, !estudiante, edad<26, estudiante, estudiante && edad<26);
    };

    //Ejercicio 8: Operaciones combinadas
    public void ejercicio8T2(Scanner scn){
        // Desarrolla un programa que pida tres números al usuario      //
        // y calcule: la suma de los tres, el promedio, el resultado    //
        // de multiplicar el primero por el segundo y dividirlo entre   //
        // el tercero. Usa paréntesis para controlar la precedencia de  //
        // operadores.                                                  //

        System.out.print("\nIntroduce el primer número: ");
        int numA = scn.nextInt();
        System.out.print("Introduce el segundo número: ");
        int numB = scn.nextInt();
        System.out.print("Introduce el tercer número: ");
        int numC = scn.nextInt();

        System.out.printf("\nSuma de los tres números: %d ", numA+numB+numC);
        System.out.printf("\nPromedio: %d ", (numA+numB+numC)/3);
        System.out.printf("\nResultado de (%d * %d) / %d: %.2f ", numA, numB, numC, (numA*numB)/(double)numC);

    };

    //Ejercicio 9: Sistema de calificaciones TODO
    public void ejercicio9T2(Scanner scn){
        // Escribe un programa que pida al usuario la puntuación de tres exámenes.        //
        // Calcula la nota media y usa operadores relacionales para determinar si         //
        // ha aprobado (>=5), si tiene notable (>=7), y si tiene sobresaliente (>=9).     //
        // Muestra todos los resultados.                                                  //

        System.out.print("\nIntroduce la nota del primer examen: ");
        double nota1 = scn.nextDouble();

        System.out.print("Introduce la nota del segundo examen: ");
        double nota2 = scn.nextDouble();

        System.out.print("Introduce la nota del tercer examen: ");
        double nota3 = scn.nextDouble();

        double media = (nota1+nota2+nota3)/3;

        System.out.printf("""
                Nota media: %.1f
                ¿Ha aprobado? (>=5): %s
                ¿Tiene notable? (>=7): %s
                ¿Tiene sobresaliente? (>=9): %s
                """, media, media>=5, media>=7, media>=9 );
};

    //Ejercicio 10: Calculadora de salario con condiciones TODO
    public void ejercicio10T2(Scanner scn){
        // Crea un programa que pida el salario base por hora, las      //
        // horas trabajadas y si ha hecho horas extra (true/false).     //
        // Si ha hecho horas extra y trabajó más de 40 horas, las       //
        // horas que excedan de 40 se pagan al doble. Usa operadores    //
        // lógicos, relacionales y aritméticos para calcular el salario //
        // total.                                                       //

        System.out.println("Introduce el salario por hora: ");
        double salarioBase = scn.nextDouble();
        System.out.println("Introduce las horas trabajadas: ");
        int horasTrabajadas = scn.nextInt();
        System.out.println("¿Has hecho horas extra? (true/false):");
        boolean horasExtraTrabajadas = scn.nextBoolean();

        int horasDobles = 0;
        int horasNormales = 0;

        if (!horasExtraTrabajadas && horasTrabajadas>40){
            System.out.printf("""
                    Algo no has hecho bien, has trabajado más de 40 horas (%dh) y dices
                    no haber hecho horas extra.
                    """, horasTrabajadas);
        } else if (horasExtraTrabajadas && horasTrabajadas<40){
            System.out.printf("""
                    Algo no has hecho bien, has trabajado menos de 40 horas (%dh) y dices
                    haber hecho horas extra.
                    """, horasTrabajadas);
        } else {
            if (horasExtraTrabajadas && horasTrabajadas>40){
                horasDobles = horasTrabajadas - 40;
                horasNormales = 40;
            } else {
                horasDobles = 0;
                horasNormales = horasTrabajadas;
            }
            System.out.printf("""
                Horas normales (máximo 40): %d
                Horas extra: %d
                ¿Se aplican horas extra? (>40 AND permitido): %s
                Salario por horas normales: %.1f
                Salario por horas extra (al doble): %.1f
                Salario total: %.1f    
                """, horasNormales,
                     horasDobles,
                     horasExtraTrabajadas,
                     horasNormales*salarioBase,
                     horasDobles*(salarioBase*2),
                    ((horasNormales*salarioBase) + (horasDobles*(salarioBase*2))));


        }

    };

}
