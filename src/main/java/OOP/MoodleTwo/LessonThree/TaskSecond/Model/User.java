package OOP.MoodleTwo.LessonThree.TaskSecond.Model;

/*        Model package ini ichida quyidagicha atributlari bor bo’lgan User klassini yarating:
        id,  username(public), email(public), password(private),  name, address.
        Parolni o’zgartiradigan changePassword methodini yarating.
        Bunda eski parol kiritiladi agar u to’g’ri bo’lsa yangi parol kiritish mumkin bo’lsin.*/

public class User {
    int id;
    public String userName;
    public String email;
    private String password;
    String name;
    String adress;

    public User(int id, String email, String userName, String password, String name, String adress) {
        this.id = id;
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.adress = adress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String newPassword) {
        this.password=newPassword;
    }

    public boolean changePassword(String curentPassword) {
        return this.password.equals(curentPassword);
    }

    public boolean chekPassword(String firstPasword) {
        return this.password.equals(firstPasword);
    }

    public boolean checkLogin(String login) {
        return this.userName.equals(login);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
