package RECAP;

public class day7 {

    public static void main(String[] args) {

        double salary = 50000;
        int creditScore= 780;

        if(salary>45000&&creditScore>750){
            System.out.println("You are eligible for loan");
        }else{
            System.out.println("You are not eligible for loan");
        }

        System.out.println("-----------------------------------------");

        char grade = 'A';
        switch (grade){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Great Job");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Passed");
                break;
            case 'F':
                System.out.println("Failed");
                break;
            default:
                System.out.println("Invalid Grade"+grade);

        }

        System.out.println("-----------------------------------------");

        double tax = 0;
        boolean ismarried = true;
        double marriagebenefit = 0;

        if(salary>=130000){
            tax = salary*0.35;
        }else if (salary<13000&&salary>=100000){
            tax = salary*0.30;
        }else if (salary<100000&&salary>=80000){
            tax = salary*0.25;
        }else{
            tax = salary*0.20;
        }

        if(ismarried){
            marriagebenefit= salary*0.05;
        }

        double netincome= (salary-tax)+marriagebenefit;

        System.out.println(netincome);

    }
}
