package lifecyclemethods;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import static constants.Constants.TAG;

/**
 * Created by Ufuk on 02-05-15.
 */
public class EmployeeService implements InitializingBean, DisposableBean {

    private Employee employee;

    public EmployeeService() {
        System.out.println(TAG(this) + " no-args constructor called");
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    @Override // InitializingBean
    public void afterPropertiesSet() throws Exception {
        System.out.println(TAG(this) + " initializing to name value");
        if (employee.getName() == null) {
            employee.setName("Carl");
        }
    }

    @Override // DisposableBean
    public void destroy() throws Exception {
        System.out.println("Destruction of " + TAG(this));
    }
}
