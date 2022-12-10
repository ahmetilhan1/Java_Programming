package day31_inheritance.VehicleClass;

public class Boat extends Vehicle{

    public Boat(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }

    public void riding(){
        System.out.println(getBrand()+getModel()+" is riding");
    }
}
