package beanlifecycle;

/**
 * Created by Ufuk on 30-04-15.
 */
public class HelloWorld {

    private String message;

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
