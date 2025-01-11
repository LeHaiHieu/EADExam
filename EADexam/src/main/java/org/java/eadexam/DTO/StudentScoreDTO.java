package org.java.eadexam.DTO;

public class StudentScoreDTO {
    private String studentCode;
    private String fullName;
    private String subjectName;
    private double score1;
    private double score2;
    private double grade;
    private String gradeLetter;

    public StudentScoreDTO(String studentCode, String fullName, String subjectName, double score1, double score2, double grade, String gradeLetter) {
        this.studentCode = studentCode;
        this.fullName = fullName;
        this.subjectName = subjectName;
        this.score1 = score1;
        this.score2 = score2;
        this.grade = grade;
        this.gradeLetter = gradeLetter;
    }
    // Getters and Setters
    public String getStudentCode() {
        return studentCode;
    }
    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getSubjectName() {
        return subjectName;
    }
    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
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
    public double getGrade() {
        return grade;
    }
    public void setGrade(double grade) {
        this.grade = grade;
    }
    public String getGradeLetter() {
        return gradeLetter;
    }
    public void setGradeLetter(String gradeLetter) {
        this.gradeLetter = gradeLetter;
    }
}

