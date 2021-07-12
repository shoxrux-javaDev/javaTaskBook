package Spring.LessonTwo.TaskTwo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ComputerDb {
    public static Connection getConnection(String databaseName) {
        String url = "jdbc:postgresql://localhost:5432/" + databaseName;
        String username = "postgres";
        String password = "shoxrux96";

        try {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection(url, username, password);
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
}
