public class recipient_creator{

     public static void create(String detail){

          try{
               String[] details = detail.split(": ");
               String[] state = details[1].split(",");

               if (detail.startsWith("official")){
                    official_recipients recipient1 = new official_recipients(state);
                    Email_Client.official_recipients_list.add(recipient1); //adding to official recipients objects list

               }

               else if (detail.startsWith("office_friend")) {
                    official_friends recipient2 = new official_friends(state);
                    Email_Client.friends_list.add(recipient2); //adding to friend list.

               }

               else if (detail.startsWith("personal")) {
                    personal_recipients recipient3 = new personal_recipients(state);
                    Email_Client.friends_list.add(recipient3); //adding to friend list.

               }
          }

           catch (ArrayIndexOutOfBoundsException exception) {
               System.out.println("Invalid Input");
          }


     }

}
