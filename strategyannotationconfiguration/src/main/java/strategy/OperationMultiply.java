package strategy;

/**
 * Created by Ufuk on 08-05-15.
 */
public class OperationMultiply implements Strategy {
    @Override
    public void doOperation(int x, int y) {
        System.out.println(x * y);
    }
}
