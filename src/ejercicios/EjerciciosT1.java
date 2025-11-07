package ejercicios;

public class EjerciciosT1 {

    // Ejercicios T1

    //Ejercicio 1: Definir y mostrar variables
    public void ejercicio1T1(){
        //      Crea un programa que defina tres variables: nombre, edad y ciudad.     //
        //        Asigna valores a cada una y muestra su contenido en la consola.      //
        String nombre = "Daniel Meco Simón";
        int edad = 35;
        String ciudad = "Valencia";

        System.out.printf("\nHola, soy %s, soy de %s y tengo %d años.", nombre, ciudad, edad);
    };

    //Ejercicio 2: Modificar variables
    public void ejercicio2T1(){
        //      Crea un programa que defina una variable llamada puntuación con        //
        //      valor inicial 0. Luego, modifica su valor tres veces y muestra el      //
        //      resultado final.
        int puntuacion = 0;
        System.out.printf("\n\nPuntuación inicial: %d", puntuacion);
        puntuacion = 5;
        System.out.printf("\nDespués de primera modificación: %d", puntuacion);
        puntuacion = 10;
        System.out.printf("\nDespués de segunda modificación: %d", puntuacion);
        puntuacion = 15;
        System.out.printf("\nPuntuación final: %d", puntuacion);
    };

    //Ejercicio 3: Modificar variables
    public void ejercicio3T1(){
        //      Define cinco variables con diferentes tipos de datos (String,      //
        //      int, boolean, double, char) y muestra tanto su valor como su tipo. //
        String nombre = "Carlos";
        Integer edad = 30;
        Boolean estudiante = true;
        Double altura = 1.75;
        Character letra = 'c';

        System.out.printf("\n\nNombre: %s - Tipo: %s", nombre, nombre.getClass().getSimpleName());
        System.out.printf("\nEdad: %d - Tipo: %s", edad, edad.getClass().getSimpleName());
        System.out.printf("\n¿Es estudiante?: %s - Tipo: %s", estudiante, estudiante.getClass().getSimpleName());
        System.out.printf("\nAltura: %.2f - Tipo: %s", altura, altura.getClass().getSimpleName());
        System.out.printf("\nEdad: %s - Tipo: %s", letra, letra.getClass().getSimpleName());
    };

    //Ejercicio 4: Variables con nombres descriptivos
    public void ejercicio4T1(){
        //    Crea un programa que simule la información de un libro usando        //
        //    variables con nombres descriptivos. Muestra toda la información      //
        //    del libro en la consola.                                             //

        String tituloLibro = "Don Quijote de la Mancha";
        String autorLibro  = "Miguel de Cervantes";
        int añoPublicacion = 1605;
        int numPaginas = 863;
        boolean disponible = true;

        System.out.printf("\n\nTítulo: %s", tituloLibro );
        System.out.printf("\nAutor: %s", autorLibro);
        System.out.printf("\nAño de publicación: %d", añoPublicacion);
        System.out.printf("\nNúmero de páginas: %d", numPaginas);
        System.out.printf("\n¿Disponible en biblioteca?: %s", disponible);
    };

    //Ejercicio 5: Declaración y uso de constantes
    public void ejercicio5T1(){
        //    Crea un programa que use constantes para almacenar información       //
        //    que no debe cambiar (como el valor de PI o el nombre de una          //
        //    aplicación) y variables para información que puede cambiar.          //
        //    Muestra todos los valores.                                           //


        //Variables con información que NO puede cambiar
        final String APP = "MiApp";
        final String VERSION = "1.0.0";
        final double PIVALUE = Math.PI;
        String actualUser = "Laura";
        int nivel = 1;
        int puntuacion = 0;


        System.out.printf("\n\nAplicación: %s", APP);
        System.out.printf("\nVersión: %s", VERSION);
        System.out.printf("\nValor de PI: %.5f", PIVALUE);
        System.out.printf("\nUsuario Actual: %s", actualUser);
        System.out.printf("\nNivel: %d", nivel);
        System.out.printf("\nPuntuación: %d", puntuacion);

        //Variables con información que pueden cambiar
        actualUser = "Miguel";
        nivel = 2;
        puntuacion = 150;

        System.out.printf("\nUsuario actualizado: %s", actualUser);
        System.out.printf("\nNivel actualizado: %d", nivel);
        System.out.printf("\nPuntuación actualizada: %d", puntuacion);


    /*


    Puntuación: 0
    Usuario actualizado: Miguel
    Nivel actualizado: 2
    Puntuación actualizada: 150*/
};

    //Ejercicio 6:  Operaciones aritméticas simples
    public void ejercicio6T1(){
        //    Escribe un programa que declare dos variables numéricas, realice       //
        //    las operaciones básicas (suma, resta, multiplicación y división)       //
        //    y muestre los resultados por consola.                                  //

        int numA= 10;
        int numB=  5;

        System.out.printf("\n\nNúmero 1: %d", numA);
        System.out.printf("\nNúmero 2: %d", numB);
        System.out.printf("\nSuma: %d", numA+numB);
        System.out.printf("\nResta: %d", numA-numB);
        System.out.printf("\nMultiplicación: %d", numA*numB);
        System.out.printf("\nDivisión: %.2f", (float)numA/numB);
    };

    //Ejercicio 7:  Presentación personal
    public void ejercicio7T1(){
        //    Crea un programa que almacene tu información personal (nombre,    //
        //    apellido, edad y ciudad) en variables y muestre un mensaje de     //
        //    presentación por consola.                                         //

        String nombre   = "Daniel";
        String apellido = "Meco";
        int    edad     = 35;
        String ciudad   = "Valencia";

        System.out.printf("""
        \n\n¡Hola! Me llamo %s %s.
        Tengo %d años y vivo en %s.""", nombre, apellido, edad, ciudad);
    };

    //Ejercicio 8:  Calculadora de área de un rectángulo
    public void ejercicio8T1(){
        //    Desarrolla un programa que calcule el área de un rectángulo.  //
        //    Declara variables para la base y la altura, y muestra el      //
        //    resultado del cálculo.                                        //

        int base = 5;
        int altura = 3;

        System.out.printf("""
                \n
                Base del rectángulo: %d
                Altura del rectángulo: %d
                El área del rectángulo es: %d
                
                """, base, altura, base*altura);

    };

    //Ejercicio 9:  Información de un producto
    public void ejercicio9T1(){
        //    Escribe un programa que almacene la información de un producto    //
        //    (nombre, precio, código y disponibilidad) y muestre estos datos   //
        //    formateados por consola.                                          //

        String nombre = "Auriculares Bluetooth";
        double precio = 29.99;
        String codigo = "AUR-2023";
        boolean disponibilidad = true;

        System.out.printf("""
                \n
                INFORMACIÓN DEL PRODUCTO
                --------------------------
                Nombre: %s
                Precio: %.2f€
                Código: %s
                Disponible: %s
                
                """, nombre, precio, codigo, disponibilidad);

    };

    //Ejercicio 10:  Conversión de temperaturas
    public void ejercicio10T1(){
        //    Crea un programa que convierta una temperatura de grados      //
        //    Celsius a Fahrenheit. Usa una variable para la temperatura    //
        //    en Celsius y muestra el resultado de la conversión.           //
        //
        //La fórmula para convertir de Celsius a Fahrenheit es:             //
        //F = C × 9/5 + 32                                                  //

        double tempCelsius = 25.2;
        double tempFahren = (tempCelsius * (9.0/5.0))+ 32.0;
        System.out.printf("""
                \n
                Temperatura en Celsius: %.2f
                Temperatura en Fahrenheit: %.2f
                
                """, tempCelsius, tempFahren);

    };

    /*
    public void ejercicio1(Scanner scn){
        scn = new Scanner(System.in);
        System.out.println("¿Cuantas bebidas vas a comprar?:");
        int nBebidas = scn.nextInt();
        System.out.println("¿Cuantos bocadillos vas a comprar?");
        int nBocadillos = scn.nextInt();

        System.out.println("¿Cuanto cuesta la bebida?");
        double precioBebida = scn.nextDouble();

        System.out.println("¿Cuanto cuesta el bocadillo?");
        double precioBocadillo = scn.nextDouble();

        System.out.println("¿Cuantas personas han realizado la compra?:");
        double nPersonas = scn.nextDouble();

        double costeBocadillos = nBocadillos*precioBocadillo;
        double costeBebida = nBebidas*precioBebida;
        double costeTotal = costeBebida+costeBocadillos;
        double costeIndividual = costeTotal/nPersonas;

        System.out.printf("El coste total de la compra por persona es de %.2f",costeIndividual);
    }

    public void ejercicio2(Scanner scn) {
        scn = new Scanner(System.in);
        System.out.println("Introduce la cantidad de segundos a calcular:");
        int segundosTotal = scn.nextInt();

        int horasTotal = segundosTotal/3600;
        int minutosTotal = (segundosTotal%3600)/60;
        int segundossTotal = (segundosTotal%3600)%60;


        System.out.println(horasTotal);
        System.out.println(minutosTotal);
        System.out.println(segundossTotal);
    }

     */
}
