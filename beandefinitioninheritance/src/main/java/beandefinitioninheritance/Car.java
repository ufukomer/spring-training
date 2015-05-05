package beandefinitioninheritance;

/**
 * Created by Ufuk on 05-05-15.
 */
public class Car {

    public static enum CarType {
        BUS, CAR, SPORT
    }

    private CarType type;
    private String brand;
    private String model;

    public Car() {
    }

    public void setType(CarType type) {
        this.type = type;
    }

    public void setBrand(String brand) {

        this.brand = brand;
    }

    public void setModel(String model) {

        this.model = model;
    }

    public void showSpecifications() {
        System.out.println("Type: " + getType());
        System.out.println("Brand: " + getBrand());
        System.out.println("Model: " + getModel());
    }

    public CarType getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
}
