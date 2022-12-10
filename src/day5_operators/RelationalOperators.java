package day5_operators;

public class RelationalOperators {

    public static void main(String[] args) {

        int
                a=33,
                b=23;
        //System.out.println(a>b);

        boolean aisGreater= a > b;

        System.out.println(aisGreater);

        System.out.println("--------------------------------");

        int score = 58;

        boolean passed = score>=60;

        System.out.println(passed);

        System.out.println("--------------------------------");


        int age = 35;

        boolean eligibleToBuyAlcohol= age>=21;

        System.out.println(eligibleToBuyAlcohol);

        boolean eligibleToVote = age >= 18 ;

        System.out.println(eligibleToVote);

        System.out.println("---------------------------------");

        System.out.println(100>100); //false
        System.out.println(100>=100); //true
        System.out.println(100>=85); //true

        System.out.println("----------------------------------");

        score=48;
        boolean failed = score < 60;

        System.out.println(failed);





    }
}
