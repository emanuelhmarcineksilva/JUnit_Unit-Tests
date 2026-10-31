package main;

public class CalculadoraDescontoTDD {

    private double valorComDesconto;

    public CalculadoraDescontoTDD() {}

    public double CalcularDesconto(double valor) {
        
        if (valor > 500) {
            valorComDesconto = valor - (valor * 0.10);
        }

        return valorComDesconto;
    }

}
