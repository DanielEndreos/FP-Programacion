package ejercicios.MPO.Notion.Tema6.Juego.model.tipoPersonaje;

import ejercicios.MPO.Notion.Tema6.Juego.model.Personaje;

import java.util.Collection;

public class MagoBlanco extends Mago{

    public MagoBlanco() {
        setEspecialidad("Magia Blanca");
    }


    @Override
    public void accionesPosibles() {

    }

    public void conjuroSanacion(Collection<Personaje> Equipo){
        if(getHechizosDisponibles()>1){
            System.out.println("Intentando curar a todos los personajes.");
            Equipo.forEach(personaje -> {
                if (personaje.getVida()>0){
                    personaje.setVida(100);
                    System.out.println("Has curado al 100% a "+ personaje.getTipo()+".");
                } else {
                    System.out.println("Lo intentaste, pero no puedes curar a "+ personaje.getTipo() + ", el pobre ha estirado la pata.");
                }
            });
            setHechizosDisponibles(getHechizosDisponibles()-1);
        }
    }
}
