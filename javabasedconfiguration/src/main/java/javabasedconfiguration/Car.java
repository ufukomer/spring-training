package javabasedconfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.logging.Level;
import java.util.logging.Logger;

import static constants.Constants.TAG;

/**
 * Created by Ufuk on 09-05-15.
 */
@Component("car")
public class Car {

    private final Logger logger = Logger.getLogger(TAG(this));

    // Not necessary
    public Car() {
        logger.log(Level.INFO, "constructor invoked");
    }

    @Autowired
    private Radio radio;

    public void playRadio() {
        radio.play();
    }
}
