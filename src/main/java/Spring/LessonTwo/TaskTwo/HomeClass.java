package Spring.LessonTwo.TaskTwo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HomeClass extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer=resp.getWriter();
        writer.write("<h1>Bo'limni tanlang</h1><br/>");
        writer.write("<a href = '/pc'>pc</a><br/>");
        writer.write("<a href = '/laptop'>laptop</a><br/>");
        writer.write("<a href = '/printer'>printer</a>");
    }
}
