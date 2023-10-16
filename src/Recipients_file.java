import java.io.FileWriter;
import java.io.IOException;

public class Recipients_file {

    public static void adding_recipients(String x) {
        try {
            FileWriter recipients_file = new FileWriter("clientList.txt", true);

            recipients_file.write("\n" + x);
            recipients_file.close();
        }

        catch (IOException e) {
            System.out.println("There is an error.");
        }
    }
}
