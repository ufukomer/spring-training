package declareparents;

/**
 * Created by Ufuk on 19-06-15.
 */
public class LockableImpl implements Lockable {

    private boolean lock = true;

    @Override
    public boolean isLocked() {
        if (lock) System.out.println("It is locked");
        else System.out.println("It is unlocked");
        return lock;
    }

    @Override
    public void lock() {
        lock = true;
    }

    @Override
    public void unlock() {
        lock = false;
    }
}