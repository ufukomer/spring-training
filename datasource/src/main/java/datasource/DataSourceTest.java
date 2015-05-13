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
        ApplicationContext context = new ClassPathXmlApplicationContext("datasourceconf.xml");
        CustomerDAOImpl customer = context.getBean("dataSourceCustomer", CustomerDAOImpl.class);
        System.out.println(customer.getCustomerByName("Omer"));
    }
}