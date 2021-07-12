package Spring.LessonOne.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectTest {
    public static Connection connection = ConnectionDb.getConnection("dvdrental");

    public static void main(String[] args) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select title,release_year from film");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String first = resultSet.getString("title");
                int last = resultSet.getInt("release_year");

                System.out.println("film nomi:" + first + " ishlangan yili: " + last);
            }
            connection.close();
            preparedStatement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
