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

        Customer customerTwo = new Customer("Ufuk", "Efendioglu", 213432);
        customerDAOImpl.saveCustomer(customerTwo);
        System.out.println(customerDAOImpl.getCustomerByName("Ufuk"));
    }
}
