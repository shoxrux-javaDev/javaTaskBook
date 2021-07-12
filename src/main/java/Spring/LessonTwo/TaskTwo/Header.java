package Spring.LessonTwo.TaskTwo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Header extends HttpServlet {




    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String servletPath = req.getServletPath();

        Connection connection = ComputerDb.getConnection("compshop");
        try {
            switch (servletPath) {
                case "/pc":

                    PreparedStatement prepare = connection.prepareStatement("select pr.maker,pc.model,pc.price,pr.type" +
                            " from product pr join pc using(model)");
                    ResultSet resultSet = prepare.executeQuery();
                    while (resultSet.next()) {
                        String maker = resultSet.getString("maker");
                        String model = resultSet.getString("model");
                        int price = resultSet.getInt("price");
                        String type = resultSet.getString("type");
                        System.out.println(maker + "      " + model + "       " + price + "        " + type);
                    }
                    break;
                case "/laptop":
                    PreparedStatement prepareTwo = connection.prepareStatement("select pr.maker,l.model,l.price,pr.type" +
                            " from product pr join laptop l using(model)");
                    ResultSet resultSetOne = prepareTwo.executeQuery();
                    while (resultSetOne.next()) {
                        String maker = resultSetOne.getString("maker");
                        String model = resultSetOne.getString("model");
                        int price = resultSetOne.getInt("price");
                        String type = resultSetOne.getString("type");
                        System.out.println(maker + "          " + model + "          " + price + "         " + type);
                    }
                    break;
                case "/printer":
                    PreparedStatement prepareThree = connection.prepareStatement("select pr.maker,p.model,p.price,pr.type" +
                            " from product pr join printer p using(model)");
                    ResultSet resultSetThree = prepareThree.executeQuery();
                    while (resultSetThree.next()) {
                        String maker = resultSetThree.getString("maker");
                        String model = resultSetThree.getString("model");
                        int price = resultSetThree.getInt("price");
                        String type = resultSetThree.getString("type");
                        System.out.println(maker + "  " + model + "   " + price + "           " + type);
                    }
                    break;
                default:
                    System.out.println("1-3 gacha bo'lgansonni kritmadingiz!");
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pc = req.getParameter("pc");
        String laptop = req.getParameter("laptop");
        String printer = req.getParameter("printer");
        PrintWriter writer = resp.getWriter();

        PreparedStatement prep = null;

            /*switch (pc.equals("pc")&&laptop.equals("")) {
                case 1:
                    PreparedStatement prepare = connection.prepareStatement("select pr.maker,pc.model,pc.price,pr.type" +
                            " from product pr join pc using(model)");
                    ResultSet resultSet = prepare.executeQuery();
                    while (resultSet.next()) {
                        String maker = resultSet.getString("maker");
                        String model = resultSet.getString("model");
                        int price = resultSet.getInt("price");
                        String type = resultSet.getString("type");
                        System.out.println(maker + "      " + model + "       " + price + "        " + type);
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
                        System.out.println(maker + "          " + model + "          " + price + "         " + type);
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
                        System.out.println(maker + "  " + model + "   " + price + "           " + type);
                    }
                    break;
                default:
                    System.out.println("1-3 gacha bo'lgansonni kritmadingiz!");*//*
            }*/

    }
}





