import mvcexample.configuration.TestConfig;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Created by Ufuk on 06-08-15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = TestConfig.class)
public class AppControllerTest {

    @Autowired
    private WebApplicationContext wac;

    // We'll send the user(client) request to this entry point
    private MockMvc mockMvc;

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

    @Test
    public void list_employees_should_be_loaded() throws Exception {

        this.mockMvc.perform(get("/", "/list"))
                // Throws exception if response status code is not 200
                .andExpect(status().isOk())
                // Throws exception if listAllEmployees method in the
                // AppController does not return "allemployees"
                .andExpect(view().name("allemployees"))
                // Controls the view element that has been forwarded to
                .andExpect(forwardedUrl("/WEB-INF/views/allemployees.jsp"))
                // Controls if model object has a map named 'employees'
                .andExpect(model().attributeExists("employees"));
    }

    @Test
    public void registration_page_should_be_loaded() throws Exception {

        this.mockMvc.perform(get("/new"))
                .andExpect(status().isOk())
                .andExpect(view().name("registration"))
                .andExpect(forwardedUrl("/WEB-INF/views/registration.jsp"))
                .andExpect(model().attributeExists("employee"));
    }

    @Test
    public void save_employee_should_work() throws Exception {

        this.mockMvc.perform(post("/new").
                contentType(MediaType.APPLICATION_FORM_URLENCODED)
                .param("name", "Ufuk")
                .param("joiningDate", "10/07/2015")
                .param("salary", "15000")
                .param("ssn", "1"))
                .andExpect(forwardedUrl("/WEB-INF/views/success.jsp"))
                .andExpect(model().attributeExists("success"))
                .andExpect(model().hasNoErrors());
    }

    // TODO: Write the test code for deleteEmployee in AppController
}