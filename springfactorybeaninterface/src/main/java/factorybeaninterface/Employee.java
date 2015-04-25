package factorybeaninterface;

import java.util.UUID;

/**
 * Created by Ufuk on 26-04-15.
 */
public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private String job;

    public void setJob(String job) {
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {

        return "Employee [ ID: " + id + ","
                + " FirstName: " + firstName + ","
                + " LastName: " + lastName + ","
                + " Job: " + job + " ]";
    }

}