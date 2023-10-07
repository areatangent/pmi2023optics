package ru.ssau.pmi2023.optics.complexes;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CartesianComplexTest {

    private static final double DELTA = 0.000001;

    @Test
    public void testAbs() {
        Complex a1 = new CartesianComplex(3, 4);
        assertEquals(a1.abs(), 5, DELTA);
        Complex a2 = new CartesianComplex(0.1, 0.1);
        assertEquals(a2.abs(), Math.sqrt(0.02), DELTA);
    }

    @Test
    public void testArg() {
        Complex a1 = new CartesianComplex(3, 0);
        assertEquals(a1.arg(), 0, DELTA);
        Complex a2 = new CartesianComplex(0.1, 0.1);
        assertEquals(a2.arg(), Math.PI/4, DELTA);
        Complex a3 = new CartesianComplex(-3, 0);
        assertEquals(a3.arg(), Math.PI, DELTA);
        Complex a4 = new CartesianComplex(Double.NEGATIVE_INFINITY, 0);
        assertEquals(a4.arg(), Math.PI, DELTA);
    }

}