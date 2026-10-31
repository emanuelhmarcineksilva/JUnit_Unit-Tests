package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import main.CalculadoraDescontoTDD;

public class CalculadoraDescontoTDDTest {
    @Test 
    public void RetornaDescontoDe10PorcentParaValoresMaioresDe500() {

        CalculadoraDescontoTDD calc = new CalculadoraDescontoTDD();

        assertEquals(450.9, calc.calcularDesconto(501, false), 0.001);
    }

    @Test 
    public void RetornaDescontoDe20PorcentParaValoresMaioresDe1000() {

        CalculadoraDescontoTDD calc = new CalculadoraDescontoTDD();

        assertEquals(800.8, calc.calcularDesconto(1001, false), 0.001);

    }

    @Test 
    public void AplicarDesconto5PorcentParaClientesVip() {
        CalculadoraDescontoTDD cal = new CalculadoraDescontoTDD();

        assertEquals(95, cal.descontoVip(100), 0.001);
    }

    @Test 
    public void AplicarDescontoCompostosComClientesVip() {
        CalculadoraDescontoTDD cal = new CalculadoraDescontoTDD();

        assertEquals(1520, cal.calcularDesconto(2000, true), 0.001);
    }

    @Test
    public void TaxaFixaDeFreteParaValoresMenorQue100() {
        CalculadoraDescontoTDD cal = new CalculadoraDescontoTDD();

        assertEquals(100, cal.calcularDesconto(85, false), 0.001);
    }

    @Test
    public void TaxaFixaDeFreteParaValoresMenorQue100ParaClienteVip() {
        CalculadoraDescontoTDD cal = new CalculadoraDescontoTDD();

        assertEquals(100, cal.calcularDesconto(89.47, true), 0.01);
    }

    @Test 
    public void RetornarExecaoParaValoresNegativos() {
        CalculadoraDescontoTDD cal = new CalculadoraDescontoTDD();

        assertThrows(IllegalArgumentException.class, () -> {
            cal.calcularDesconto(-10, false);
        });
    }

    @Test 
    public void RetornarExecaoParaOValorZero() {
        CalculadoraDescontoTDD cal = new CalculadoraDescontoTDD();

        assertThrows(IllegalArgumentException.class, () -> {
            cal.calcularDesconto(0, false);
        });
    }

}
