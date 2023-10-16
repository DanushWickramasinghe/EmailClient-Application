import java.util.Objects;

public class birthdayRecipients {

    public static void Return_BirthdayRecipientName(String birthDate){

        int j = 0;
        for(Friends friend: Email_Client.friends_list) {
            if (Objects.equals(birthDate.substring(4), friend.getBirthday().substring(4))) {
                System.out.println(friend.getName() + "\n\n" + "Names of birthday recipients returned successfully.\n\n");
                j += 1;
            }
        }

        if(j==0){
            System.out.println("\nNo birthdays on that day.\n\n");
        }
    }
}
