package namespace;

/**
 * Created by Ufuk on 29-04-15.
 */
public class Coordinates {

    private String n;
    private String w;

    public void setW(String w) {
        this.w = w;
    }

    public void setN(String n) {
        this.n = n;
    }

    public String getW() {
        return w;
    }

    public String getN() {
        return n;
    }

    @Override
    public String toString() {
        return "(" +n + " N, " + w + " W" + ")";
    }
}
