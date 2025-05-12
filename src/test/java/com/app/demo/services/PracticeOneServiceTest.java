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
}
