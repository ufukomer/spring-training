package methodreplacement;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * Created by Ufuk on 21-04-15.
 */
public class TapeRecorder implements MethodReplacer {
    // After replacement, this method will be used instead of recordOnCassette(..) method
    // which is in the Recorder abstract class
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        // args[0] is the parameter of recordOnCassette(..) method
        System.out.println("The voice recorded onto cassette has id: " + args[0].toString());
        return null;
    }
}