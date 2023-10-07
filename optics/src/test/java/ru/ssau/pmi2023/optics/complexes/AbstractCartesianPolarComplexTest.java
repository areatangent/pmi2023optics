package ru.ssau.pmi2023.optics.complexes;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public abstract class AbstractCartesianPolarComplexTest {

    private static final double DELTA = 0.000001;

    protected abstract Complex createFromCartesian(double re, double im);

    protected abstract Complex createFromPolar(double abs, double arg);

    @Test
    public void testCartesian() {
        Complex a1 = createFromCartesian(3, 4);
        assertEquals(a1.re(), 3, DELTA);
        assertEquals(a1.im(), 4, DELTA);
        assertEquals(a1.abs(), 5, DELTA);
        assertEquals(a1.arg(), Math.atan(4./3), DELTA);

        Complex a2 = createFromCartesian(3, 4);
        assertEquals(a2.im(), 4, DELTA);
        assertEquals(a2.re(), 3, DELTA);
        assertEquals(a2.arg(), Math.atan(4./3), DELTA);
        assertEquals(a2.abs(), 5, DELTA);
    }

}