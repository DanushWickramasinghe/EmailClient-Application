import java.util.Objects;

public class EmailsSent {
    public static void GetEmailsSent(String given_date){
        for (EmailObject obj: Email_Client.email_objects) {
            if (Objects.equals(given_date, obj.getDate())) {
                System.out.println("Date            :" + obj.getDate() + "\n" + "Recipient email :" + obj.getReceiver_email() + "\n"
                        + "Subject         :" + obj.getSubject() + "\n" + "Email body      :" +  obj.getContent() + " \n");
            }
        }
    }
}
