package namespace;

/**
 * Created by Ufuk on 29-04-15.
 */
public class Employee {

    private String name;
    private Country country;

    public Employee(Country country, String name) {
        this.country = country;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " lives in " + country.getName() + " " +  country.getCoordinates();
    }
}
