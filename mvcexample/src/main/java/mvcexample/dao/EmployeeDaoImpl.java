package mvcexample.dao;

import mvcexample.model.Employee;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Ufuk on 10-07-15.
 */
@Repository
public class EmployeeDaoImpl extends AbstractDao implements EmployeeDao {

    @Override
    public void saveEmployee(Employee employee) {
        persist(employee);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Employee> findAllEmployees() {
        Criteria criteria = getSession().createCriteria(Employee.class);
        return (List<Employee>) criteria.list();
    }

    @Override
    public void deleteEmployeeBySsn(String ssn) {
        Query query = getSession().createSQLQuery("delete from Employee where ssn = :ssn");
        query.setString("ssn", ssn);
        query.executeUpdate();
    }
}
