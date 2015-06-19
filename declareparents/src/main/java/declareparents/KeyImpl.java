package declareparents;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by Ufuk on 19-06-15.
 */
@Component("keyImpl")
@Scope(value = "prototype")
public class KeyImpl implements Key {

    private String key = null;

    @Override
    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        System.out.println("Current Key: " + this.key);
        return this.key;
    }
}
