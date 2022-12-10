package day27_accessModifiers;

public class TestCydeoStudentObjects {

    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent("Ilhan",12,'M');
        CydeoStudent student2 = new CydeoStudent("Ahmet",24,'M');


        System.out.println(student1);
        System.out.println(student2);

        System.out.println(student1+" attended "+student1.schoolName);
        System.out.println(student1.secretCode);
    }
}
