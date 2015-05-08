package spel;

/**
 * Created by Ufuk on 08-05-15.
 */
public class Country {

    private String name;
    private String N;
    private String E;

    public void setN(String n) {
        N = n;
    }

    public void setE(String e) {
        E = e;
    }

    public String getN() {
        return N;
    }

    public String getE() {
        return E;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " [ " + N + ", " + E + "]";
    }
}
