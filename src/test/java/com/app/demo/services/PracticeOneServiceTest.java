package com.app.demo.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PracticeOneServiceTest {
    PracticeOneService practiceOneService = new PracticeOneService();

    @Test
    void testAddition() {
        assertEquals(15, practiceOneService.calculate(9, 6, "+"));
    }

    @Test
    void testSubstraction() {
        assertEquals(-5, practiceOneService.calculate(10,15, "-"));
    }

    @Test
    void testMultiplication() {
        assertEquals(24, practiceOneService.calculate(3, 8, "*"));
    }

    @Test
    void testDivisionByZero() {
        assertEquals(Double.NaN, practiceOneService.calculate(8, 0, "/"));
    }

    @Test
    void testDivision() {
        assertEquals(2.5, practiceOneService.calculate(10, 4, "/"));
    }

    @Test
    void testPair(){
        assertEquals("Es par", practiceOneService.isPair(128));
    }

    @Test
    void testUnpair(){
        assertEquals("No es par", practiceOneService.isPair(333));
    }

    @Test
    void testFirstSquare() {
        assertEquals("81 es cuadrado de 9", practiceOneService.squareNumber(9, 81));
    }

    @Test
    void testSecondSquare() {
        assertEquals("25 es cuadrado de 5", practiceOneService.squareNumber(25, 5));
    }

    @Test
    void testSquare() {
        assertEquals("8 no es cuadrado de 2", practiceOneService.squareNumber(8, 2));
    }
}
