package javabasedconfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import static constants.Constants.TAG;

/**
 * Created by Ufuk on 09-05-15.
 */
@Component
public class Radio {

    private final Logger logger = Logger.getLogger(TAG(this));

    @Autowired
    public ArrayList<String> playList;

    // Not necessary
    public Radio() {
        logger.log(Level.INFO, "constructor invoked");
    }

    public void play() {
        System.out.println(playList.get(1) + " is playing now");
    }

}
