import java.sql.SQLOutput;

public class official_recipients extends recipients{

    public String designation;

    public official_recipients(String[] arr) {

        super(arr[0], arr[1]);
        this.designation = arr[2];

    }
    public String getDesignation() {
        return designation;
    }
}
