package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import main.CalculadoraDescontoTDD;

public class CalculadoraDescontoTDDTest {
    @Test 
    public void RetornaDescontoDe10PorcentParaValoresMaioresDe500() {

        CalculadoraDescontoTDD calc = new CalculadoraDescontoTDD();

        assertEquals(450.9, calc.CalcularDesconto(501), 0.001);
    }

    
}
