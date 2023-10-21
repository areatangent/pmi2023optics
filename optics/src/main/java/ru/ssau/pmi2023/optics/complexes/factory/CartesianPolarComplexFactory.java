package ru.ssau.pmi2023.optics.complexes.factory;

import ru.ssau.pmi2023.optics.complexes.CartesianPolarComplex;
import ru.ssau.pmi2023.optics.complexes.Complex;

public class CartesianPolarComplexFactory implements ComplexFactory {

    @Override
    public Complex createFromCartesian(double re, double im) {
        return CartesianPolarComplex.createFromCartesian(re, im);
    }

    @Override
    public Complex createFromPolar(double abs, double arg) {
        return CartesianPolarComplex.createFromPolar(abs, arg);
    }
}
