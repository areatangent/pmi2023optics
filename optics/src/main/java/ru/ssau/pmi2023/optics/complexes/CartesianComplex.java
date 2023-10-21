package ru.ssau.pmi2023.optics.complexes;

public final class CartesianComplex implements Complex {

    private final double re;
    private final double im;

    public CartesianComplex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    @Override
    public double re() {
        return re;
    }

    @Override
    public double im() {
        return im;
    }

    @Override
    public double abs() {
        return Math.sqrt(re * re + im * im);
    }

    @Override
    public double arg() {
        return Math.atan2(im, re);
    }

    @Override
    public Complex asCartesian() {
        return this;
    }

    @Override
    public Complex asPolar() {
        return new PolarComplex(abs(), arg());
    }

    @Override
    public boolean hasCartesianForm() {
        return true;
    }

    @Override
    public boolean hasPolarForm() {
        return false;
    }
}
