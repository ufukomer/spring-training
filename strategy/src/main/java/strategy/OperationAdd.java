package strategy;

/**
 * Created by Ufuk on 13-04-15.
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
