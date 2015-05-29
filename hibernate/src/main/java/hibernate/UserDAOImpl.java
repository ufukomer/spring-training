package hibernate;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Ufuk on 29-05-15.
 */
public class UserDAOImpl implements UserDAO {

    // Hibernate needs SessionFactory object for database operations
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void insertUser(User user) {
        sessionFactory.getCurrentSession().save(user);
    }

    @Override
    public User getUser(int userId) {
        return (User) sessionFactory.getCurrentSession().get(User.class, userId);
    }

    @Override
    public User getUser(String username) {
        String hql = "FROM User u WHERE u.username = :username";
        Query query = sessionFactory.getCurrentSession().
                createQuery(hql);
        query.setParameter("username", username);
        return (User) query.list().get(0);
    }

    @Override
    public List<User> getUsers() {
        Criteria criteria = sessionFactory.getCurrentSession().
                createCriteria(User.class);
        return criteria.list();
    }
}
