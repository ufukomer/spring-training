package jdbctemplate;

import datasource.Customer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by Ufuk on 13-05-15.
 */
public class JdbcTemplateTest {

    @Test
    public void jdbc_template_test() {

        ApplicationContext context = new ClassPathXmlApplicationContext("datasourceconf.xml");
        CustomerDAOImpl customerDAOImpl = context.getBean("jdbcTemplateCustomer", CustomerDAOImpl.class);

        Customer customer = new Customer("Ufuk", "Efendioglu", 213432);
        customerDAOImpl.saveCustomer(customer);
        System.out.println(customerDAOImpl.getCustomerByName("Ufuk"));

        // Print a list which contains all customer data
        List<Customer> list = customerDAOImpl.getCustomerList();
        System.out.println(list);

        // This method creates a new file in output package with given name as parameter
        // You can change te file name to see another customer's info in a txt file
        customerDAOImpl.writeCustomerToFile("Ufuk");

        // Deletes the customer with given name
        int[] deleteCount = customerDAOImpl.deleteCustomerByName(list, "Okan");
        // Count of rows affected in 0th statement
        System.out.println("Affected rows: " + deleteCount[0]);

        list = customerDAOImpl.getCustomerList();
        System.out.println(list);
    }
}
