package day7_ifstatements;

public class NestedIfIntro {

    public static void main(String[] args) {

        int score = -100;

        if (score>=0 && score<=100){

            if(score>=60) {
                System.out.println("Passed");
            }else {
                System.out.println("Failed");
            }

        }else {
            System.out.println("Invalid Score");
        }


        System.out.println("----------------------------------------------");

        int Age = 32;

        if (Age>=1 && Age<=120){

            if (Age>=21){
                System.out.println("Eligible");
            }else {
                System.out.println("Not Eligible");

            }
        }else {
            System.out.println("Invalid Age");
        }



    }
}
