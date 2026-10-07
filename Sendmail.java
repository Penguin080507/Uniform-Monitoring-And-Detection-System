
package MailSystem;

import java.util.*;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;



public class Sendmail {

 public boolean sendMailNow(String body, String subject, String to) {

        boolean flag = false;
        // SMTP configuration
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        Session session = Session.getDefaultInstance(props,
            new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(
                        "dataliked1@gmail.com",
                        "pgqh iqlt oidk izrk"
                    );
                }
            }
        );

        try {
            // Create message
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress("dataliked1@gmail.com"));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject(subject);

            // Create multipart email
            Multipart multipart = new MimeMultipart();

            // Part 1: message text
            MimeBodyPart textBodyPart = new MimeBodyPart();
            textBodyPart.setText(body);
            multipart.addBodyPart(textBodyPart);

            // Part 2: file attachment
            

            // Set content
            message.setContent(multipart);

            // Send mail
            Transport.send(message);

            System.out.println("Email with attachment sent successfully!");
            flag = true;
        } catch (MessagingException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return flag;
    }
}
