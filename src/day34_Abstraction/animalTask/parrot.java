package day34_Abstraction.animalTask;

public class parrot extends animal{

    public parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void eat(){
        System.out.println("Parrot "+ getName()+" is eating seeds");
    }
}
