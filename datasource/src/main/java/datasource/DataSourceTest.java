package datasource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Ufuk on 11-05-15.
 */
public class DataSourceTest {
    @Test
    public void data_source_test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("datasource.xml");
        CustomerDAOImpl customer = context.getBean("customer", CustomerDAOImpl.class);
        System.out.println(customer.getCustomerByName("Omer"));
    }
}