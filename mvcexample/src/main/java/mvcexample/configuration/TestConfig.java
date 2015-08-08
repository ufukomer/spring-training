package mvcexample.configuration;

import mvcexample.service.EmployeeService;
import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by Ufuk on 07-08-15.
 */
@Configuration
@EnableWebMvc // Equivalent to mvc:annotation-driven in XML
@ComponentScan(basePackages = "mvcexample")
public class TestConfig {

    @Bean
    public EmployeeService employeeService() {
        return Mockito.mock(EmployeeService.class);
    }
}
