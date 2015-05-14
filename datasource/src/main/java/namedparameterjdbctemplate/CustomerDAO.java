package namedparameterjdbctemplate;

import datasource.Customer;

/**
 * Created by Ufuk on 14-05-15.
 */
public interface CustomerDAO {

    Customer findCustomerById(int id);

    Customer findCustomerByName(String name);

    void addCustomer(Customer customer);
}
