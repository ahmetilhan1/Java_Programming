package GroupStudy;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        System.out.println("Give me a Year");

        leapyears();


    }

    public static void leapyears(){

        Scanner input = new Scanner(System.in);

        int year = input.nextInt();

        if(year % 4 ==0){
            if(year%100==0){
                if(year%400==0) {
                    System.out.println(year+" is a leap year");
                    return;
                }
                System.out.println(year+" is not a leap year");
                return;
            }
            System.out.println(year+" is a leap year");
        }else {
            System.out.println(year+" is not a leap year");
        }
        input.close();


    }

}
