package danieldrzazga.com.github.weedingplaner.service;

import javax.mail.MessagingException;

/**
 * Created by "Daniel Drzazga" on 25.03.2020
 */
public interface MailService {

    void sendMail(String to, String subject, String text, boolean isHtmlContent) throws MessagingException;

}
