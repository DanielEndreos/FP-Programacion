package ejercicios.Programacion.Notion.POO.Ejercicio7_1.model;

public class Direccion {
    private String calle, ciudad;
    private int codigoPostal;

    public Direccion(String calle, String ciudad, int codigoPostal){
        this.calle = calle;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
    }

    @Override
    public String toString() {
        return "Dirección: "+
                calle+", "+
                ciudad+", "+
                codigoPostal;
    }
}
