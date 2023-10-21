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
        return asCartesian().re();
    }

    @Override
    public double im() {
        return asCartesian().im();
    }

    @Override
    public double abs() {
        return asPolar().abs();
    }

    @Override
    public double arg() {
        return asPolar().arg();
    }

    @Override
    public Complex asCartesian() {
        if (cartesianComplex == null) {
            cartesianComplex = new CartesianComplex(polarComplex.re(), polarComplex.im());
        }
        return cartesianComplex;
    }

    @Override
    public Complex asPolar() {
        if (polarComplex == null) {
            polarComplex = new PolarComplex(cartesianComplex.abs(), cartesianComplex.arg());
        }
        return polarComplex;
    }

    @Override
    public boolean hasCartesianForm() {
        return cartesianComplex != null;
    }

    @Override
    public boolean hasPolarForm() {
        return polarComplex != null;
    }
}
