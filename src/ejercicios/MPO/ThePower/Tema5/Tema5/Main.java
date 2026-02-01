package ejercicios.MPO.ThePower.Tema5.Tema5;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        //Guardar una agenda telefonica -> ArrayList<Object[]>
           //contactos -> nombre, apellido, dni, telefono -> Object[]{nombre, apellido, dni, telefono}
        ArrayList<Object[]> listaContactos = new ArrayList<>();

        listaContactos.add(new Object[]{"Borja", "Martin", "1234A", 1234});
        listaContactos.add(new Object[]{"Maria", "Martin", "2345A", 2345});
        listaContactos.add(new Object[]{"Juan", "Gomez", "3456A", 3456});

        //Borrar un elemento a lo estandar
        /*
        for (int i = 0; i < listaContactos.size(); i++) {
            Object[] contacto = listaContactos.get(i);
            if (contacto[2].equals("2345A")){
                listaContactos.remove(contacto);
                break;
            }
        }
        */

        //Borrar un elemento con removeIf
        boolean borrado = listaContactos.removeIf(new Predicate<Object[]>() {
            @Override
            public boolean test(Object[] objects) {
                return objects[2].equals("1234A");
            }
        });
        System.out.println("Se ha borrado algun elemento? "+borrado);

        for (Object[] lista : listaContactos ) {
            System.out.println("\nImprimiendo datos de contacto:");
            System.out.printf("Nombre: %s, Apellido: %s, DNI: %s, Telefono: %d\n",
                                    lista[0], lista[1], lista[2], (int)lista[3]);

        }

    }
}
