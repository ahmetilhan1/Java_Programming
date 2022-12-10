package lab1;

import java.util.Scanner;

public class numberSum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);    //2+3+3+2+2+4=16


        System.out.println("Give me a Number");

        String str = input.nextLine();

        char firstchar= str.charAt(0);
        char secondchar= str.charAt(1);
        char thirdchar= str.charAt(2);
        char fourthchar= str.charAt(3);
        char fifthchar= str.charAt(4);
        char sixthchar= str.charAt(5);


        int first = firstchar;

        System.out.println(first);







        /*boolean a = (number<1000000);

        if(a){
            ;
            int sum2 = (number%1000);
            int sum3 = (number/1000);
            int sum4 = (number/100);
            int sum5 = (number/10);

            System.out.println(sum2);
        }*/





    }
}
