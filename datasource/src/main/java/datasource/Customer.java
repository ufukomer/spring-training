package datasource;

/**
 * Created by Ufuk on 11-05-15.
 */
public class Customer {

    private String firstName;
    private String lastName;
    private int id;
    private int number;

    public Customer() {
    }

    public Customer(String firstName, String lastName, int number) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.number = number;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "\n" + "Name: " + firstName + ", " +
                "Last Name: " + lastName + ", " +
                "ID: " + id + ", " +
                "Number: " + number;
    }
}
