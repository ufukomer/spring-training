package aopperformancemonitoring;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Created by Ufuk on 18-06-15.
 */
@Aspect
public class PerformanceLoggerAspect {

    @Around("execution(* aopperformancemonitoring.MagnitudeComparison.maxBrightness(..))")
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
