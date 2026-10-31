package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import main.CalculadoraDescontoTDD;

public class CalculadoraDescontoTDDTest {
    @Test 
    public void RetornaDescontoDe10PorcentParaValoresMaioresDe500() {

        CalculadoraDescontoTDD calc = new CalculadoraDescontoTDD();

        assertEquals(450.9, calc.CalcularDesconto(501, false), 0.001);
    }

    @Test 
    public void RetornaDescontoDe20PorcentParaValoresMaioresDe1000() {

        CalculadoraDescontoTDD calc = new CalculadoraDescontoTDD();

        assertEquals(800.8, calc.CalcularDesconto(1001, false), 0.001);

    }

    @Test 
    public void AplicarDesconto5PorcentParaClientesVip() {
        CalculadoraDescontoTDD cal = new CalculadoraDescontoTDD();

        assertEquals(95, cal.descontoVip(100), 0.001);
    }

    @Test 
    public void AplicarDescontoCompostosComClientesVip() {
        CalculadoraDescontoTDD cal = new CalculadoraDescontoTDD();

        assertEquals(1520, cal.CalcularDesconto(2000, true), 0.001);
    }

    @Test
    public void TaxaFixaDeFreteParaValoresMenorQue100() {
        CalculadoraDescontoTDD cal = new CalculadoraDescontoTDD();

        assertEquals(100, cal.CalcularDesconto(85, false), 0.001);
    }

    @Test
    public void TaxaFixaDeFreteParaValoresMenorQue100ParaClienteVip() {
        CalculadoraDescontoTDD cal = new CalculadoraDescontoTDD();

        assertEquals(100, cal.CalcularDesconto(89.47, true), 0.01);
    }

}
