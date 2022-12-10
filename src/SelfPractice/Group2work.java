package SelfPractice;

public class Group2work {


    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

           if (i==0) {
               System.out.println("* * * * *");
           }else if(i==1){
               System.out.println("* * * *");
           }else if(i==2){
               System.out.println("* * *");
           } else if (i==3) {
               System.out.println("* *");
           }else if (i==4){
               System.out.println("*");
           }


        }

        






        String given = "wqqwqwa";

        given = given.toLowerCase();

        char    a = 'a',
                e = 'e',
                i= 'i',
                o= 'o',
                u= 'u';

        for (int j = 0; j < given.length(); j++) {

            char givenchar =  given.charAt(j);


            if (givenchar==a) {
                System.out.println(given.indexOf(givenchar));
                break;
            }else if (givenchar==e){
                System.out.println(given.indexOf(givenchar));
                break;
            } else if (givenchar==i) {
                System.out.println(given.indexOf(givenchar));
                break;
            } else if (givenchar==o) {
                System.out.println(given.indexOf(givenchar));
                break;
            } else if (givenchar==u) {
                System.out.println(given.indexOf(givenchar));
                break;
            }
            }


            //System.out.println(givenchar);

        }







    }





/*Question 1: Given a string, write a method to find the first non-repeating vowel(a,e, i,o,u) in it and return its index
. If it doesn't exist, return -1. Assume that all the characters of the String are lowercase.
(Do not use String class functions other than charAt())
*/