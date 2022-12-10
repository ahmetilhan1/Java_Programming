package day34_Abstraction.animalTask;

public class eagle extends animal{
    public eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void eat(){
        System.out.println("Eagle "+getName()+" is eating snake");
    }
}
