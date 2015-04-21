package methodreplacement;

/**
 * Created by Ufuk on 21-04-15.
 */
public abstract class Recorder {

    public abstract Voice generateVoice();

    public abstract void recordOnCassette(Voice voice);

    public abstract void recordOnCylinder(Voice voice);

}