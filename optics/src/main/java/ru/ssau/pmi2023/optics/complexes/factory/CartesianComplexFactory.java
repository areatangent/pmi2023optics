package ru.ssau.pmi2023.optics.complexes.factory;

import ru.ssau.pmi2023.optics.complexes.CartesianComplex;
import ru.ssau.pmi2023.optics.complexes.Complex;
import ru.ssau.pmi2023.optics.complexes.PolarComplex;

public class CartesianComplexFactory implements ComplexFactory {
    @Override
    public Complex createFromCartesian(double re, double im) {
        return new CartesianComplex(re, im);
    }

    @Override
    public Complex createFromPolar(double abs, double arg) {
        return new PolarComplex(abs, arg).asCartesian();
    }
}
