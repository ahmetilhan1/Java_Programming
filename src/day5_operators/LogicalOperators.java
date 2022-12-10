package day5_operators;

public class LogicalOperators {

    public static void main(String[] args) {

        double salary = 45000;
        int creditScore= 700;

        boolean eligibleForLoan = salary>=30000 && creditScore>=650;

        System.out.println(eligibleForLoan);

        System.out.println("-----------------------------------------------");

        boolean eligibleForInsurance = salary>=40000 || creditScore>=800;

        System.out.println(eligibleForInsurance);

        System.out.println("-----------------------------------------------");


        String country= "UK";

        boolean nativeEnglishSpeaker = country == "Canada" || country =="USA" || country == "UK";

        System.out.println(nativeEnglishSpeaker);

        System.out.println("-----------------------------------------------");

        char grade = 'A';

        boolean passedTheExam = grade == 'A' || grade == 'B' || grade == 'C';

        System.out.println("passedTheExam = " + passedTheExam);

        int score = 56;

        boolean passedTheTest = score>=60 && score>= 55;

        System.out.println(passedTheTest);

        System.out.println("------------------------------------------------");

        String a = "yes";

        boolean yes = a == "yes";
        boolean no = !yes;

        System.out.println(yes);
        System.out.println(no);

        System.out.println("------------------------------------------------");

        int grades =65;

        boolean passed = grades >= 70;
        boolean failed = !passed;

        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);
    }
}
