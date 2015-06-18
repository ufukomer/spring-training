package aopperformancemonitoring;

/**
 * Created by Ufuk on 18-06-15.
 */
public enum Star {

    SIRIUS(-1.46),
    ALPHA_CENTAURI(-0.28),
    RIGEL(0.12);

    private double magnitude;

    Star(double magnitude) {
        this.magnitude = magnitude;
    }

    public double getMagnitude() {
        return magnitude;
    }
}
