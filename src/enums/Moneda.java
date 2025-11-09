package enums;

public enum Moneda {
    DOLAR(1, 1.16), LIBRA(1, 0.88), YEN(1,177.67), PESO(1, 21.35);

    private final double valorEuro;
    private final double valorMoneda;

    Moneda(double valEuro, double valMoneda){
        valorEuro = valEuro;
        valorMoneda = valMoneda;
    }

    public double getValorEuro() {
        return valorEuro;
    }

    public double getValorMoneda() {
        return valorMoneda;
    }
}
