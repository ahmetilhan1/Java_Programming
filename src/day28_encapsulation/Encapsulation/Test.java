package day28_encapsulation.Encapsulation;

public class Test {

    public static void main(String[] args) {

        Student student = new Student();

        student.setAge(1);

        System.out.println(student.getAge());

        student.setName("Aaron123");

        System.out.println(student.getName());

    }
}
