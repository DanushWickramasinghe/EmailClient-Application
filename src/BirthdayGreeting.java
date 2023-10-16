import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class BirthdayGreeting {
    static LocalDate today = LocalDate.now();
    static String date_today = today.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));

    public static void Greet_for_birthday() {

        for(Friends friend: Email_Client.friends_list) {

            if (Objects.equals(date_today.substring(4),
                   friend.getBirthday().substring(4))) {

                boolean condition = true;
                for(EmailObject obj : Email_Client.email_objects){
                    if(Objects.equals(obj.getReceiver_email(),
                            friend.getEmail()) && Objects.equals(obj.getDate(), date_today)){
                        condition = false;
                        System.out.println("Birthday email already sent.");
                        break;
                    }
                }

                if(condition){

                    String cls = friend.getClass().getName();

                    if (cls.equals("personal_recipients")){
                        Email_Sender greet_mail = new Email_Sender();
                        greet_mail.SendEmail(friend.getEmail(),
                                "Happy Birthday !", "Hugs and love on your birthday!.Danush");
                    }

                    else{
                        Email_Sender greet_mail = new Email_Sender();
                        greet_mail.SendEmail(friend.getEmail(),
                                "Happy Birthday !", "Wish you a Happy birthday!.Danush");
                    }
                }


            }

        }

    }

}
