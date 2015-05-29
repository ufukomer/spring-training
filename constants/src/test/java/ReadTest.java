import constants.Constants;
import org.junit.Test;

/**
 * Created by Ufuk on 29-05-15.
 */
public class ReadTest {
    @Test
    public void read_test() {
        String word = Constants.generateRandomWord();
        System.out.println(word);
    }
}
