package Spring.LessonOne.TaskOne;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FirstTaskConnection {

    public static Connection getConnection(String databaseName) {
        String url = "jdbc:postgresql://localhost:5432/"+databaseName;
        String username = "postgres";
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
