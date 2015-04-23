package factorymethod;

/**
 * Created by Ufuk on 22-04-15.
 */
public class Informer {

    private Triangle triangle;
    private Circle circle;

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public Circle getCircle() {
        return circle;
    }

    public void setTriangle(Triangle triangle) {
        this.triangle = triangle;
    }

    public Triangle getTriangle() {
        return triangle;
    }

    public void printInfo() {
        getCircle().printInfo();
        getTriangle().printInfo();
    }

}