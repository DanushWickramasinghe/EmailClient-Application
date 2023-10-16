public class Friends extends recipients{

    private String birthday;

    public Friends(String name, String email, String birthday) {
        super(name, email);
        this.birthday = birthday;

    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
