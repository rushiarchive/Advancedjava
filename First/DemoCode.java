package First;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/DemoCode")
public class DemoCode extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public DemoCode() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {

        response.setContentType("text/html");

        response.getWriter().println("<h2>Servlet is Working!</h2>");
        
        response.getWriter().println("Served at: " + request.getContextPath());
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {

        doGet(request, response);
    }
}