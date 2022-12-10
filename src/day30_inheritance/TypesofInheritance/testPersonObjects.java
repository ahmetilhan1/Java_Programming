package day30_inheritance.TypesofInheritance;

import java.time.LocalDate;

public class testPersonObjects {

    public static void main(String[] args) {

        Student student = new Student("Lucy",'F', LocalDate.of(1996,2,12),'A',"160104ai");

        President president = new President("Daniel",'M',LocalDate.of(1980,4,12),LocalDate.of(2021,3,3));

        Teacher teacher = new Teacher("Emily", 'F',LocalDate.of(1999,2,23),"Dev Teacher","160150ds");

        System.out.println(student);
        System.out.println(teacher);
        System.out.println(president);
    }
}
