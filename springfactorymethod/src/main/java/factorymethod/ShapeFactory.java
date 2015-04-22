package factorymethod;

/**
 * Created by Ufuk on 22-04-15.
 */
public class ShapeFactory {

    // factory-method
    public static Shape newInstance() {
        return new Shape();
    }

}
