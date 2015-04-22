package factorymethod;

/**
 * Created by Ufuk on 22-04-15.
 */
public class Informer {

    private Shape shape;

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public void printInfo() {
        getShape().printInfo();
    }

}
