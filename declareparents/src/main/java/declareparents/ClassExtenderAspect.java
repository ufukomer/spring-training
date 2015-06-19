package declareparents;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

/**
 * Created by Ufuk on 19-06-15.
 */
@Aspect
@Component
public class ClassExtenderAspect {

    // It can be used any class that implements Lockable interface as 'defaultImpl'
    @DeclareParents(value = "declareparents.Key*", defaultImpl = LockableImpl.class)
    private Lockable mixin;
}