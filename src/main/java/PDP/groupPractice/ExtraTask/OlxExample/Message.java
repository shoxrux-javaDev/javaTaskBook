package PDP.groupPractice.ExtraTask.OlxExample;

public class Message {
    private int id;
    private String title;
    private String body;
    private User sender;
    Announcement announcement;
    private boolean status;


    public Message(int id, String title, String body, User sender, Announcement announcement, boolean status) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.sender = sender;
        this.announcement = announcement;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public Announcement getAnnouncement() {
        return announcement;
    }

    public void setAnnouncement(Announcement announcement) {
        this.announcement = announcement;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    private String getStatus() {
        if (isStatus())
            return "unread";
            return "read";
    }

    @Override
    public String toString() {
        return "Subject: " + title.toUpperCase() + " | Message: '" + body + "' | Sender: " + sender.getName()
               + " | status: " + getStatus();
    }
}
