package org.java.eadexam;

import jakarta.annotation.Resource;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    @Resource(name = "jdbc/studentDB")
    private DataSource dataSource;

    public void exampleMethod() throws SQLException {
        // Get a connection from the DataSource
        try (Connection conn = dataSource.getConnection()) {
            // Perform database operations within this block
            Statement statement = conn.createStatement();
            // e.g., conn.prepareStatement(...), conn.createStatement(), etc.
        }
    }
}

