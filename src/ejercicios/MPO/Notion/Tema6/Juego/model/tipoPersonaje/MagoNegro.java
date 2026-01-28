package ejercicios.MPO.Notion.Tema6.Juego.model.tipoPersonaje;

import ejercicios.MPO.Notion.Tema6.Juego.model.Personaje;

import java.util.Collection;

public class MagoNegro extends Mago{

    public MagoNegro() {
        setEspecialidad("Magia Negra");
    }

    @Override
    public void accionesPosibles() {

    }

    public void hechizo(Collection<Personaje> Equipo){
        if(getHechizosDisponibles()>1){
            System.out.println("Lanzando un hechizo mágico al equipo contrario.");
            Equipo.forEach(personaje -> {
                if (personaje.getVida()>0) {
                    System.out.print("Atacas a " + personaje.getTipo());
                    personaje.setVida(personaje.getVida() - 25);
                    if (personaje.getVida() < 0) {
                        personaje.setVida(0);
                        System.out.println(personaje.getTipo() + " se ha quedado sin puntos de vida, ha muerto.");
                    } else {
                        System.out.println(personaje.getTipo() + " le has quitado 25 de vida.");
                    }
                }
            });
            setHechizosDisponibles(getHechizosDisponibles()-1);
        }
    }
}
