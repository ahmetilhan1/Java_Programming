package day30_inheritance.phoneTask;

import java.util.Arrays;

public class Phone {

    private String brand;
    private String model;
    private String size;
    private String color;
    private double price;




    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price<=0){
            System.err.println("Invalid Price: "+price);
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        String[] colors = {"Black","White","Silver","Gold","Pink"};
        if (Arrays.asList(colors).contains(color)){
            this.color = color;
        }else {
            System.err.println("Invalid Color: "+color);
            System.out.println("Color can only be: "+ Arrays.toString(colors));
            System.exit(1);
        }

    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Phone(String brand, double price, String color, String model, String size) {
        setBrand(brand);
        setPrice(price);
        setColor(color);
        setModel(model);
        setSize(size);
    }

    public String toString() {
        return getClass().getSimpleName()+"{"+
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
    public void call(long number){
        System.out.println(getModel()+" is calling "+number);
    }
    public void text(long number){
        System.out.println(getModel()+" is texting "+number);
    }
}
