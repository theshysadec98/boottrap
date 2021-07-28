import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/hello"})
public class loginJSP extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("username");
        String password = request.getParameter("password");
        PrintWriter writer = response.getWriter();

        writer.println("<html>");
        if(user.equals("admin") && password.equals("admin")){
            writer.println("<h1> Hello mai pho ren "+ user +"</h1>" );
        }
        else{
            writer.println("<h1> Login Error. </h1>");
        }

        writer.println("</html>");
    }
}
