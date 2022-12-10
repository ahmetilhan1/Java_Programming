package day30_inheritance.TypesofInheritance;

import java.time.LocalDate;

public class Student extends Person{

    public Student(String name, char gender, LocalDate DOB, char grade, String studentID) {
        super(name, gender, DOB);
        setGrade(grade);
        setStudentID(studentID);
    }

    private char grade;
    private String studentID;

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
}
