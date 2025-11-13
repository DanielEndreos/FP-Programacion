package ejercicios.Ejercicio3;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        /*
        Crea un programa que permita al usuario crear una pizza personalizada
eligiendo ingredientes desde un menú.
Reglas:
• El programa muestra al usuario un menú con al menos cinco ingredientes
posibles y su precio individual. Ejemplo: queso (10), jamón (15), piña
(8), tomate (6), pepperoni (12).
*/


/*
• El usuario puede agregar hasta 5 ingredientes diferentes a su pizza,
eligiendo uno por uno. El programa debe evitar la cantidad máxima no
se supere.
*/

        String listaIngr = "Los ingredientes que llevas son: ";
        Scanner scn = new Scanner(System.in);
        int ingredientes = 0;
        int opcion = 0;
        int totalPizza=0;
        do{

            System.out.println("""
                Menú
                --------
                1. Queso (10)
                2. Jamón (15)
                3. Piña (8)
                4. Tomate (6)
                5. Pepperoni (12)
                """);
            System.out.print("Ingresa el número del ingrediente que quieres agregar (o 0 para terminar): ");
            opcion = scn.nextInt();

            switch (opcion){
                case 1 ->{totalPizza+=10;listaIngr+= " Queso";}
                case 2 ->{totalPizza+=15;listaIngr+= " Jamón";}
                case 3 ->{totalPizza+=8;listaIngr+= " Piña";}
                case 4 ->{totalPizza+=6;listaIngr+= " Tomate";}
                case 5 ->{totalPizza+=12;listaIngr+= " Pepperoni";}
            }
            ingredientes++;
        } while(ingredientes<5 && opcion!=0);
        System.out.println(listaIngr);
        /*
• Por cada ingrediente elegido, el programa suma el precio
correspondiente.
• Después de cada selección, muestra al usuario la lista actual de
ingredientes y el subtotal acumulado.
• Cuando el usuario termina, muestra la pizza final detallada (con todos
los ingredientes seleccionados) y el total a pagar.
Un ejemplo sería el siguiente
Bienvenido al menú de pizzas personalizadas:
1. Queso (10)
2. Jamón (15)
3. Piña (8)
4. Tomate (6)
5. Pepperoni (12)
Ingresa el número del ingrediente que quieres agregar (o 0 para terminar):
> 1 (Elige queso)
> 2 (Elige jamón)
> 5 (Elige pepperoni)
> 0 (Termina selección)
Tu pizza tendrá: Queso, Jamón, Pepperoni
El total a pagar es: $37
¡Gracias por tu pedido!
         */
    }
}
