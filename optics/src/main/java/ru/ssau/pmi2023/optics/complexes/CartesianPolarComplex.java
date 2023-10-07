package ru.ssau.pmi2023.optics.complexes;

public final class CartesianPolarComplex implements Complex {

    private final CartesianComplex cartesianComplex;
    private final PolarComplex polarComplex;

    private CartesianPolarComplex(double a, double b, boolean cartesian) {
        if (cartesian) {
            cartesianComplex = new CartesianComplex(a, b);
            polarComplex = new PolarComplex(cartesianComplex.abs(), cartesianComplex.arg());
        } else {
            polarComplex = new PolarComplex(a, b);
            cartesianComplex = new CartesianComplex(polarComplex.re(), polarComplex.im());
        }
    }

    public static CartesianPolarComplex createFromCartesian(double re, double im) {
        return new CartesianPolarComplex(re, im, true);
    }

    public static CartesianPolarComplex createFromPolar(double abs, double arg) {
        return new CartesianPolarComplex(abs, arg, false);
    }

    @Override
    public double re() {
        return cartesianComplex.re();
    }

    @Override
    public double im() {
        return cartesianComplex.im();
    }

    @Override
    public double abs() {
        return polarComplex.abs();
    }

    @Override
    public double arg() {
        return polarComplex.arg();
    }
}
