import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Properties;

public class Email_Sender {

        public static void SendEmail(String email, String subject, String content) {

            final String username = "danush200712m@gmail.com";
            final String password = "acjkrvwpefyjfjpa";

            Properties prop = new Properties();
            prop.put("mail.smtp.host", "smtp.gmail.com");
            prop.put("mail.smtp.port", "587");
            prop.put("mail.smtp.auth", "true");
            prop.put("mail.smtp.starttls.enable", "true"); //TLS

            Session session = Session.getInstance(prop,
                    new javax.mail.Authenticator() {
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication(username, password);
                        }
                    });

            try {

                Message message = new MimeMessage(session);
                message.setFrom(new InternetAddress("danush200712m@gmail.com"));
                message.setRecipients(
                        Message.RecipientType.TO,
                        InternetAddress.parse(email)
                );
                message.setSubject(subject);
                message.setText(content);

                Transport.send(message);

                LocalDate today = LocalDate.now();
                String date_today = today.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));

                EmailObject new_email_object = new EmailObject(date_today,email,subject,content);
                Email_Client.email_objects.add(new_email_object); //Adding email object to arraylist of email objects.

                System.out.println("Email sent successfully.");

            } catch (MessagingException e) {
                e.printStackTrace();
            }
        }

    }

