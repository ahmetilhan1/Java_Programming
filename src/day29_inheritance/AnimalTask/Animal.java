package day29_inheritance.AnimalTask;

public class Animal {

    protected String name;
    protected String breed;
    protected char gender;
    protected String size;
    protected String color;
    protected int age;

    protected void eat(String food) {
        System.out.println(this.name + " is eating"+ food);
    }
    protected void drink(String drink) {
        System.out.println(this.name + " is drinking"+ drink);
    }
    protected void sleep(){
        System.out.println(this.name+ " is sleeping");

    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected String getBreed() {
        return breed;
    }

    protected void setBreed(String breed) {
        this.breed = breed;
    }

    protected char getGender() {
        return gender;
    }

    protected void setGender(char gender) {
        this.gender = gender;
    }

    protected String getSize() {
        return size;
    }

    protected void setSize(String size) {
        this.size = size;
    }

    protected String getColor() {
        return color;
    }

    protected void setColor(String color) {
        this.color = color;
    }

    protected int getAge() {
        return age;
    }

    protected void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
