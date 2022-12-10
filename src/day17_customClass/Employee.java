package day17_customClass;

public class Employee {

    public String name;
    public int age;
    public char gender;
    public String jobTitle;
    public double salary;
    public String employeeID;

    public void setInfo(String name, int age, char gender, String jobTitle, double salary, String employeeID) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.employeeID = employeeID;
    }
}
