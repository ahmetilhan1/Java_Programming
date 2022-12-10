package day32_finalKeyword.carTaskMethodOverriding;

import java.util.ArrayList;
import java.util.Arrays;

public class Tesla extends Car{

    public Tesla(String model, String color, int year, double price) {
        super(model,color,year,price);
    }

    public void autopilot(){
        System.out.println(getMake()+" "+getModel()+" is in self-driving mode");
    }

    @Override
    public void start() {
        System.out.println("Say\"Start\" to start" + getMake()+" "+getModel());
    }

    public void setModel(String model){
        ArrayList<String> models = new ArrayList<>();
        models.addAll(Arrays.asList("Model S ","Model Y","Model X","Model 3"));


        if (!models.contains(model)){
            System.err.println("Invalid Tesla Model"+model);
            System.exit(1);
        }
        super.setModel(model);

    }

    public void setColor(String color){
        ArrayList<String> colors = new ArrayList<>();
        colors.addAll(Arrays.asList("White","Red","Black","Silver","Blue","Brown","Green"));

        if (!colors.contains(color)){
            System.err.println("Invalid Color");
            System.exit(1);
        }
        super.setColor(color);
    }
    public void setYear(int year){
        if (year<2008){
            System.err.println("Invalid year if Tesla car: "+year);
            System.exit(1);
        }
        super.setYear(year);
    }
    public void setPrice(double price){

        if (price<50000){
            System.err.println("Invalid price for Tesla car: "+price);
            System.exit(1);
        }
        super.setPrice(price);
    }
}
