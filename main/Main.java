package main;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bem-vindo à Calculadora de Descontos!");

        // Exemplo de uso da CalculadoraDescontoTradicional
        CalculadoraDescontoTradicional calculadoraTrad = new CalculadoraDescontoTradicional();
        calculadoraTrad.calcularDesconto(1200, true);
        calculadoraTrad.verDesconto();

        // Exemplo de uso da CalculadoraDescontoComposta
        // CalculadoraDescontoComposta calculadoraComp = new CalculadoraDescontoComposta(1200, true);
        // calculadoraComp.calcularDesconto();
    }
}