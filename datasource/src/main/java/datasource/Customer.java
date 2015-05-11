package datasource;

/**
 * <p>This is our domain object</>
 * Created by Ufuk on 11-05-15.
 */
public class Customer {

    private String firstName;
    private String lastName;
    private long id;
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setId(long id) {
        this.id = id;
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
        return "Name: " + firstName + "\n" +
                "Last Name: " + lastName + "\n" +
                "ID: " + id + "\n" +
                "Number: " + number + "\n";
    }
}
