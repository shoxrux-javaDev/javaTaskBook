package PDP.groupPractice.ExtraTask.OptimalEmailAplication;

public class User {

    private String email;
    private String firstname;
    private String lastname;
    private String password;

    public User(String email, String firstname, String lastname, String password) {
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean checkEmail(String email) {
        return getEmail().equals(email);
    }

    public boolean checkPassword(String password) {
        return getPassword().equals(password);
    }

    public boolean isChangePassword(String current_password) {
        return getPassword().equals(current_password);
    }

    @Override
    public String toString() {
        return firstname + " " + lastname + " | " + email;
    }

}

