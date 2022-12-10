package day30_inheritance.TypesofInheritance;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Employee extends Person {

    public Employee(String name, char gender, LocalDate DOB, String jobTitle, String employeeId) {
        super(name, gender, DOB);
        setJobTitle(jobTitle);
        setEmployeeId(employeeId);
    }

    private String jobTitle;
    private String employeeId;


    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void work(){
        System.out.println(getName()+" is working");
    }

    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                ", employeeId='" + employeeId + '\'' +
                '}';
    }
}
