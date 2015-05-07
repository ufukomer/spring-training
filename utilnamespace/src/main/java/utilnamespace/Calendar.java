package utilnamespace;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Ufuk on 06-05-15.
 */
public class Calendar {

    private int currentYear;
    private Day currentDay;
    private String type;
    private String name;

    private ArrayList<String> months;
    // Unused declarations, for showing the usage of util:map and util:set
    private Map<String, String> monthMap;
    private Set<String> monthSet;

    public void setMonths(ArrayList<String> months) {
        this.months = months;
    }

    public ArrayList<String> getMonths() {
        return months;
    }

    // get method is required for util:property-path tag
    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCurrentDay(Day currentDay) {
        this.currentDay = currentDay;
    }

    public void setCurrentYear(int currentYear) {
        this.currentYear = currentYear;
    }

    @Override
    public String toString() {
        return name + ": " + currentDay + " " + currentYear + ", " + type;
    }
}