package org.java.eadexam.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student_score_t")
public class StudentScore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentScoreId;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "subject_id", nullable = false)
    private Subject subject;

    @Column(name = "score1", nullable = false)
    private double score1;

    @Column(name = "score2", nullable = false)
    private double score2;

    // Calculate grade
    public String getGrade() {
        double grade = 0.3 * score1 + 0.7 * score2;
        if (grade >= 8.0) return "A";
        else if (grade >= 6.0) return "B";
        else if (grade >= 4.0) return "D";
        else return "F";
    }
    // Getters and Setters
    public int getStudentScoreId() {
        return studentScoreId;
    }
    public void setStudentScoreId(int studentScoreId) {
        this.studentScoreId = studentScoreId;
    }
    public Student getStudent() {
        return student;
    }
    public void setStudent(Student student) {
        this.student = student;
    }
    public Subject getSubject() {
        return subject;
    }
    public void setSubject(Subject subject) {
        this.subject = subject;
    }
    public double getScore1() {
        return score1;
    }
    public void setScore1(double score1) {
        this.score1 = score1;
    }
    public double getScore2() {
        return score2;
    }
    public void setScore2(double score2) {
        this.score2 = score2;
    }
}

