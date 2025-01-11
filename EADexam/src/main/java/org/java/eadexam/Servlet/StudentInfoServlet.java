package org.java.eadexam.Servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import org.java.eadexam.DatabaseConnection;
import org.java.eadexam.entity.Student;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentInfoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Student> students = new ArrayList<>();
        String sql = "SELECT * FROM student_t";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Student student = new Student();
                student.setStudentId(rs.getInt("student_id"));
                student.setStudentCode(rs.getString("student_code"));
                student.setFullName(rs.getString("full_name"));
                student.setAddress(rs.getString("address"));
                students.add(student);
            }

            request.setAttribute("students", students);
            RequestDispatcher dispatcher = request.getRequestDispatcher("studentInfo.jsp");
            dispatcher.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

