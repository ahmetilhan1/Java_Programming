package day28_encapsulation.personTask;

public class TestPersonObjects {

    public static void main(String[] args) {


        Person person1 = new Person("Mohammad");
        Person person2 = new Person("Ilhan", 'M');
        Person person3 = new Person("Lorraine", 12);
        Person person4 = new Person("Daniel", "English");
        Person person5 = new Person("Said", 42, 'M');

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person5);


    }

}
