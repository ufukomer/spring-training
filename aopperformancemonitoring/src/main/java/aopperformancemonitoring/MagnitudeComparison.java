package aopperformancemonitoring;

/**
 * Created by Ufuk on 18-06-15.
 */
public class MagnitudeComparison {

    /**
     * <p>Minimum magnitude means maximum brightness.</p>
     *
     * @param x   first magnitude value
     * @param y   second magnitude value
     * @param z   third magnitude value
     * @param <T> short, int, float or double
     * @return the maximum brightness
     */
    public <T extends Comparable<T>> T maxBrightness(T x, T y, T z) {

        // Initial max brightness
        T max = x;

        if (y.compareTo(max) < 0) {
            max = y;
        }
        if (z.compareTo(max) < 0) {
            max = z;
        }

        return max;
    }

    /**
     * <p>Minimum magnitude means maximum brightness.</p>
     *
     * @param x   first magnitude value
     * @param y   second magnitude value
     * @param z   third magnitude value
     * @param <T> short, int, float or double
     * @return the minimum brightness
     */
    public <T extends Comparable<T>> T minBrightness(T x, T y, T z) {

        // Initial max brightness
        T max = x;

        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }

        return max;
    }
}
