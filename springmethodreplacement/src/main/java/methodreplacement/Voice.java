package methodreplacement;

import java.util.UUID;

/**
 * Created by Ufuk on 21-04-15.
 */
public class Voice {

    private final UUID id;

    public Voice() {
        // Generates random ID for each voice object
        this.id = UUID.randomUUID();
    }

    @Override
    public String toString() {
        return this.id.toString();
    }

}