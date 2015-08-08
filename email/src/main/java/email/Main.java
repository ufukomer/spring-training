package email;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Ufuk on 08-08-15.
 */
public class Main {

    public static void main(String[] args) {

        final ApplicationContext ctx =
                new ClassPathXmlApplicationContext("emailconf.xml");

        final MailService service = (MailService) ctx.getBean("mailService");
        service.sendPreConfiguredMail("QWERTYIOP");
        service.sendMail("ufukomer@hotmail.com", "First E-mail", "QWERTYIOP");
    }
}
