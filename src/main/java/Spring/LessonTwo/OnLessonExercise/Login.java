package Spring.LessonTwo.OnLessonExercise;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Login extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("Login.html");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        PrintWriter writer = resp.getWriter();
        if (username.equals("Shoxrux") && password.equals("asd123")) {
            writer.write("<h1> Successfully! " + username + "</h1>");
        } else {
            writer.write("<h1> Uzur login yoki parol noto'g'ri kritildi! </h1>");
        }
        writer.write("<a href= '/logout'>Logout</a>");

    }
}
