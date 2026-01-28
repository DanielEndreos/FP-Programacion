package ejercicios.MPO.Notion.Tema6.Juego.model;

public abstract class Personaje {
    private int vida;
    private String tipo;

    public Personaje(){
        vida = 100;
    }

    public void mostrarDatos() {
        System.out.println(tipo+", le queda "+vida+"% de vida.");
    }

    public abstract void accionesPosibles();

    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
