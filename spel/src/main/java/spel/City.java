package spel;

/**
 * Created by Ufuk on 08-05-15.
 */
public class City {

    public static final String CITY = "Ankara";

    private String name;
    private Country country;
    private boolean isCapitol;
    private int temperature;

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public boolean isCapitol() {
        return isCapitol;
    }

    public void setIsCapitol(boolean isCapitol) {
        this.isCapitol = isCapitol;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public Country getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return name + (isCapitol ? " is the capitol city of " : " is the city of ") + country;
    }
}
