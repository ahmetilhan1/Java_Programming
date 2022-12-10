package RECAP;

public class day6 {

    public static void main(String[] args) {

        int number = 50;

        if(number%2==0){
            System.out.println(number + " is even");
        }else {
            System.out.println(number + " is odd");
        }

        System.out.println("-----------------------------");

        if(number<0){
            System.out.println(number + " is negative");
        }else if(number>0){
            System.out.println(number + " is positive");
        }else {
            System.out.println(number + " is zero");
        }

        System.out.println("-----------------------------");

        if(number%2==0){
            System.out.println(number+" is evenly divisible by 2 "+true);
        }else{
            System.out.println(number+" is evenly divisible by 2 "+false);
        }
        if(number%3==0){
            System.out.println(number+" is evenly divisible by 3 "+true);
        }else {
            System.out.println(number+" is evenly divisible by 3 "+false);
        }
        if(number%5==0){
            System.out.println(number+" is evenly divisible by 5 "+true);
        }else {
            System.out.println(number+" is evenly divisible by  "+false);
        }
    }
}
