package ejercicios.MPO.Notion.Tema5._2_Navidades.Ejercicio8.model;

import java.time.LocalDate;

public class Coche {
    private String marca, modelo;
    private int anio;
    private double kilometraje, combustible;

    public Coche(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.kilometraje = 0;
        this.combustible = 50;
    }

    public void conducir(double km) {
        double consumo = km / 15.0;

        if (combustible >= consumo) {
            combustible -= consumo;
            kilometraje += km;
            System.out.printf("Conducidos %.1fkms, quedan %.1f litros de gasolina.\n", km, combustible);
        } else {
            double kmPosibles = combustible * 15.0;
            kilometraje += kmPosibles;
            combustible = 0;
            System.out.println("Conducido "+ kmPosibles + "kms");
            System.out.println("Te has quedado sin combustible.");
        }
    }

    public void repostar(double litros){
        boolean litrosSobrantes = ((combustible + litros) - 60 > 0);

        if (litrosSobrantes) {
            System.out.printf("Se ha llenado el depósito, han sobrado %.1f litros\n", ((combustible + litros) - 60));
            combustible = 60;
        } else {
            combustible += litros;
        }

        System.out.printf("Quedan %.1f litros de gasolina, puedes recorrer %.1f Kms\n", combustible, combustible*15.0);
    }

    public int calcularAntiguedad(){
        return LocalDate.now().getYear()-anio;
    }

    public boolean necesitaMantenimiento(){
        return kilometraje>10000;
    }

    public void mostrarInfo(){
        System.out.println("Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio=" + anio +
                ", kilometraje=" + kilometraje +
                ", combustible=" + combustible +
                '}');
    }

    public String getMarca() {
        return marca;
    }
    private void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    private void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }
    private void setAnio(int anio) {
        this.anio = anio;
    }

    public double getKilometraje() {
        return kilometraje;
    }
    private void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public double getCombustible() {
        return combustible;
    }
    private void setCombustible(double combustible) {
        this.combustible = combustible;
    }
}
