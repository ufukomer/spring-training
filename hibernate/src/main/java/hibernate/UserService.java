package hibernate;

import java.util.List;

/**
 * Created by Ufuk on 29-05-15.
 */
public interface UserService {

    void insertUser(User user);

    void deleteUser(String username);

    User getUser(int userId);

    User getUser(String username);

    List<User> getUsers();
}
