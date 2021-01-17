package webapp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/docs.do")
public class DocServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        PrintWriter out = httpServletResponse.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Docs for Todolist App</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("Documentation are still under progress!!!");
        out.println("</body>");
        out.println("</html>");
    }
}
