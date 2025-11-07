package ejercicios;

import java.util.Locale;
import java.util.Scanner;

public class EjerciciosT3 {

    //Ejercicio 1: Mayor de edad
    public void ejercicio1T3(Scanner scn){
        //  Crea un programa que pida la edad del usuario y determine   //
        //  si es mayor de edad (18 años o más). Muestra un mensaje     //
        //  indicando si puede votar o no.                              //

        System.out.print("\n\nIntroduce tu edad:");
        int edad = scn.nextInt();
        if (edad >= 18){
            System.out.println("Eres mayor de edad. Puedes votar.");
        } else {
            System.out.println("Eres menor de edad. No puedes votar.");
        }
    };

    //Ejercicio 2: Número positivo o negativo
    public void ejercicio2T3(Scanner scn){
        //  Desarrolla un programa que pida un número al usuario y       //
        //  determine si es positivo, negativo o cero. Muestra el        //
        //  resultado por consola.                                       //

        System.out.print("\n\nIntroduce un número:");
        int numA = scn.nextInt();
        if (numA < 0 ){
            System.out.println("El número es negativo.");
        } else if (numA > 0){
            System.out.println("El número es positivo.");
        } else {
            System.out.println("El número es cero.");
        }
    };

    //Ejercicio 3: Aprobado o suspenso
    public void ejercicio3T3(Scanner scn){
        // Escribe un programa que pida la nota de un examen    //
        // (entre 0 y 10) y determine si el alumno ha aprobado  //
        // (nota mayor o igual a 5) o ha suspendido.            //

        //Introduce tu nota: 6.5
        //¡Enhorabuena! Has aprobado

        System.out.print("Introduce tu nota: ");
        double nota = scn.nextDouble();
        if (nota < 0 || nota > 10) {
            System.out.printf("""
            Has introducido una nota fuera de rango (0..10).
            Nota introducida: %.2f
            
            """, nota);
            } else {
            if (nota >= 5.0){
                System.out.println("¡Enhorabuena! Has aprobado.");
            } else {
                System.out.println("¡Qué lástima! Has suspendido.");
            }
        }

    };

    //Ejercicio 4: Descuento por compra
    public void ejercicio4T3(Scanner scn){
        // Crea un programa que pida el importe de una compra.    //
        // Si el importe es mayor o igual a 100€, aplica un       //
        // descuento del 10%. Muestra el importe original y el    //
        // importe final a pagar.                                 //

        System.out.println("Introduce el importe de la compra: ");
        double importeCompra = scn.nextDouble();
        double importeDescuento = 0.0;

        if (importeCompra >= 100.0) {
            importeDescuento = (importeCompra * 10/100);
        };

        System.out.printf("""
                Importe original: %.1f
                Descuento aplicado: %.1f
                Importe final: %.1f      
                """, importeCompra, importeDescuento, importeCompra-importeDescuento);
    };

    //Ejercicio 5: Número par o impar con mensaje
    public void ejercicio5T3(Scanner scn){
        // Desarrolla un programa que pida un número entero y       //
        // determine si es par o impar usando el operador módulo.   //
        // Muestra un mensaje personalizado para cada caso.         //

        System.out.print("\nIntroduce un número: ");
        int numA = scn.nextInt();

        if ((numA%2)==0){
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        };

    };

    //Ejercicio 6: Acceso a contenido por edad
    public void ejercicio6T3(Scanner scn){
        // Escribe un programa que pida la edad del usuario y determine   //
        // si puede acceder a contenido para mayores de 16 años. Si tiene //
        // 16 o más años, muestra "Acceso permitido", si no, muestra      //
        // "Acceso denegado".                                             //

        System.out.print("\nIntroduce tu edad: ");
        int edad = scn.nextInt();

        if (edad < 16){
            System.out.println("Acceso denegado. Debes tener al menos 16 años.");
        } else {
            System.out.println("Acceso permitido.");
        };
    };

    //Ejercicio 7: Calificación con letra
    public void ejercicio7T3(Scanner scn){
        // Crea un programa que pida una nota numérica (0-10) y determine   //
        // la calificación: Suspenso (0-4), Aprobado (5-6), Notable (7-8)   //
        // o Sobresaliente (9-10).                                          //

//        Introduce tu nota: 8
  //      Tu calificación es: Notable

        System.out.print("\nIntroduce tu nota: ");
        double nota = scn.nextDouble();

        if (nota < 0.0 || nota > 10.0 ) {
            System.out.printf("Introduce una nota correcta, %.1f no está comprendido entre 0 y 10", nota);
        } else {
            if (nota < 5) {
                System.out.println("Tu calificación es: Suspenso");
            } else if (nota < 7) {
                System.out.println("Tu calificación es: Aprobado");
            } else if (nota < 9) {
                System.out.println("Tu calificación es: Notable");
            } else {
                System.out.println("Tu calificación es: Sobresaliente");
            };
        };
    };

    //Ejercicio 8: Comparar dos números
    public void ejercicio8T3(Scanner scn){
        // Desarrolla un programa que pida dos números al usuario    //
        // y determine cuál es mayor, o si son iguales. Muestra el   //
        // resultado por consola.                                    //

        System.out.println("Introducie el primer número: ");
        int numA = scn.nextInt();
        System.out.println("Introducie el segundo número: ");
        int numB = scn.nextInt();

        if (numA > numB){
            System.out.printf("El número %d es mayor que %d. ", numA, numB);
        } else if (numB > numA){
            System.out.printf("El número %d es mayor que %d. ", numB, numA);
        } else {
            System.out.println("Los números son iguales.");
        };
    };

    //Ejercicio 9: Calculadora de IMC básica
    public void ejercicio9T3(Scanner scn){
        // Escribe un programa que pida el peso (en kg) y la altura         //
        // (en metros) del usuario. Calcula el IMC (peso / altura²)         //
        // y determina si está en peso normal (IMC entre 18.5 y 24.9),      //
        // por debajo del peso normal (IMC menor a 18.5) o por encima       //
        // del peso normal (IMC mayor a 24.9).                              //

        /*Introduce tu peso en kg: 70
        Introduce tu altura en metros: 1.75
        Tu IMC es: 22.86
        Estás en peso normal.
        */

        System.out.print("Introduce tu peso en Kg: ");
        double peso = scn.nextDouble();
        System.out.print("Introduce tu altura en metros: ");
        double altura = scn.nextDouble();

        // Cálculo IMC y muestreo por consola
        double imc = (peso / (altura*altura));
        System.out.printf("Tu IMC es: %.2f:", imc);

        // Cálculo del peso
        if (imc < 18.5){
            System.out.println("\nTu peso está por debajo de lo normal.");
        } else if (imc > 24.9) {
            System.out.println("\nTu peso está por encima de lo normal.");
        } else {
            System.out.println("\nTu peso es normal");
        };
    };

    //Ejercicio 10: Entrada a parque de atracciones
    public void ejercicio10T3(Scanner scn){
        // Crea un programa que pida la altura del usuario (en cm)      //
        // y determine si puede subir a una atracción. La altura        //
        // mínima es 120 cm y la máxima es 200 cm. Si está dentro       //
        // del rango, muestra "Puedes subir", si no, indica el motivo   //
        // (demasiado bajo o demasiado alto).                           //

        //Introduce tu altura en cm: 115
        //No puedes subir a la atracción. Altura mínima: 120 cm.

        System.out.print("Introduce tu altura en cm: ");
        int altura = scn.nextInt();

        if (altura < 120)  {
            System.out.println("No puedes subir a la atracción. Altura mínima: 120 cm.");
        } else if (altura > 200){
            System.out.println("No puedes subir a la atracción. Altura máxima: 200 cm.");
        } else {
            System.out.println("Puedes subir.");
        };
    };

    //Ejercicio 11: Sistema de descuentos por niveles
    public void ejercicio11T3(Scanner scn){
        // Desarrolla un programa que pida el importe de una compra     //
        // y si el cliente es socio (true/false). Aplica descuentos     //
        // según estas reglas: Si es socio Y la compra es mayor o       //
        // igual a 200€, descuento del 20%. Si es socio Y la compra     //
        // es menor de 200€, descuento del 10%. Si NO es socio pero     //
        // la compra es mayor o igual a 300€, descuento del 5%. En      //
        // cualquier otro caso, no hay descuento. Muestra el importe    //
        // original, el descuento aplicado y el importe final.          //

        System.out.print("Introduce el importe de la compra: ");
        double importe = scn.nextDouble();
        System.out.print("¿Eres socio? ");
        boolean socio = scn.nextBoolean();
        scn.nextLine(); //Culpa del boolean dice Bruno
        double importeDisc = 0.0;
        int porcentajeDisc = 0;

        System.out.printf("Importe Original: %.1f€\n", importe);

        if (socio && importe >= 200.0){
            porcentajeDisc = 20;
            importeDisc = importe * (porcentajeDisc/100.0);

            System.out.println("Eres socio y tu compra es >= 200€.");
        } else if (socio) {
            porcentajeDisc = 10;
            importeDisc = importe * (porcentajeDisc/100.0);
            System.out.println("Eres socio y tu compra es < 200€.");
        } else if (!socio && importe >= 300.0){
            porcentajeDisc = 5;
            importeDisc = importe * (porcentajeDisc/100.0);
            System.out.println("No eres socio y tu compra es >= 300€.");
        } else {
            System.out.println("No eres socio y tu compra es < 300€.");
        };

        System.out.printf("Descuento aplicado (%d%%): %.1f€\n", porcentajeDisc, importeDisc);
        System.out.printf("Importe final: %.1f€", importe - importeDisc);

    };

    //Ejercicio 12: Validador de contraseña
    public void ejercicio12T3(Scanner scn){
        // Crea un programa que pida al usuario crear una contraseña.           //
        // La contraseña debe cumplir estos requisitos: tener al menos          //
        // 8 caracteres de longitud, contener al menos un número, y NO          //
        // puede ser "12345678" o "password". El programa debe verificar        //
        // cada condición por separado usando operadores lógicos y mostrar      //
        // si la contraseña es válida o no, indicando qué requisitos no cumple. //
        //
        // Nota: Para este ejercicio, asume que tienes funciones auxiliares     //
        // como longitudCadena(texto), contienNumero(texto).                    //

        String password = "";
        boolean passValida = false;

        do {
            System.out.print("\nIntroduce una contraseña: ");
            password = scn.nextLine();

            if (password.length() < 8) {
                System.out.printf("La contraseña tiene %d carácteres (mín = 8).\n", password.length());
            };

            if (password.equals("12345678") || password.toLowerCase(Locale.ROOT).equals("password")) {
                System.out.printf("La contraseña introducida es %s, esta contraseña no está permitida.\n", password);
            };

            if ( !(password.matches(".*\\d.*")) ) {
                System.out.printf("La contraseña introducida no contiene números, debe incluir mínimo un número decimal.\n", password);
            };

        } while (password.length() < 8 || password.equals("12345678") || password.toLowerCase(Locale.ROOT).equals("password") || !(password.matches(".*\\d.*")));

        passValida = true;

        //Realmente si hemos llegado aquí, se supone que hemos pasado todos los filtros,
        //por lo que las variables podrían ser directamente False o True
        System.out.printf("Longitud de la contraseña: %d\n", password.length() );
        System.out.printf("¿Tiene al menos 8 caracteres?: %s\n", password.length() >= 8 );
        System.out.printf("¿Contiene al menos un número?: %s\n", password.matches(".*\\d.*") );
        System.out.printf("¿Es una contraseña prohibida?: %s\n", (password.equals("12345678") || password.toLowerCase(Locale.ROOT).equals("password")) );
        System.out.printf("¿Es válida? (cumple todos los requisitos): %s\n", passValida);

    };

    //Ejercicio 13: Calculadora de precio de entradas
    public void ejercicio13T3(Scanner scn){
        // Escribe un programa para calcular el precio de entrada a un      //
        // museo. Pide la edad del usuario y el día de la semana            //
        // (1=Lunes, 2=Martes... 7=Domingo). Las reglas son: Menores de     //
        // 12 años: entrada gratis. Entre 12 y 17 años: 5€ (pero gratis     //
        // los martes). Entre 18 y 64 años: 10€ (pero 7€ los jueves).       //
        // 65 años o más: 6€. Usa operadores lógicos para determinar        //
        // el precio correcto y muestra el cálculo.                         //

        System.out.print("Introduce tu edad: ");
        int edad = scn.nextInt();
        System.out.print("Introduce el día de la semana (1-7): ");
        int diaSemana = scn.nextInt();
        String nombreDia = "";
        int precioEntrada = 0;

        if (diaSemana <=0 || diaSemana >7){
            System.out.println("El día introducido está fuera de rango.");
        } else {
            if (diaSemana == 1) {
                nombreDia = "Lunes";
            } else if (diaSemana == 2) {
                nombreDia = "Martes";
            } else if (diaSemana == 3) {
                nombreDia = "Miércoles";
            } else if (diaSemana == 4) {
                nombreDia = "Jueves";
            } else if (diaSemana == 5) {
                nombreDia = "Viernes";
            } else if (diaSemana == 6) {
                nombreDia = "Sábado";
            } else if (diaSemana == 7) {
                nombreDia = "Domingo";
            };

            System.out.printf("\nEdad: %d años", edad);
            System.out.printf("\nDía de la semana: %d (%s)", edad, nombreDia);
            System.out.printf("\n¿Eres menor de 12?: %s", edad < 12);
            System.out.printf("\n¿Tienes entre 12 y 17?: %s", edad >= 12 && edad <= 17);
            System.out.printf("\n¿Es martes?: %s", nombreDia.equals("Martes"));

            if (edad < 12) {
                precioEntrada = 0;
            } else if (edad >= 65) {
                precioEntrada = 6;
            } else if (edad >=12 && edad <=17) {
                precioEntrada = 5;
                if (nombreDia == "Martes"){
                    precioEntrada = 0;
                };
            } else {
                precioEntrada = 10;
                if (nombreDia == "Jueves"){
                    precioEntrada = 7;
                };
            };
            System.out.printf("\nPrecio de entrada: %d€", precioEntrada);

        };

    };

    //Ejercicio 14: Elegibilidad para préstamo
    public void ejercicio14T3(Scanner scn){
        // Desarrolla un programa que determine si una persona es       //
        // elegible para un préstamo bancario. Pide: edad, ingresos     //
        // mensuales (€), y si tiene deudas pendientes (true/false).    //
        // Los requisitos son: Edad entre 21 y 65 años, ingresos        //
        // mensuales de al menos 1000€, y NO tener deudas pendientes.   //
        // El programa debe evaluar cada condición y mostrar si es      //
        // elegible o no, explicando qué requisitos no cumple.          //

        System.out.print("Introduce tu edad: ");
        int edad = scn.nextInt();
        System.out.print("Introduce tus ingresos mensuales: ");
        int ingresos = scn.nextInt();
        System.out.print("¿Tienes deudas pendientes? (true/false): ");
        boolean deudas = scn.nextBoolean();
        System.out.printf("¿Edad entre 21 y 65?: %s\n", edad>=21 && edad<=65);
        System.out.printf("¿Ingresos >= 1000€?: %s\n", ingresos>=1000);
        System.out.printf("¿Sin deudas pendientes?: %s\n", !deudas);
        System.out.printf("¿Es elegible para el préstamos?: %s\n", ( edad>=21 && edad<=65 ) && ingresos >= 1000 && !deudas );
        if ((edad>=21 && edad<=65 ) && ingresos >= 1000 && !deudas) {
            System.out.println("¡Felicidades! Eres elegible para solicitar el préstamo.");
        } else {
            if (!(edad>=21 && edad<=65)){
                System.out.print("La edad no permite recibir el préstamo (Edad necesaria: 21..65)\n");
            };
            if (!(ingresos >= 1000)){
                System.out.print("Los ingresos no son suficientes. (Ingresos mínimos: 1000€)\n");
            };
            if (!deudas){
                System.out.print("No se permiten préstamos a deudores.\n");
            };
        };

    };

    //Ejercicio 15: Sistema de envío con múltiples condiciones
    public void ejercicio15T3(Scanner scn){
        // Crea un programa que calcule el coste de envío de un paquete.                //
        // Pide: peso del paquete (kg), distancia de envío (km), y si es                //
        // envío urgente (true/false). Las reglas son: Precio base: 5€.                 //
        // Si el peso es mayor de 5kg, añadir 2€ por cada kg adicional.                 //
        // Si la distancia es mayor de 100km, añadir 10€. Si es envío urgente,          //
        // multiplicar el precio total por 1.5. Muestra todos los cálculos paso a paso. //

        double basePrice = 5.0;
        double costeAdicionalDistancia = 0.0;
        double extraCosteKg = 0.0;
        double recargoUrgencia = 1.0;

        System.out.print("Introduce el peso del paquete (kg): ");
        double pesoPaquete = scn.nextDouble();
        System.out.print("Introduce la distancia de envío (km): ");
        int distancia = scn.nextInt();
        System.out.print("¿Es envío urgente? (true/false) ");
        boolean urgente = scn.nextBoolean();
        System.out.printf("Precio base: %.1f€\n", basePrice);
        if (pesoPaquete>5){
            extraCosteKg = (pesoPaquete-5)*2;
            System.out.printf("Peso: %.1fKg (excede 5kg en %.1fKg)\n", pesoPaquete, pesoPaquete-5);
            System.out.printf("Coste adicional por peso: %.1f€\n", extraCosteKg );
        } else {
            System.out.printf("Peso: %.1fKg\n", pesoPaquete);
        };
        if (distancia>100){
            costeAdicionalDistancia = 10.0;
            System.out.printf("Distancia: %dkm (mayor de 100km)\n", distancia);
            System.out.printf("Coste adicional por distancia: %.1f€\n", costeAdicionalDistancia);
        } else {
            System.out.printf("Distancia: %dKm \n", distancia);
        };
        System.out.printf("Subtotal: %.1f€ \n", basePrice + extraCosteKg + costeAdicionalDistancia);
        System.out.printf("¿Es envío urgente?: %s\n", urgente);

        if (urgente) {
            recargoUrgencia = 1.5;
        }

        System.out.printf("Coste total de envío: %.1f€\n", (basePrice + extraCosteKg + costeAdicionalDistancia)*recargoUrgencia);

    };
};
