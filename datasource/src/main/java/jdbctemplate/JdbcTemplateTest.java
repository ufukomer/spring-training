package jdbctemplate;

import datasource.Customer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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

        // Print a list which contains all of our data
        System.out.println(customerDAOImpl.getCustomerList());

        // This method creates a new file in output package with given name as parameter
        // You can change te file name to see another customer's info in a txt file
        customerDAOImpl.writeCustomerToFile("Ufuk");
    }
}
