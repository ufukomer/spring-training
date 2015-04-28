package methodreplacement;

/**
 * Created by Ufuk on 21-04-15.
 */
public abstract class Recorder {

    // Method injection
    public abstract Voice generateVoice();

    // Method replacement
    public abstract void recordOnCassette(Voice voice);

    // Method replacement
    public abstract void recordOnCylinder(Voice voice);
}