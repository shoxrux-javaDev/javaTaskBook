package PDP.groupPractice.ExtraTask.OlxExample;

public class Announcement {
    private int id;
    private String title;
    private String body;
    private int cost;
    User user;
    SubCategory subCategory;
    private boolean status;

    public Announcement(int id, String title, String body, int cost, User user, SubCategory subCategory) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.cost = cost;
        this.user = user;
        this.subCategory = subCategory;
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

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public SubCategory getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(SubCategory subCategory) {
        this.subCategory = subCategory;
    }

    @Override
    public String toString() {
        return this.user.getName()+"  |  "+this.user.getDistrict().getName()+","+
               this.user.getDistrict().getRegion().getName()+"  |  "+this.title+"  |  "+this.body+"  |  cost: "+this.cost+"$";
    }
}
