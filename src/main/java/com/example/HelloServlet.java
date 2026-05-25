package com.example;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        var out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1>Hello from java-war!</h1>");
        out.println("<p>Deployed via Docker + Tomcat.</p>");
        out.println("</body></html>");
    }
}
