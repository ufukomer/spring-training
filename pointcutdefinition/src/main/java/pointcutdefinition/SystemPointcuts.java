package pointcutdefinition;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by Ufuk on 19-06-15.
 */
@Aspect
public class SystemPointcuts {

    /**
     * Provides join point election from
     * dao package and its subpackages.
     */
    @Pointcut("within(pointcutdefinition.dao..*)")
    public void daoLayer() {
    }

    /**
     * Provides join point election from
     * service package and its subpackages.
     */
    @Pointcut("within(pointcutdefinition.service..*)")
    public void serviceLayer() {
    }

    /**
     * Provides join point election from
     * pointcutdefinition package and its subpackages.
     */
    @Pointcut("within(pointcutdefinition..*)")
    public void globalLayer() {
    }
}