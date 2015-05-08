package helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by Ufuk on 12-04-15.
 */
@Component(value = "context")
@Qualifier(value = "helloWorldContext")
public class HelloWorldContext {

    @Autowired
    @Qualifier("helloworld")
    private HelloWorldService service;

    public void showMessage() {
        service.getMessage();
    }
}
