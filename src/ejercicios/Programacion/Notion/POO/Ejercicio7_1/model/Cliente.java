package ejercicios.Programacion.Notion.POO.Ejercicio7_1.model;

public class Cliente {
    private String nombre, email;
    private Direccion direccion;

    public Cliente(String nombre, String email, Direccion direccion){
        this.nombre = nombre;
        this.email = email;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return  "Cliente: "+nombre+"\n"+
                "email" + email + "\n" +
                direccion;
    }
}
