package factorymethod;

/**
 * Created by Ufuk on 22-04-15.
 */
public class ShapeFactory {

    public Triangle newTriangle() {
        return new Triangle();
    }

    // factory-method
    public static Circle newCircle() {
        return new Circle();
    }

}