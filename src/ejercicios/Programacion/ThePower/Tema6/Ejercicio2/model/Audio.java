package ejercicios.Programacion.ThePower.Tema6.Ejercicio2.model;

import java.util.ArrayList;

public class Audio extends ElementoMultimedia{
    private int duracion;
    private String soporte;


    public Audio() {}

    public Audio(String identificador, String titulo, String autor, String formato, int tamanio, int duracion, String soporte) {
        super(identificador, titulo, autor, formato, tamanio);
        this.duracion = duracion;
        this.soporte = soporte;
    }
}
