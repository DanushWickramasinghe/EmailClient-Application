import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {
    public static void CreateObjects(String line) throws IOException {

        FileReader TextFile = new FileReader(line);
        BufferedReader ReadTextFile = new BufferedReader(TextFile);

        String str;

        while((str = ReadTextFile.readLine())!=null){
            recipient_creator.create(str);
        }
        ReadTextFile.close();
    }
}
