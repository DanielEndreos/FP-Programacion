package ejercicios.MPO.Notion.Tema6.Juego.model.tipoPersonaje;

import ejercicios.MPO.Notion.Tema6.Juego.interfaces.Curar;
import ejercicios.MPO.Notion.Tema6.Juego.model.Personaje;

public class Soldado extends Personaje implements Curar {

    public Soldado (){
        setTipo("Soldado");
    }
    public void accionesPosibles() {

    }
    @Override
    public void realizarCuracion(Personaje personaje) {

    }
}
