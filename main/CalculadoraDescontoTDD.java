package main;

public class CalculadoraDescontoTDD {

    public CalculadoraDescontoTDD() {}

    public double CalcularDesconto(double valor) {
        if (valor > 500) {
            return valor - (valor * 0.10);
        }

        return 0;
    }

}
