package Spring.LessonOne.TaskOne;

import Spring.LessonOne.test.ConnectionDb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FirstTask {
    public static Connection connection = ConnectionDb.getConnection("compshop");

    public static void main(String[] args) {
        System.out.println("maker  model   type\n-----  -----  ----");
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from product");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String maker = resultSet.getString("maker");
                String model = resultSet.getString("model");
                String type = resultSet.getString("type");
                System.out.println(maker + "      " + model + "     " + type);
            }
            connection.close();
            preparedStatement.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
