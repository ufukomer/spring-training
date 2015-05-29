package constants;

import java.io.*;
import java.util.Random;

/**
 * <p>This class has convenient methods to make things easier for developer.</p>
 */
public final class Constants {

    /**
     * This method prevents even the native class from calling this constructor as well.
     */
    private Constants() {
        throw new AssertionError();
    }

    /**
     * <p>Generally using for getting class name for logging. Simple usage:</p>
     * <code>Constants.TAG(this)</code>
     *
     * @param context refers to the current object.
     * @return <code>context.getClass().getName()</code>
     */
    public static String TAG(Object context) {
        return context.getClass().getSimpleName();
    }

    /**
     * Chooses a random word within 349900-word dictionary.
     *
     * @return the word generated from dictionary.
     */
    public static String generateRandomWord() {

        String word = null;
        BufferedReader br = null;
        InputStream is = null;
        int random = new Random().nextInt(349900);

        try {
            int i = 0;
            is = ClassLoader.getSystemResourceAsStream("dictionary.txt");
            br = new BufferedReader(new InputStreamReader(is));

            do {
                word = br.readLine();
                i++;
            } while (i != random);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) br.close();
                if (is != null) is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return word;
    }
}
