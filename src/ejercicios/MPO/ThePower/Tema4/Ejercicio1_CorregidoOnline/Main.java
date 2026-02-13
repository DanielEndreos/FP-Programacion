package ejercicios.MPO.ThePower.Tema4.Ejercicio1_CorregidoOnline;

import ejercicios.MPO.ThePower.Tema4.Ejercicio1_CorregidoOnline.controller.Gestor;
import ejercicios.MPO.ThePower.Tema4.Ejercicio1_CorregidoOnline.model.Categoria;
import ejercicios.MPO.ThePower.Tema4.Ejercicio1_CorregidoOnline.model.Producto;

public class Main {
    public static void main(String[] args) {
        Producto producto = new Producto("Telefono", "001T", 300.0, Categoria.TECNOLOGIA);
        Producto producto2 = new Producto("Telefono", "002T", 100.0, Categoria.TECNOLOGIA);
       // producto.mostrarDatos();
        Gestor gestor = new Gestor();

        //gestor.asignarPrecios();
        gestor.buscarPorCodigo("123A").ifPresentOrElse(Producto::mostrarDatos, ()->{
            //Acción a realizar si no existe
        });

        gestor.getProductosPorCondicion( (prod, valor) -> prod.getPrecio()<valor
                && producto.getCategoria() == Categoria.ALIMENTO, 10.0);

    }
}
