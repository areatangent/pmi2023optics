package ru.ssau.pmi2023.optics.complexes;

public class CartesianPolarComplexTest extends AbstractCartesianPolarComplexTest {

    @Override
    protected Complex createFromCartesian(double re, double im) {
        return CartesianPolarComplex.createFromCartesian(re, im);
    }

    @Override
    protected Complex createFromPolar(double abs, double arg) {
        return CartesianPolarComplex.createFromPolar(abs, arg);
    }
}