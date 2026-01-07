package ejercicios.Programacion.Notion.POO.Ejercicio11.model;

public class Cliente {
    private String nombre, email;
    private Carrito carrito;

    public Cliente(String nombre, String email){
        this.nombre = nombre;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente: "+nombre+" ("+email+")"+"\n";
    }
}
