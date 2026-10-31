package main;

public class CalculadoraDescontoTDD {

    private double valorComDesconto;

    public CalculadoraDescontoTDD() {}

    public double CalcularDesconto(double valor) {
        
        if (valor > 1000) {
            valorComDesconto = valor - (valor * 0.20);
        } else if (valor > 500) {
            valorComDesconto = valor - (valor * 0.10);
        }

        return valorComDesconto;
    }

}
