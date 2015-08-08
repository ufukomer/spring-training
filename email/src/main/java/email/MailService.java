package email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Component;

/**
 * Created by Ufuk on 08-08-15.
 */
@Component("mailService")
public class MailService {

    @Autowired
    @Qualifier(value = "mailSender")
    private MailSender mailSender;

    @Autowired
    @Qualifier(value = "preConfiguredMessage")
    private SimpleMailMessage message;

    public void sendMail(final String to, final String
            subject, final String body) {
        final SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject(subject);
        message.setText(body);
        this.mailSender.send(message);
    }

    public void sendPreConfiguredMail(final String message) {
        final SimpleMailMessage mailMessage =
                new SimpleMailMessage(this.message);
        mailMessage.setText(message);
        this.mailSender.send(mailMessage);
    }
}
