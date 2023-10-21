package ru.ssau.pmi2023.optics.complexes;

import ru.ssau.pmi2023.optics.complexes.factory.CartesianComplexFactory;
import ru.ssau.pmi2023.optics.complexes.factory.ComplexFactory;

public class Calculator {

    protected ComplexFactory factory;

    public Calculator() {
        factory = new CartesianComplexFactory();
    }

    public Calculator(ComplexFactory factory) {
        this.factory = factory;
    }

    public Complex sum(Complex a, Complex b) {
        return factory.createFromCartesian(a.re() + b.re(), a.im() + b.im());
    }

    public Complex sum(Complex a, double b) {
        return factory.createFromCartesian(a.re() + b, a.im());
    }

    public Complex mult(Complex a, Complex b) {
        if (a.hasPolarForm() && b.hasPolarForm()) {
            return factory.createFromPolar(a.abs() * b.abs(), normalizeArg(a.arg() + b.arg()));
        }
        return factory.createFromCartesian(a.re() * b.re() - a.im() * b.im(), a.re() * b.im() + a.im() * b.re());
    }

    public Complex conj(Complex a) {
        if (a.hasCartesianForm()) {
            return factory.createFromCartesian(a.re(), -a.im());
        }
        double newArg = -a.arg();
        return factory.createFromPolar(a.abs(), newArg == -Math.PI ? Math.PI : newArg);
    }

    public Complex expI(double a) {
        return factory.createFromPolar(1, normalizeArg(a));
    }

    public Complex exp(Complex a) {
        return factory.createFromPolar(Math.exp(a.re()), normalizeArg(a.im()));
    }

    protected double normalizeArg(double a) {
        double arg = a % (2 * Math.PI);
        if (arg > Math.PI) {
            arg -= 2 * Math.PI;
        }
        return arg;
    }

    public ComplexFactory getFactory() {
        return factory;
    }

    public void setFactory(ComplexFactory factory) {
        this.factory = factory;
    }
}
