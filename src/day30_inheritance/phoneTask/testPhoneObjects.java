package day30_inheritance.phoneTask;

public class testPhoneObjects {

    public static void main(String[] args) {

        IPhone iphone1 = new IPhone(122,"Black","XS","Large");

        Samsung samsung1 = new Samsung(300.0,"Black","Bokumsu","Medium");

        Nokia nokia1 = new Nokia(221.0,"White","Brick","Heavy");

        iphone1.faceTime(22332);

        iphone1.faceTime("ahmetilhan@gmail.com");

        samsung1.call(1223345);

    }
}
