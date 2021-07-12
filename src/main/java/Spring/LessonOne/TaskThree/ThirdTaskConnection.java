package Spring.LessonOne.TaskThree;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ThirdTaskConnection {
    public static Connection getConnection(String name) {
        String url = "jdbc://localhost:5432/" + name;
        String userName = "postgres";
        String password = "shoxrux96";
        try {
            Connection conn = DriverManager.getConnection(url, userName, password);
            return conn;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
}
