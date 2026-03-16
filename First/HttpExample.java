package First;

import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/mitprofile")
public class HttpExample extends HttpServlet{

    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, java.io.IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>MIT AOE Profile</title>");

        out.println("<style>");

        // Body
        out.println("body{margin:0;font-family:Arial;background:black;color:white;}");

        // Header
        out.println(".header{background:white;color:black;padding:25px;text-align:center;font-size:30px;font-weight:bold;}");

        // Section
        out.println(".section{padding:40px;text-align:center;border-bottom:1px solid white;}");

        // Cards
        out.println(".cards{display:flex;justify-content:center;gap:20px;margin-top:20px;}");
        out.println(".card{background:white;color:black;padding:20px;border-radius:10px;width:200px;box-shadow:0 5px 15px gray;}");

        // Button
        out.println(".btn{margin-top:20px;padding:10px 20px;border:none;background:white;color:black;border-radius:20px;cursor:pointer;}");
        out.println(".btn:hover{background:gray;color:white;}");

        out.println("</style>");
        out.println("</head>");

        out.println("<body>");

        // Header
        out.println("<div class='header'>MIT Academy of Engineering</div>");

        // About Section
        out.println("<div class='section'>");
        out.println("<h2>About MIT AOE</h2>");
        out.println("<p>MIT Academy of Engineering (MIT AOE), Alandi Pune is known for innovation, research and industry oriented education.</p>");
        out.println("</div>");

        // Programs Section
        out.println("<div class='section'>");
        out.println("<h2>Programs Offered</h2>");
        out.println("<div class='cards'>");

        out.println("<div class='card'>Computer Engineering</div>");
        out.println("<div class='card'>AI & Data Science</div>");
        out.println("<div class='card'>Mechanical Engineering</div>");
        out.println("<div class='card'>Electronics Engineering</div>");

        out.println("</div>");
        out.println("</div>");

        // Campus Section
        out.println("<div class='section'>");
        out.println("<h2>Campus Life</h2>");
        out.println("<p>Modern labs, innovation centers, clubs, hackathons and entrepreneurship activities.</p>");
        out.println("<button class='btn'>Explore Campus</button>");
        out.println("</div>");

        // Contact Section
        out.println("<div class='section'>");
        out.println("<h2>Contact</h2>");
        out.println("<p>Alandi, Pune, Maharashtra</p>");
        out.println("<p>Email: info@mitaoe.ac.in</p>");
        out.println("</div>");

        out.println("</body>");
        out.println("</html>");
    }
}