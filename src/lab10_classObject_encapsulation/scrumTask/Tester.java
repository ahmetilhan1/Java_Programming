package lab10_classObject_encapsulation.scrumTask;

public class Tester {

    private String name;
    private int age;
    private char gender;
    private String employeeId;
    private String jobTitle;
    private double hourlyrate;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if(age<18){
            System.err.println("Invalid Age: "+ age);
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(!(gender=='M'||gender=='F')){
            System.err.println("Invalid Gender: "+gender);
            System.exit(1);
        }

        this.gender = gender;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if(jobTitle==null||jobTitle.isBlank()||jobTitle.isEmpty()){
            System.err.println("Job title can not be blank,empty or null: "+ jobTitle);
            System.exit(1);
        }

        this.jobTitle = jobTitle;
    }

    public double getHourlyrate() {
        return hourlyrate;
    }

    public void setHourlyrate(double hourlyrate) {

        if(hourlyrate<0){
            System.err.println("Invalid Hourly Rate"+hourlyrate);
            System.exit(1);
        }
        this.hourlyrate = hourlyrate;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {

        if(name==null||name.isEmpty()||name.isBlank()){
            System.err.println("Invalid Name:" + name);
            System.exit(1);
        }

        this.name = name;



    }

    public double getSalary(){
        return hourlyrate*40 * 52;
    }
    public void testing(){
        System.out.println(name + " is testing the application");
    }

    public Tester(String name, int age, char gender, String employeeId, String jobTitle, double hourlyrate) {
        setName(name);
        setAge(age);
        setEmployeeId(employeeId);
        setHourlyrate(hourlyrate);
        setJobTitle(jobTitle);
        setGender(gender);
    }

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", employeeId='" + employeeId + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", hourlyrate=" + hourlyrate +
                '}';
    }
}
