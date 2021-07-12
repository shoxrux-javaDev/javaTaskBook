package Spring.LessonOne.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDb {
    public static Connection getConnection(String database) {
        String url = "jdbc:postgresql://localhost:5432/" + database;
        String username = "postgres";
        String password = "shoxrux96";
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            return connection;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
}
