package com.example;

import org.example.Calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void testMultiply() {
        Calculator calc = new Calculator();
        assertEquals(36, calc.multiply(6,6));
    }
}
