package methodreplacement;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Ufuk on 21-04-15.
 */
public class MethodReplacementTest {
    @Test
    public void method_replacement_test() {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("methodreplacement.xml");
        Recorder recorder = applicationContext.getBean("recorder", Recorder.class);

        Voice voice = recorder.generateVoice();
        System.out.println("Voice generated with ID: " + voice);

        recorder.recordOnCylinder(voice);
        recorder.recordOnCassette(voice);
    }
}
