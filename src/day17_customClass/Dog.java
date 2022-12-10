package day17_customClass;

public class Dog {

    public String name;  // instance variable
    public String breed;
    public String size;
    public char gender;
    public int age;
    public String color;

    public void setInfo(String name, String breed, String size , char gender, int age, String color){
        this.name = name;
        this.breed = breed;
        this.size = size;
        this.gender = gender;
        this.age = age;
        this.color = color;

    }


    public void eat(){
        System.out.println(name +" is eating");
    }

    public void drink(){
        System.out.println(name +" is drinking water");


    }

    public String toString() {
        return "Dog{ " +
                "\n\tname='" + name + '\'' +
                ", \n\tbreed='" + breed + '\'' +
                ", \n\tsize='" + size + '\'' +
                ", \n\tgender=" + gender +
                ", \n\tage=" + age +
                ", \n\tcolor='" + color + '\'' +
                '}';
    }
}

