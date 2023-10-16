import java.io.Serializable;

public class EmailObject implements Serializable {
    private final String date;
    private final String email;
    private final String subject;
    private final String content;

    public EmailObject(String date_today, String email, String subject, String content) {
        this.date = date_today;
        this.email = email;
        this.subject = subject;
        this.content = content;

    }

    public String getDate() {
        return date;
    }

    public String getReceiver_email() {
        return email;
    }

    public String getSubject() {
        return subject;
    }

    public String getContent() {
        return content;
    }
}
