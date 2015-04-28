package helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Ufuk on 12-04-15.
 */
@Component(value = "context")
public class HelloWorldContext {

    @Autowired
    private HelloWorldService service;

    public void showMessage() {
        service.getMessage();
    }
}
