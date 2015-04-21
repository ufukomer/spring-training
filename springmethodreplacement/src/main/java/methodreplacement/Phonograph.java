package methodreplacement;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * Created by Ufuk on 21-04-15.
 */
public class Phonograph implements MethodReplacer {
    // After replacement, this method will be used instead of recordOnCylinder(..) method
    // which is in the Recorder abstract class
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        // args[0] is the parameter of recordOnCylinder(..) method
        System.out.println("The voice recorded onto cylinder has id: " + args[0].toString());
        return null;
    }
}