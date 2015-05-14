package namedparameterjdbctemplate;

import datasource.Customer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Ufuk on 14-05-15.
 */
public class NamedParameterJdbcTemplateTest {

    @Test
    public void named_parameter_jdbc_template_test() {

        ApplicationContext context = new ClassPathXmlApplicationContext("datasourceconf.xml");
        CustomerDAOImpl customerDAOImpl =
                context.getBean("namedParameterJdbcTemplateCustomer", CustomerDAOImpl.class);

        Customer customer2 = new Customer("Brain", "Brian", 12);

        customerDAOImpl.addCustomer(customer2);

        System.out.println(customerDAOImpl.findCustomerById(200));
        System.out.println(customerDAOImpl.findCustomerByName("Brain"));
    }
}
