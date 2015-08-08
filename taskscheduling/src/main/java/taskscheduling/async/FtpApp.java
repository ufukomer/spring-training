package taskscheduling.async;

import java.io.File;
import java.util.concurrent.Future;

/**
 * Created by Ufuk on 08-08-15.
 */
public interface FtpApp {

    Future<Boolean> sendAsync(final File file,
                              final String host) throws InterruptedException;
}
