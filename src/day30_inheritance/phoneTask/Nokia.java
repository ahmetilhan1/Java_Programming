package day30_inheritance.phoneTask;

public class Nokia extends Phone{

    public Nokia(double price, String color, String model, String size) {
        super("Nokia" ,price, color, model, size);
    }

    public void selfDefense(){
        System.out.println(getBrand()+" "+ getModel() + " can be used for self defense");
    }
}
