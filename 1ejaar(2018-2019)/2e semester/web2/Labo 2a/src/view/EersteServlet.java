package view;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

@WebServlet("/DynamischePagina")
public class EersteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {//aanvraag op webpagina
        PrintWriter out = response.getWriter();
        Random random = new Random();//random
        out.println("<!DOCTYPE html>");//aanmaken van html in de java server, ineficient
        out.println("<html>");
        out.println("<p>");
        out.println("the animal crackers are illusions");
        out.println("</p>");
        out.println("<a id=\"home\" href=\"index.jsp\">Klik Hier</a>");
        out.println("<p id=\"dynamisch\">");
        out.println(random.nextLong());
        out.println("</p>");
        out.println("</html>");

    }
}
