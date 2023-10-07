package ru.ssau.pmi2023.optics.complexes;

public class LazyComplexTest extends AbstractCartesianPolarComplexTest {

    @Override
    protected Complex createFromCartesian(double re, double im) {
        return LazyComplex.createFromCartesian(re, im);
    }

    @Override
    protected Complex createFromPolar(double abs, double arg) {
        return LazyComplex.createFromPolar(abs, arg);
    }
}