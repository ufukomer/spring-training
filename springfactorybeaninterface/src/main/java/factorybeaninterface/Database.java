package factorybeaninterface;

/**
 * Created by Ufuk on 26-04-15.
 */
public class Database {

    private Employee[] employee;

    public void setEmployee(Employee[] employee) {
        this.employee = employee;
    }

    public Employee[] getEmployee() {
        return employee;
    }

    @Override
    public String toString() {

        String toString = "";

        for (Employee emp : employee) {
            toString = toString + emp + " ";
        }

        return toString;
    }

}
