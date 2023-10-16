abstract class recipients {
    private final String name;
    private final String email;
    static int count = 0;

    public recipients(String name, String email) {
        this.name = name;
        this.email = email;
        count++;
    }
    public String getEmail() {

        return email;
    }
    public String getName() {

        return name;
    }
    public static int getCount() {

        return count;
    }
}