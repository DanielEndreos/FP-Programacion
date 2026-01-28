package ejercicios.MPO.Notion.Tema6.Juego.interfaces;

import ejercicios.MPO.Notion.Tema6.Juego.model.Personaje;

public interface Curar {

    default void realizarCuracion(Personaje personaje){
            System.out.println("Realizas una curación sobre el personaje "+personaje.getTipo() + " restaurándole el 100% de la vida");
            personaje.setVida(100);
    };
}
