package lab10_classObject_encapsulation.scrumTask;

public class Test {

    public static void main(String[] args) {

        Tester tester1 = new Tester("Ilhan",22,'M',"160104AI","Developer",21);

        System.out.println(tester1);

        Developer developer1 = new Developer("Lorraine", 23, 'F',"c25","Back-end Developer",12,"Java");

        System.out.println(developer1);
        developer1.coding();
        developer1.fixingBug();
    }

}
