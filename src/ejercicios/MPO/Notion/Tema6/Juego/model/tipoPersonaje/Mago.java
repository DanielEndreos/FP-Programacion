package ejercicios.MPO.Notion.Tema6.Juego.model.tipoPersonaje;

import ejercicios.MPO.Notion.Tema6.Juego.interfaces.Curar;
import ejercicios.MPO.Notion.Tema6.Juego.model.Personaje;

public abstract class Mago extends Personaje implements Curar {
    private String especialidad;
    private int hechizosDisponibles;

    public Mago (){
        hechizosDisponibles = 4;
        setTipo("Mago");
    }

    @Override
    public void mostrarDatos() {
        System.out.println(getTipo()+", especializado en " + especialidad + ", le quedan "+ hechizosDisponibles + " hechizos y "+getVida()+"% de vida.");
    }

    @Override
    public abstract void accionesPosibles();

    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getHechizosDisponibles() {
        return hechizosDisponibles;
    }
    public void setHechizosDisponibles(int hechizosDisponibles) {
        this.hechizosDisponibles = hechizosDisponibles;
    }
}
