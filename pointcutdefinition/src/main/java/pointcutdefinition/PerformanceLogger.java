package pointcutdefinition;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * Created by Ufuk on 19-06-15.
 */
@Aspect
public class PerformanceLogger {

    @Around("pointcutdefinition.SystemPointcuts.serviceLayer()")
    public Object profile(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();
        System.out.println("Before method: " + pjp.getSignature());
        Object output = pjp.proceed();
        System.out.println("After method: " + pjp.getSignature());
        long elapsedTime = System.currentTimeMillis() - start;
        System.out.println("Total process time: "
                + elapsedTime + " ms\n");
        return output;
    }
}