package Spring.LessonOne.TaskThree;

import Spring.LessonOne.test.ConnectionDb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ThirdTask {
    public static Connection connection = ConnectionDb.getConnection("compshop");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1-3 gacha bo'lgan sonni kriting va kerakli ma'lumotni qo'lga kriting: ");
        int num = scanner.nextInt();
        System.out.println("Maker   Model    price   type");
        try {
            switch (num) {
                case 1:
                    PreparedStatement prepare = connection.prepareStatement("select pr.maker,pc.model,pc.price,pr.type" +
                            " from product pr join pc using(model)");
                    ResultSet resultSet = prepare.executeQuery();
                    while (resultSet.next()) {
                        String maker = resultSet.getString("maker");
                        String model = resultSet.getString("model");
                        int price = resultSet.getInt("price");
                        String type = resultSet.getString("type");
                        System.out.println(maker + "      " + model + "       " + price+"        "+type);
                    }
                    break;
                case 2:
                    PreparedStatement prepareTwo = connection.prepareStatement("select pr.maker,l.model,l.price,pr.type" +
                            " from product pr join laptop l using(model)");
                    ResultSet resultSetOne = prepareTwo.executeQuery();
                    while (resultSetOne.next()) {
                        String maker = resultSetOne.getString("maker");
                        String model = resultSetOne.getString("model");
                        int price = resultSetOne.getInt("price");
                        String type = resultSetOne.getString("type");
                        System.out.println(maker + "          " + model + "          " + price+"         "+type);
                    }
                    break;
                case 3:
                    PreparedStatement prepareThree = connection.prepareStatement("select pr.maker,p.model,p.price,pr.type" +
                            " from product pr join printer p using(model)");
                    ResultSet resultSetThree = prepareThree.executeQuery();
                    while (resultSetThree.next()) {
                        String maker = resultSetThree.getString("maker");
                        String model = resultSetThree.getString("model");
                        int price = resultSetThree.getInt("price");
                        String type = resultSetThree.getString("type");
                        System.out.println(maker + "  " + model + "   " + price+"           "+type);
                    }
                    break;
                default:
                    System.out.println("1-3 gacha bo'lgansonni kritmadingiz!");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
