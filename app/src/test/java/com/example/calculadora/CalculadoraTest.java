package com.example.calculadora;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {

    Calculadora sut;

    @Before
    public void initTest() {
        sut = new Calculadora();
    }

    @Test
    public void testSumaSimple() {
        sut.setOper1(5);
        sut.setOper2(4);
        sut.setOperacion(Calculadora.OPERACION.SUMA);
        double resultado = sut.opera();

        assertEquals(9.0, resultado, 0.01);
    }
}
