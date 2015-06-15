package hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Ufuk on 29-05-15.
 */
@Service("UserServiceImpl")
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    @Qualifier("userDAOImpl")
    private UserDAO userDAO;

    @Override
    public void insertUser(User user) {
        userDAO.insertUser(user);
    }

    @Override
    public User getUser(int userId) {
        return userDAO.getUser(userId);
    }

    @Override
    public User getUser(String username) {
        return userDAO.getUser(username);
    }

    @Override
    public List<User> getUsers() {
        return userDAO.getUsers();
    }
}
