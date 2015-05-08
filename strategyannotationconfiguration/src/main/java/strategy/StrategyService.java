package strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.logging.Level;
import java.util.logging.Logger;

import static constants.Constants.TAG;

/**
 * Created by Ufuk on 08-05-15.
 */
@Component("strategyService")
public class StrategyService {

    @Autowired
    @Qualifier("operationMultiply")
    private Strategy strategy;

    private final Logger logger = Logger.getLogger(TAG(this));

    public void executeOperation(int x, int y) {
        logger.log(Level.INFO,"executeOperation has ben invoked");
        strategy.doOperation(x, y);
    }
}
