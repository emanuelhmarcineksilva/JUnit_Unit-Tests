package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import main.CalculadoraDescontoTradicional;

public class CalculadoraDescontoTradicionalTest {
    
    @Test 
    public void InserirValorInvalido() {
        var calculadora = new CalculadoraDescontoTradicional();

        assertThrows(IllegalArgumentException.class, () -> {
            calculadora.calcularDesconto(-10.0, false);
        });
    }

    @Test
    public void Desconto10PorcentAcima500() {
        var calculadora = new CalculadoraDescontoTradicional();

        assertEquals(450.9, calculadora.calcularDesconto(501.0, false), 0.001); // delta é aceitar uma margem de erro
    }

    @Test
    public void Desconto20PorcentAcima1000() {

        CalculadoraDescontoTradicional cal = new CalculadoraDescontoTradicional();

        assertEquals(800.8, cal.calcularDesconto(1001.0,false), 0.001);
    }

    @Test
    public void Desconto5PorcentClientVipAcima1000() {
        CalculadoraDescontoTradicional cal = new CalculadoraDescontoTradicional();

        assertEquals(760.76, cal.calcularDesconto(1001, true), 0.001);
    }

    @Test
    public void TaxaFixaFreteValorAbaixoDe100() {
        CalculadoraDescontoTradicional cal = new CalculadoraDescontoTradicional();

        assertEquals(105, cal.calcularDesconto(90, false), 0);
    }

}
