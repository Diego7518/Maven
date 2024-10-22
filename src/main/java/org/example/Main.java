package org.example;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Main {

    @Test
    public void testSumar() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.sumar(2, 3);
        assertEquals("La suma de 2 + 3 debería ser 5", 5, new Integer[]{resultado});
    }

    @Test
    public void testRestar() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.restar(5, 3);
        assertEquals("La resta de 5 - 3 debería ser 2", 2, new Integer[]{resultado});
    }
}
