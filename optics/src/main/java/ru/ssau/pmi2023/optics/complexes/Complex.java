package ru.ssau.pmi2023.optics.complexes;

public interface Complex {

    double re();

    double im();

    double abs();

    double arg();

    Complex asCartesian();

    Complex asPolar();

    boolean hasCartesianForm();

    boolean hasPolarForm();

}
