package main;
public class CalculadoraDescontoTradicional {
    double valorProduto;
    boolean clienteVIP;
    double desconto;

        
    public CalculadoraDescontoTradicional(double valorProduto, boolean clienteVIP) {
        this.valorProduto = valorProduto;
        this.clienteVIP = clienteVIP;
    }

    public double calcularDesconto() {
        desconto = valorProduto;
        // Pedidos com valor total de itens zerado ou negativo devem lançar uma exceção de argumento inválido.
        if (desconto <= 0) {
            System.out.println("O valor do produto deve ser maior que zero.");
            return desconto;
        }

        // Compras acima de R$ 500,00 recebem 10% de desconto.

        if (desconto > 500) {
            desconto = (desconto - (desconto * 0.10));
        }

        // Compras acima de R$ 1.000,00 recebem 20% de desconto.

        if (desconto > 1000) {
            desconto = desconto - (desconto * 0.20);
        }

        // Clientes da categoria VIP ganham 5% de desconto adicional sobre o valor já com desconto.

        if (clienteVIP) {
            desconto = desconto - (desconto * 0.05);
        }
        // Se o valor final do pedido (após descontos) for inferior a R$ 100,00, é cobrada uma taxa fixada de frete de R$ 15,00.

        if (desconto < 100) {
            desconto = desconto + 15;
        }

        // calculando desconto
        desconto = (valorProduto - desconto);

        return valorProduto - desconto;

    }

    public void verDesconto() {
        // descontos aplicados e o valor final do produto com desconto.
        System.out.println("Valor do produto antes do desconto: R$ " + valorProduto);
        System.out.println("Cliente VIP: " + (clienteVIP ? "Sim" : "Não"));
        System.out.println("Valor final do produto com desconto: R$ " + calcularDesconto());
        //valor do desconto
        System.out.println("Valor do desconto aplicado: R$ " + desconto);
    }
}
