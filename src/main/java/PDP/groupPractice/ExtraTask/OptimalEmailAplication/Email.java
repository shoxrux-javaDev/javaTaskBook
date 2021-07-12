package PDP.groupPractice.ExtraTask.OptimalEmailAplication;

public class Email {

    private String subject;
    private String message;
    private User sender; // jo'natuvchi
    private User receiver; // qabul qiluvchi
    private boolean status; // true - unread; false - read;

    public Email(String subject, String message, User sender, User receiver, boolean status) {
        this.subject = subject;
        this.message = message;
        this.sender = sender;
        this.receiver = receiver;
        this.status = status;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    private String getStatus() {
        if (isStatus())
            return "UNREAD";
        return "READ";
    }

    @Override
    public String toString() {
        return "Subject: " + subject.toUpperCase() + " | Message: '" + message + "' | Sender: " + sender
                + " | status: " + getStatus();
    }
}

