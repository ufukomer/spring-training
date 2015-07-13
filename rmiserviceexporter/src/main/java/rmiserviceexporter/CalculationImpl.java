package rmiserviceexporter;

/**
 * Created by Ufuk on 13-07-15.
 */
public class CalculationImpl implements Calculation {

    @Override
    public int cube(int number) {
        return number * number * number;
    }
}
