package transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Ufuk on 30-05-15.
 */
@Component("userManager")
public class UserManager {

    @Autowired
    @Qualifier("userDAOImpl")
    private UserDAO userDAO;

    // If one of the delete method is fail, spring will rollback the other one
    @Transactional
    public void deleteUser(int id, String username) {
        userDAO.deleteUser(id);
        userDAO.deleteUser(username);
    }

    public void getUser(String username) {
        userDAO.getUser(username);
    }

    public List<User> getUsers() {
        return userDAO.getUsers();
    }

    // Isolation prevents the problems those occurs while two thread working on the same data.
    // For example thread a changed a data and was not commit yet. Then thread b make changes
    // on that uncommitted data. If thread a rollback this data things become complicated.
    // That's called dirty read.

    // REPEATABLE_READ isolation constant protects the SQL queries and uses them. Thus if
    // data changed from outside that constant uses its non-changed version.
    @Transactional(isolation = Isolation.REPEATABLE_READ)
    public void displayUser(String username) {
        int i = 0;

        while (true) {
            i++;
            System.out.println(userDAO.getUser(username) + " " + i);

            try {
                Thread.sleep(5000);
                System.out.println(userDAO.getUser(username));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
