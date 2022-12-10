package day30_inheritance.phoneTask;

public class IPhone extends Phone{


    public IPhone(double price, String color, String model, String size) {
        super("IPhone", price, color, model, size);
    }


    public void faceTime(long phoneNumber){
        System.out.println(getModel()+" is face timing with "+phoneNumber);

    }
    public void faceTime(String email){
        System.out.println(getModel()+" is face timing with "+email);
    }

    public static boolean hasApplePay = true;
}
