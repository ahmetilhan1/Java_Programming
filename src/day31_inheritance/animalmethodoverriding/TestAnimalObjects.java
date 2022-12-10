package day31_inheritance.animalmethodoverriding;

public class TestAnimalObjects {

    public static void main(String[] args) {


        Eagle eagle = new Eagle("Kamil", "Bald Head", 'M', 12, "Large", "Black");

        eagle.eat();

        Dog dog = new Dog("Lale","Husky",'F',10,"Large","Blue");

        dog.eat();

        Cat cat = new Cat("Alien","Tekir",'F',1,"Small","Yellow");

        cat.eat();

        System.out.println(cat);
        System.out.println(dog);
        System.out.println(eagle);

    }
}
