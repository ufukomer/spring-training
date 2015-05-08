package strategy;

/**
 * Created by Ufuk on 13-04-15.
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    void executeStrategy(int num1, int num2) {
        System.out.println(strategy.doOperation(num1, num2));
    }
}
