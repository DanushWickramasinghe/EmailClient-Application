public class personal_recipients extends Friends{

    public final String nick_name;

    public personal_recipients(String[] arr) {
        super(arr[0], arr[2], arr[3]);
        this.nick_name = arr[1];
    }

    public String getNick_name(){
        return nick_name;
    }
}
