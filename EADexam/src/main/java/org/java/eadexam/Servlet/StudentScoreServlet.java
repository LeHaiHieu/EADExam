package org.java.eadexam.Servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import org.java.eadexam.DAO.ScoreDAO;
import org.java.eadexam.DTO.StudentScoreDTO;
import org.java.eadexam.DatabaseConnection;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentScoreServlet extends HttpServlet {
    private ScoreDAO scoreDAO = new ScoreDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<StudentScoreDTO> studentScores = new ArrayList<>();
        String sql = """
            SELECT s.student_code, s.full_name, sub.subject_name, ss.score1, ss.score2
            FROM student_score_t ss
            JOIN student_t s ON ss.student_id = s.student_id
            JOIN subject_t sub ON ss.subject_id = sub.subject_id
            """;

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                String studentCode = rs.getString("student_code");
                String fullName = rs.getString("full_name");
                String subjectName = rs.getString("subject_name");
                double score1 = rs.getDouble("score1");
                double score2 = rs.getDouble("score2");

                double grade = scoreDAO.calculateGrade(score1, score2);
                String gradeLetter = scoreDAO.getGradeLetter(grade);

                StudentScoreDTO dto = new StudentScoreDTO(studentCode, fullName, subjectName, score1, score2, grade, gradeLetter);
                studentScores.add(dto);
            }

            request.setAttribute("studentScores", studentScores);
            RequestDispatcher dispatcher = request.getRequestDispatcher("studentScores.jsp");
            dispatcher.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

