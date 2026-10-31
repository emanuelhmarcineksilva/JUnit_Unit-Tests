package main;

public class CalculadoraDescontoTDD {
    private double valorProduto;
    private boolean clienteVIP;
    private double valorComDesconto;

    public CalculadoraDescontoTDD() {}

    public double calcularDesconto(double valor, boolean clienteVip) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor do produto inválido. O valor deve ser maior que zero.");
        }

        this.valorProduto = valor;
        this.clienteVIP = clienteVip;
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

    public void verDesconto() {
        // descontos aplicados e o valor final do produto com desconto.
        System.out.println("Valor do produto antes do desconto: R$ " + valorProduto);
        System.out.println("Cliente VIP: " + (clienteVIP ? "Sim" : "Não"));
        System.out.println("Valor final do produto com desconto: R$ " + calcularDesconto(valorProduto, clienteVIP));
        //valor do desconto
        System.out.println("Valor do desconto aplicado: R$ " + (valorProduto - calcularDesconto(valorProduto, clienteVIP)));
    }
}
