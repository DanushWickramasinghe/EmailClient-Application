import java.io.*;
import java.util.ArrayList;

public class SerializeDeserialize {

    public static void serialize(ArrayList<EmailObject> mail_objects) { //serialize array list of mail objects
        try(FileOutputStream output = new FileOutputStream("input.ser");
            ObjectOutputStream out = new ObjectOutputStream(output);)
        {
            out.writeObject(mail_objects);
        }
        catch (IOException ioException){
            ioException.printStackTrace();
            System.out.println("Cannot serialize, Try again.");
        }
    }


    public static void deserialize() { //deserialize array list of mail objects
        try (FileInputStream input = new FileInputStream("input.ser");
             ObjectInputStream in = new ObjectInputStream(input);)
        {
            ArrayList<EmailObject> deserialized_mail_objects = (ArrayList<EmailObject>) in.readObject();
            Email_Client.email_objects.addAll(deserialized_mail_objects);

            System.out.println("\nEmail objects arraylist deserialized successfully...\n");
        }

        catch (IOException ioException) {
            System.out.println("Cannot deserialize, Try again.");
        }

        catch (ClassNotFoundException classNotFoundException) {
            System.out.println("Something went wrong");
        }
    }
}
