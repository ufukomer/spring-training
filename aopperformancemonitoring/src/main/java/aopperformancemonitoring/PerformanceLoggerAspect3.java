package aopperformancemonitoring;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by Ufuk on 19-06-15.
 */
public class PerformanceLoggerAspect3 {

    // Around Advice with spring configuration file, no annotations

    public Object profile(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();
        System.out.println("Before method: " + pjp.getSignature());
        Object output = pjp.proceed();
        System.out.println("After method: " + pjp.getSignature());
        long elapsedTime = System.currentTimeMillis() - start;
        System.out.println("Total process time of "
                + MagnitudeComparison.class + ": "
                + elapsedTime + " ms");
        return output;
    }
}
