package day32_finalKeyword.carTaskMethodOverriding;

public class TestCarObject {
    public static void main(String[] args) {

        Toyota toyota = new Toyota("Camry","Beige",2002,2500);

        Honda honda = new Honda("Accord","Blue",2005,6500);

        BMW bmw = new BMW("X5","Black",2010,9000);

        Tesla tesla = new Tesla("Model 3","Black",2015,550000);

        System.out.println(tesla);

    }
}
