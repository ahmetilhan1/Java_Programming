package day29_inheritance.AnimalTask;

public class Test {

    public static void main(String[] args) {

        dog dog1 = new dog();
        dog1.setName("Lale");
        dog1.setAge(12);
        dog1.setBreed("Husky");
        dog1.setColor("Blue");
        dog1.setSize("Large");
        dog1.setGender('M');

        Tiger tiger1 = new Tiger();


        System.out.println(dog1);

        dog1.eat(" apple");
        dog1.bark();


    }
}
