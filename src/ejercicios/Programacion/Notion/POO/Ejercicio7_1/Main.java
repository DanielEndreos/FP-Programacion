package ejercicios.Programacion.Notion.POO.Ejercicio7_1;

import ejercicios.Programacion.Notion.POO.Ejercicio7_1.model.Cliente;
import ejercicios.Programacion.Notion.POO.Ejercicio7_1.model.Direccion;

public class Main {
    static void main(String[] args) {
        //Crea una clase Direccion con atributos calle, ciudad y codigoPostal. Luego crea una clase
        //Cliente que tenga como atributos nombre, email y un objeto Direccion. Implementa un
        //metodo para mostrar todos los datos del cliente incluyendo su dirección.

        //Ejemplo de salida por consola:
        //Cliente: Carlos Ruiz
        //Email: carlos.ruiz@email.com
        //Dirección: Calle Mayor 15, Madrid, 28001

        Direccion addrCliente = new Direccion("Calle Mayor 15", "Madrid", 28001);
        Cliente cliente = new Cliente("Carlos Ruiz", "carlos.ruiz@email.com", addrCliente);

        System.out.println(cliente);
    }
}
