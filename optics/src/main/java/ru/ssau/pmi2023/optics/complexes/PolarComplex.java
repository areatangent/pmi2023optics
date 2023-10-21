package ru.ssau.pmi2023.optics.complexes;

public final class PolarComplex implements Complex {

    private final double abs;
    private final double arg;

    public PolarComplex(double abs, double arg) {
        this.abs = abs;
        this.arg = arg;
    }

    @Override
    public double re() {
        return abs * Math.cos(arg);
    }

    @Override
    public double im() {
        return abs * Math.sin(arg);
    }

    @Override
    public double abs() {
        return abs;
    }

    @Override
    public double arg() {
        return arg;
    }

    @Override
    public Complex asCartesian() {
        return new CartesianComplex(re(), im());
    }

    @Override
    public Complex asPolar() {
        return this;
    }

    @Override
    public boolean hasCartesianForm() {
        return false;
    }

    @Override
    public boolean hasPolarForm() {
        return true;
    }
}
