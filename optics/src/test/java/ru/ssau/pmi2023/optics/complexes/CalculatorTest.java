package ru.ssau.pmi2023.optics.complexes;

import org.testng.annotations.Test;

public class CalculatorTest {

    protected static final double DELTA = 0.000001;

    protected static void assertEquals(Complex actual, Complex expected) {
        org.testng.Assert.assertEquals(actual.re(), expected.re(), DELTA);
        org.testng.Assert.assertEquals(actual.im(), expected.im(), DELTA);
    }

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        assertEquals(
                calculator.sum(new CartesianComplex(1, 1), new CartesianComplex(2, -3)),
                new CartesianComplex(3, -2));
    }

    @Test
    public void testMult() {
        Calculator calculator = new Calculator();
        assertEquals(
                calculator.mult(new CartesianComplex(3, 4), new CartesianComplex(3, -4)),
                new CartesianComplex(25, 0));
        assertEquals(
                calculator.mult(new PolarComplex(2, Math.PI / 2),
                        LazyComplex.createFromPolar(3, 3 * Math.PI /2)),
                new PolarComplex(6, 0));
    }

}