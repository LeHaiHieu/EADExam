package org.java.eadexam.Servlet;

import jakarta.annotation.Resource;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

@WebServlet("/students")
public class StudentServlet extends HttpServlet {

    @Resource(name = "jdbc/studentDB")
    private DataSource dataSource;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        try (PrintWriter out = response.getWriter()) {
            out.println("<html><body>");
            out.println("<h1>Student Data</h1>");

            try (Connection conn = dataSource.getConnection()) {
                String sql = "SELECT * FROM students";
                try (Statement stmt = conn.createStatement();
                     ResultSet rs = stmt.executeQuery(sql)) {
                    out.println("<table border='1'><tr><th>ID</th><th>Name</th></tr>");
                    while (rs.next()) {
                        out.println("<tr><td>" + rs.getInt("id") + "</td><td>" + rs.getString("name") + "</td></tr>");
                    }
                    out.println("</table>");
                }
            } catch (SQLException e) {
                throw new ServletException(e);
            }
            out.println("</body></html>");
        }
    }
}


