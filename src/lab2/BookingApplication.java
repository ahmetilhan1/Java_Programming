package lab2;

import java.util.Scanner;

public class BookingApplication {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Do you have a Bag? (Yes:true, No:false)");
        boolean hasbag = scan.nextBoolean();

        System.out.println("Direct transport only? (Yes:true, No:false");
        boolean nonstop = scan.nextBoolean();

        System.out.println("Choose your Travel Type (Train:1, Bus:2, Flight:3");
        int traveltype = scan.nextInt();

        System.out.println("From:");
        String from = scan.next();

        System.out.println("To:");
        String to = scan.next();

        String train1 = "TR001",
                train2 ="TR002",
                train3 ="TR003",
                train4 ="TR004",
                bus1=   "BS001",
                bus2=   "BS002",
                bus3=   "BS003",
                flight1="FL001",
                flight2="FL002",
                flight3="FL003";

        if((!from.equalsIgnoreCase("Berlin") && (!to.equalsIgnoreCase("Amsterdam")))){
            System.out.println("For now we are only able to book flights to Amsterdam from Berlin");
            return;
        }
        switch(traveltype){
            case 1:
                if(nonstop&&hasbag){
                    System.out.println("You can take "+train3);
                    return;
                } else if (!nonstop&&hasbag) {
                    System.out.println("You can take "+train4);
                    return;
                } else if (nonstop&&!hasbag) {
                    System.out.println("You can take "+train1);
                    return;
                }else {
                    System.out.println("You can take "+train1+","+train2+","+train3+","+train4);
                }
                break;
            case 2:
                System.out.println("You can take "+bus1+","+bus2+","+bus3);
                break;
            case 3:
                if (nonstop&hasbag){
                    System.out.println("Could not find any flight for you - please check your filter and retry it");
                    return;
                } else if (!nonstop&hasbag) {
                    System.out.println("You can take "+flight1);
                    return;
                } else if (nonstop&&!hasbag) {
                    System.out.println("You can take "+flight2);
                    return;
                }else {
                    System.out.println("You can take "+flight1+","+flight2+","+flight3);
                }
                break;
            default:
                System.out.println("Invalid Type");

        }


    }
}
