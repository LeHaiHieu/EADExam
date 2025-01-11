package org.java.eadexam.DAO;

import org.java.eadexam.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ScoreDAO {
    public void addScore(int studentId, int subjectId, double score1, double score2) {
        String sql = "INSERT INTO student_score_t (student_id, subject_id, score1, score2) VALUES (?, ?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, studentId);
            stmt.setInt(2, subjectId);
            stmt.setDouble(3, score1);
            stmt.setDouble(4, score2);

            stmt.executeUpdate();
            System.out.println("Score added successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public double calculateGrade(double score1, double score2) {
        return 0.3 * score1 + 0.7 * score2;
    }

    public String getGradeLetter(double grade) {
        if (grade >= 8.0) return "A";
        if (grade >= 6.0) return "B";
        if (grade >= 4.0) return "D";
        return "F";
    }
}

