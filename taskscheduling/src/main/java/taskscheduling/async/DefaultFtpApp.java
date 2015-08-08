package taskscheduling.async;

import java.io.File;
import java.util.concurrent.Future;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

/**
 * Created by Ufuk on 08-08-15.
 */
@Component
public class DefaultFtpApp implements FtpApp {

    @Async
    public Future<Boolean> sendAsync(final File file, final String host)
            throws InterruptedException {

        boolean result = false;

        // Call the long running task here
        // This is in place of the actual sending of the file via FTP
        Thread.sleep(1000);

        // Say sending succeeds and returns true
        result = true;

        System.out.println("Done running...");

        // Wrap the result in an AsyncResult
        return new AsyncResult<>(result);
    }
}
