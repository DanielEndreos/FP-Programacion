package ejercicios.MPO.Notion.Tema4.Ejercicio10.model;

public class Alumno {
    private String nombre;
    private Double notaTeorica, notaPractica;

    public Alumno(String nombre, Double notaTeorica, Double notaPractica) {
        this.nombre = nombre;
        this.notaTeorica = notaTeorica;
        this.notaPractica = notaPractica;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getNotaTeorica() {
        return notaTeorica;
    }

    public void setNotaTeorica(Double notaTeorica) {
        this.notaTeorica = notaTeorica;
    }

    public Double getNotaPractica() {
        return notaPractica;
    }

    public void setNotaPractica(Double notaPractica) {
        this.notaPractica = notaPractica;
    }
}
