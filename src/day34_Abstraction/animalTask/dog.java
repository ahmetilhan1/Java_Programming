package day34_Abstraction.animalTask;

public class dog extends animal implements Playable{

    public dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void eat(){
        System.out.println("Dog "+getName()+ " is eating dog food");
    }

    public void play(){
        System.out.println("Dog "+getName()+ " is playing with ball");
    }
}
