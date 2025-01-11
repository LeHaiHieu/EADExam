package org.java.eadexam.DAO;

import org.java.eadexam.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentDAO {
    public void addStudent(String studentCode, String fullName, String address) {
        String sql = "INSERT INTO student_t (student_code, full_name, address) VALUES (?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, studentCode);
            stmt.setString(2, fullName);
            stmt.setString(3, address);

            stmt.executeUpdate();
            System.out.println("Student added successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

