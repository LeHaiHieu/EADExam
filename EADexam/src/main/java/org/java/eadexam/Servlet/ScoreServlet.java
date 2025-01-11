package org.java.eadexam.Servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import org.java.eadexam.DAO.ScoreDAO;

import java.io.IOException;

public class ScoreServlet extends HttpServlet {
    private ScoreDAO scoreDAO = new ScoreDAO();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int studentId = Integer.parseInt(request.getParameter("studentId"));
        int subjectId = Integer.parseInt(request.getParameter("subjectId"));
        double score1 = Double.parseDouble(request.getParameter("score1"));
        double score2 = Double.parseDouble(request.getParameter("score2"));

        scoreDAO.addScore(studentId, subjectId, score1, score2);
        response.sendRedirect("success.jsp");
    }
}

