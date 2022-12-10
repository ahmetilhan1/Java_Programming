package day28_encapsulation.Encapsulation;

public class Employee {


    private String name;

    public String getName() {

        if(name==null){
            return "Unknown";
        }
        return name;
    }

    public void setName(String name) {

        if(name.isEmpty()||name.isBlank()){
            System.err.println("Name can not be blank or empty: "+name);
            System.exit(1);
        }
        this.name = name;
    }


    private int age;

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        if (age < 16) {
            System.err.println("Invalid age:" + name);
            System.exit(1);

        }
        this.age = age;
    }


    private String jobTitle;

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jonTitle) {
        if(jobTitle.isBlank()||jobTitle.isEmpty()){
            System.err.println("Title can not be empty or blank:");
            System.exit(1);
        }
        this.jobTitle = jonTitle;
    }


    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {

        if(salary<0){
            System.err.println("Salary can not be negative: "+ salary);
            System.exit(1);
        }
        this.salary = salary;
    }
}
