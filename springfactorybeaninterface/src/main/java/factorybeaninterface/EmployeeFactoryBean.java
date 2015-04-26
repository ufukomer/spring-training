package factorybeaninterface;

import org.springframework.beans.factory.FactoryBean;

/**
 * Created by Ufuk on 26-04-15.
 */
public class EmployeeFactoryBean implements FactoryBean<Object> {

    private String job;

    // Setter and Getter must be declared to job object use as property
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public Object getObject() throws Exception {
        Employee employee = new Employee();
        employee.setId(-1);
        employee.setFirstName("dummy");
        employee.setLastName("dummy");
        employee.setJob(job);
        return employee;
    }

    @Override
    public Class<?> getObjectType() {
        return Employee.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
