package day17_customClass;

public class TestDogObjects {

    public static void main(String[] args) {

        Dog dog1 =  new Dog();

        dog1.name = "Max";
        dog1.breed = "Husky";
        dog1.age = 12;
        dog1.gender = 'M';
        dog1.size = "Large";
        dog1.color = "Gray";

        dog1.eat();

        System.out.println(dog1);

        Dog dog2 = new Dog();
        dog2.setInfo("Kamil","Kangal","Very Large",'M',12,"Black");


        System.out.println(dog2);



    }
}
