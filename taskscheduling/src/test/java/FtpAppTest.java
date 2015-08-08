import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import taskscheduling.async.DefaultFtpApp;
import taskscheduling.async.FtpApp;
import taskscheduling.configuration.AppConfig;

import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * Created by Ufuk on 08-08-15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader = AnnotationConfigContextLoader.class, classes = {
        AppConfig.class, DefaultFtpApp.class})
public class FtpAppTest {

    @Autowired
    private FtpApp ftp;

    @Test
    public void test() throws InterruptedException, ExecutionException {

        System.out.println("About to run...");

        // Call to sendAsync
        // This will execute in another thread. The sysout below this
        // line will execute before the sysout within sendAsync.
        Future<Boolean> ftpResult = ftp.sendAsync(new File("somefile"),
                "somehost");

        System.out.println("This will run immediately.");

        // Using get without a timeout will wait for the async task to finish.
        // If you want to wait for only a certain time for the result, you may
        // use the get(long timeout, TimeUnit unit) instead. This flavor of
        // get() will throw a TimeoutException if the result is not yet given
        // after the specified amount of time.
        Boolean result = ftpResult.get();

        System.out.println("And the result of get() is " + result);

        Assert.assertTrue(result);
    }
}
