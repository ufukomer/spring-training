package listinjection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created by Ufuk on 16-04-15.
 */
public class JavaCollection {

    private List list;
    private Set set;
    private Map map;
    private Properties properties;

    public void setProperties(Properties addressProp) {
        this.properties = addressProp;
    }

    public void setList(List list) {
        this.list = list;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public List getList() {
        System.out.println("List Elements: " + list.toString());
        return list;
    }

    public Set getSet() {
        System.out.println("Set Elements: " + set.toString());
        return set;
    }

    public Map getMap() {
        System.out.println("Map Elements: " + map.toString());
        return map;
    }

    public Properties getProperties() {
        System.out.println("Property Elements: " + properties.toString());
        return properties;
    }

}
