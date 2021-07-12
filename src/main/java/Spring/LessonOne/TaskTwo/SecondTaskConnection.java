package Spring.LessonOne.TaskTwo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SecondTaskConnection {
    public static Connection getConnection(String databaseName) {
        String url = "jdbc://localhost:5432/" + databaseName;
        String userName = "postgres";
        String password = "shoxrux96";
        try {
            Connection connection = DriverManager.getConnection(url);
            return connection;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
}
