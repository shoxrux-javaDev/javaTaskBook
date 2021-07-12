package PDP.groupPractice.ExtraTask.Ticket;

public class User {
    private String name;
    private final String surName;
    private final String Email;
    private String password;
    private final String login;
    private final int id;

    public User(String name, String surName, String email, String password, String login, int id) {
        this.name = name;
        this.surName = surName;
        this.Email = email;
        this.password = password;
        this.login = login;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public String getEmail() {
        return Email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean checkLogin(String log) {
        return this.login.equals(log);
    }

    public boolean checkPassword(String pass) {
        return this.password.equals(pass);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", Email='" + Email + '\'' +
                ", password='" + password + '\'' +
                ", login='" + login + '\'' +
                ", id=" + id +
                '}';
    }
}
