package day30_inheritance.TypesofInheritance;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Teacher extends Employee {

    public Teacher(String name, char gender, LocalDate DOB, String jobTitle, String employeeId) {
        super(name, gender, DOB, jobTitle, employeeId);
    }

    public void teach(){
        System.out.println(getName()+ " is teaching");

    }
}
