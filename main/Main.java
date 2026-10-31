package main;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bem-vindo à Calculadora de Descontos!");

        // Exemplo de uso da CalculadoraDescontoTradicional
        CalculadoraDescontoTradicional calculadoraTrad = new CalculadoraDescontoTradicional();
        calculadoraTrad.calcularDesconto(1200, true);
        calculadoraTrad.verDesconto();

        CalculadoraDescontoTDD calculadoraTDD = new CalculadoraDescontoTDD();
        calculadoraTDD.calcularDesconto(4000, true);
        calculadoraTDD.verDesconto();
        calculadoraTDD.calcularDesconto(4000, false);
        calculadoraTDD.verDesconto();

        
    }
}