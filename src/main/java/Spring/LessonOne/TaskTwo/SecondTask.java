package Spring.LessonOne.TaskTwo;

import Spring.LessonOne.test.ConnectionDb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SecondTask {
    public static Connection connection = ConnectionDb.getConnection("compshop");

    public static void main(String[] args) {
        System.out.println("maker     model       price         type");
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select pr.maker,pr.type,pc.model,pc.price" +
                    " from product pr join pc using(model)  union select pr.maker,pr.type,l.model,l.price " +
                    "from product pr join laptop l using(model) union select pr.maker,pr.type,p.model,p.price " +
                    "from product pr join printer p using(model) ORDER BY price,type DESC");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String maker = resultSet.getString("maker");
                String model = resultSet.getString("model");
                String price = resultSet.getString("price");
                String type = resultSet.getString("type");
                System.out.println(maker + "         " + model + "        " + price + "        " + type);
            }
            connection.close();
            preparedStatement.close();
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
    }
}
