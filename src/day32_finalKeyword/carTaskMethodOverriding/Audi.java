package day32_finalKeyword.carTaskMethodOverriding;

public class Audi extends Car{

    public Audi(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    public void start(){
        System.out.println("Press the start button"+getMake()+getModel());
    }
}
