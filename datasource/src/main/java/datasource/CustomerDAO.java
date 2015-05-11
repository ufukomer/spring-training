package datasource;

/**
 * Created by Ufuk on 11-05-15.
 */
public interface CustomerDAO {
    Customer getCustomerByName(String name);
    void saveCustomer();
}
