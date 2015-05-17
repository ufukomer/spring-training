package helloworld;

/**
 * Created by Ufuk on 12-04-15.
 */
public class HelloWorldImp implements HelloWorldService {

    @Override
    public void getMessage() {
        System.out.println("Hello World!");
    }
}
