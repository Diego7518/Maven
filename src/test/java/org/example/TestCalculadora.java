package org.example;

import org.junit.Assert;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculadora {
    @org.testng.annotations.Test
    public void testSumar() {
        System.out.println("Prueba del método suma");
        int a = 2;
        int b = 4;
        Calculadora calc = new Calculadora(a,b);
        double esperado = 6;
        double resultado = calc.sumar();
        Assert.assertEquals(esperado, resultado, 0.0);
        System.out.println(resultado);
    }

    @org.example.Test
    public void testRestar() {
        System.out.println("Prueba del método resta");
        int a = 4;
        int b = 2;
        Calculadora calc = new Calculadora(a,b);
        double esperado = 2;
        double resultado = calc.restar();
        Assert.assertEquals(esperado, resultado, 0.0);
        System.out.println(resultado);
    }
}