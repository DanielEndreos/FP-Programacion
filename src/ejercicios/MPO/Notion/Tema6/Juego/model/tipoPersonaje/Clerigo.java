package ejercicios.MPO.Notion.Tema6.Juego.model.tipoPersonaje;

import ejercicios.MPO.Notion.Tema6.Juego.interfaces.Curar;
import ejercicios.MPO.Notion.Tema6.Juego.model.Personaje;

import java.util.Collection;

public class Clerigo extends Personaje implements Curar {

    public Clerigo (){
        setTipo("Clerigo");
    }
    public void accionesPosibles() {

    }
    public void mostrarInformacionEquipo(Collection<Personaje> Equipo){
        System.out.println("Información del equipo: ");
        System.out.println("------------------------");
        Equipo.forEach(Personaje::mostrarDatos);
    }

}

