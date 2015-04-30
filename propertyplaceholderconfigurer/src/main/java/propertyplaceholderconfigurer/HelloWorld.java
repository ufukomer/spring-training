package propertyplaceholderconfigurer;

/**
 * Created by Ufuk on 30-04-15.
 */
public class HelloWorld {

    private String prefix;
    private String suffix;

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void sayHello() {
        System.out.println(prefix);
    }

    public void sayGoodbye() {
        System.out.println(suffix);
    }
}
