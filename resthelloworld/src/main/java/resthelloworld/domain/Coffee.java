package resthelloworld.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Ufuk on 12-07-15.
 */
@XmlRootElement(name = "coffee")
public class Coffee {

    private String name;
    private boolean sugar;

    // Don't forget empty constructor otherwise it won't work.
    public Coffee() {
    }

    public Coffee(String name, boolean sugar) {
        this.name = name;
        this.sugar = sugar;
    }

    public boolean isSugar() {
        return sugar;
    }

    @XmlElement
    public void setSugar(boolean sugar) {
        this.sugar = sugar;
    }

    public String getName() {
        return name;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }
}
