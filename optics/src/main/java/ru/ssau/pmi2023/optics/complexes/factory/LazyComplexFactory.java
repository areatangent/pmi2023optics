package ru.ssau.pmi2023.optics.complexes.factory;

import ru.ssau.pmi2023.optics.complexes.Complex;
import ru.ssau.pmi2023.optics.complexes.LazyComplex;

public class LazyComplexFactory implements ComplexFactory{

    @Override
    public Complex createFromCartesian(double re, double im) {
        return LazyComplex.createFromCartesian(re, im);
    }

    @Override
    public Complex createFromPolar(double abs, double arg) {
        return LazyComplex.createFromPolar(abs, arg);
    }
}
