package loc.abondarev.petclinic.servlets;

import loc.abondarev.petclinic.models.UserExpl;
import org.apache.commons.lang.text.StrBuilder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author abondarev.
 * @since 30.10.2017.
 */
public class ClinicServlet extends HttpServlet {

    private List<UserExpl> users = new CopyOnWriteArrayList<UserExpl>();

    @Override
    protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.append("<!DOCTYPE html>")
              .append("<html>")
              .append("<head>")
              .append("    <title>Pet Web-clinic</title>")
              .append("</head>")
              .append("<body>")
              .append("    <form action='").append(req.getContextPath()).append("/' method='post'>")
              .append("        Name: <input type='text' name='name'>")
              .append("        <input type='submit' value='Submit'>")
              .append("    </form>")
              .append(this.typeUsers())
              .append("</body>")
              .append("</html>");
        writer.flush();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.users.add(new UserExpl(req.getParameter("name")));
        doGet(req, resp);
    }

    private String typeUsers() {
        StrBuilder builder = new StrBuilder();
        int i = 1;
        for (UserExpl user : this.users) {
            builder.append(String.format("User # %d: %s.\r\n", i++, user.getName()));
        }
        return builder.toString();
    }
}
