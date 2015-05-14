package jdbctemplate;

import datasource.Customer;

import java.util.List;

/**
 * Created by Ufuk on 11-05-15.
 */
public interface CustomerDAO {

    Object getCustomerByName(String name);

    void saveCustomer(Customer customer);

    List getCustomerList();

    void writeCustomerToFile(String name);
}
