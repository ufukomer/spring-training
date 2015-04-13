package strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Ufuk on 13-04-15.
 */
@Component("context")
public class Context {

    @Autowired
    private Strategy strategy;

//    public Context(Strategy strategy) {
//        this.strategy = strategy;
//    }

    void executeStrategy(int num1, int num2) {
        System.out.println(strategy.doOperation(num1, num2));
    }

}
