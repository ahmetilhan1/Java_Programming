package SelfPractice;

public class SalaryCalculator {
    public static void main(String[] args) {

        int
                hourlyrate = 50,
                weeklyhours = 45,
                salarybeforetax = hourlyrate*weeklyhours,
                grosspay = salarybeforetax*52;


        double
                statetaxrate = 0.06,
                federaltaxrate=0.26,
                statetax = salarybeforetax*statetaxrate*52,
                federaltax = salarybeforetax*federaltaxrate*52,
                totaltax = statetax+federaltax,
                salaryaftertax = grosspay-totaltax,
                netincome = (salaryaftertax*52);

        System.out.println("Gross pay is $"+grosspay);
        System.out.println("Federal tax is $"+(int)federaltax);
        System.out.println("State tax is $"+(int)statetax);
        System.out.println("Total tax is $"+(int)totaltax);
        System.out.println("Net income is $"+(int)salaryaftertax);


    }
}
