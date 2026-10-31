package main;

public class CalculadoraDescontoTDD {

    private double valorComDesconto;

    public CalculadoraDescontoTDD() {}

    public double CalcularDesconto(double valor, boolean clienteVip) {
        
        valorComDesconto = valor;


        if (valor > 1000) {
            valorComDesconto -= (valor * 0.20);
        } else if (valor > 500) {
            valorComDesconto -= (valor * 0.10);
        }

        if (clienteVip) {
            valorComDesconto = descontoVip(valorComDesconto);
        }

        if (valorComDesconto < 100) {
            valorComDesconto += 15;
        }

        return valorComDesconto;
    }

    public double descontoVip(double v) {
        return v - (v * 0.05);
    }



}
