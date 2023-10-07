package ru.ssau.pmi2023.optics.complexes;

public final class LazyComplex implements Complex {

    private CartesianComplex cartesianComplex;
    private PolarComplex polarComplex;

    private LazyComplex(double a, double b, boolean cartesian) {
        if (cartesian) {
            cartesianComplex = new CartesianComplex(a, b);
        } else {
            polarComplex = new PolarComplex(a, b);
        }
    }

    public static LazyComplex createFromCartesian(double re, double im) {
        return new LazyComplex(re, im, true);
    }

    public static LazyComplex createFromPolar(double abs, double arg) {
        return new LazyComplex(abs, arg, false);
    }

    @Override
    public double re() {
        if (cartesianComplex == null) {
            cartesianComplex = new CartesianComplex(polarComplex.re(), polarComplex.im());
        }
        return cartesianComplex.re();
    }

    @Override
    public double im() {
        if (cartesianComplex == null) {
            cartesianComplex = new CartesianComplex(polarComplex.re(), polarComplex.im());
        }
        return cartesianComplex.im();
    }

    @Override
    public double abs() {
        if (polarComplex == null) {
            polarComplex = new PolarComplex(cartesianComplex.abs(), cartesianComplex.arg());
        }
        return polarComplex.abs();
    }

    @Override
    public double arg() {
        if (polarComplex == null) {
            polarComplex = new PolarComplex(cartesianComplex.abs(), cartesianComplex.arg());
        }
        return polarComplex.arg();
    }
}
