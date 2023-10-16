// your index number

//import libraries
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Email_Client {

    public static ArrayList<recipients> official_recipients_list = new ArrayList<>();
    public static ArrayList<Friends> friends_list = new ArrayList<>();
    public static ArrayList<EmailObject> email_objects = new ArrayList<>();


    public static void main(String[] args) throws IOException {

        ReadTextFile.CreateObjects("clientList.txt"); //Text file is read and recipient objects are created.
        SerializeDeserialize.deserialize(); //ser file is deserialized and email objects are added to array list.
        BirthdayGreeting.Greet_for_birthday(); //Greeting mails are sent to people who have their birthday.

        Scanner scanner = new Scanner(System.in);

        boolean run = true;
        while(run) {
            System.out.println("\nEnter option type: \n"
                    + "1 - Adding a new recipient\n"
                    + "2 - Sending an email\n"
                    + "3 - Printing out all the recipients who have birthdays\n"
                    + "4 - Printing out details of all the emails sent\n"
                    + "5 - Printing out the number of recipient objects in the application\n"
                    + "6 - Exit the application");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    // input format - Official: nimal,nimal@gmail.com,ceo
                    // Use a single input to get all the details of a recipient
                    // code to add a new recipient
                    // store details in clientList.txt file
                    // Hint: use methods for reading and writing files

                    System.out.println("Enter recipient details according to the below format\n"
                            + "For official recipients ---> official : <name>,<email>,<designation>\n"
                            + "For official friends ---> office_friends : <name>,<email>,<designation>,<birthday>\n"
                            + "For personal recipients ---> personal: <name>,<nick name>,<email>,<birthday>\n"
                    );

                    Scanner new_recipient = new Scanner(System.in);
                    String recipient_data = new_recipient.nextLine();

                    Recipients_file.adding_recipients(recipient_data); //adding recipient data to the text file.

                    recipient_creator.create(recipient_data); //creating recipient objects and adding to an array.

                    break;

                case 2:
                    // input format - email, subject, content
                    // code to send an email

                    Scanner email_address = new Scanner(System.in);
                    System.out.println("Enter the receiver's email.");
                    String email = email_address.nextLine(); //input receiver's email.

                    Scanner email_subject = new Scanner(System.in);
                    System.out.println("Enter the subject of the email.");
                    String subject = email_subject.nextLine(); //input the subject of email.

                    Scanner email_content = new Scanner(System.in);
                    System.out.println("Enter the content of the email.");
                    String content = email_content.nextLine(); //input content of email.

                    Email_Sender new_mail = new Email_Sender();
                    new_mail.SendEmail(email, subject, content); //sending email.

                    break;

                case 3:
                    // input format - yyyy/MM/dd (ex: 2018/09/17)
                    // code to print recipients who have birthdays on the given date

                    System.out.println("Enter the required date in following format.\nyyyy/MM/dd");

                    Scanner birthday_recipient = new Scanner(System.in);
                    String Birthday_Recipient = birthday_recipient.nextLine(); //input required date.

                    birthdayRecipients.Return_BirthdayRecipientName(Birthday_Recipient); //return who celebrates birthday.

                    break;

                case 4:
                    // input format - yyyy/MM/dd (ex: 2018/09/17)
                    // code to print the details of all the emails sent on the input date

                    System.out.println("Enter the required date in following format.\nyyyy/MM/dd:");

                    Scanner mail_sent_date = new Scanner(System.in);
                    String Mail_Sent_Date = mail_sent_date.nextLine(); //input required date.

                    EmailsSent.GetEmailsSent(Mail_Sent_Date); //return all the emails sent on that date.

                    break;



                case 5:
                    // code to print the number of recipient objects in the application

                    System.out.println("Recipient count in the application : "
                            + recipients.getCount()); //print number of recipients in the application
                    break;


                case 6:
                    SerializeDeserialize.serialize(Email_Client.email_objects); //serializing email objects array.
                    System.out.println("Thank you for using the application.");
                    run = false;
                    break;
            }
        }
    }
}
