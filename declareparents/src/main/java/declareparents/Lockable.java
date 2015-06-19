package declareparents;

/**
 * Created by Ufuk on 19-06-15.
 */
public interface Lockable {

    boolean isLocked();

    void lock();

    void unlock();
}