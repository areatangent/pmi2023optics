package ru.ssau.pmi2023.optics.complexes.factory;

import ru.ssau.pmi2023.optics.complexes.Complex;

public interface ComplexFactory {

    Complex createFromCartesian(double re, double im);

    Complex createFromPolar(double abs, double arg);

}
