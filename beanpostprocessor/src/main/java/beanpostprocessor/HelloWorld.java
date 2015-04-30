package beanpostprocessor;

import org.springframework.beans.factory.annotation.Required;

/**
 * Created by Ufuk on 01-05-15.
 */
public class HelloWorld {

    String message;

    @Required
    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println(message);
    }

    public void init() {
        System.out.println("Bean is being initialized.");
    }

    public void destroy() {
        System.out.println("Bean is being destroyed.");
    }
}
