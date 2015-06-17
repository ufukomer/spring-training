package transactional;

import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Ufuk on 30-05-15.
 */
@Component
public class UserDAOImpl implements UserDAO {

    // Hibernate needs SessionFactory object for database operations

    @Autowired
    private HibernateTemplate hibernateTemplate;

    public List<User> getUsers() {
        return this.hibernateTemplate.loadAll(User.class);
    }

    public void insertUser(User user) {
        User mergeUser = this.hibernateTemplate.merge(user);
    }

    @Override
    public void deleteUser(int id) {
        Query query = hibernateTemplate.getSessionFactory()
                .getCurrentSession().createQuery("DELETE User where id = :id");
        query.setParameter("id", id);
        query.executeUpdate();
    }

    @Override
    public void deleteUser(String username) {
        Query query = hibernateTemplate.getSessionFactory()
                .getCurrentSession().createQuery("DELETE User where username = :username");
        query.setParameter("username", username);
        query.executeUpdate();
    }

    @Override
    public User getUser(int userId) {
        return null;
    }

    @Override
    public User getUser(String username) {
        return null;
    }
}
