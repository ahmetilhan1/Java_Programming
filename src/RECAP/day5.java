package RECAP;

public class day5 {

    /*- Unary:  -, +, --, ++ (post/pre)
            - Shorthand: =, +=, -=, *=, /=, %=
            - Relational: >, < , <=, >=, ==, !=
            - Logical: &&, ||, !*/

    public static void main(String[] args) {

        int hourlyrate = 20,
            weeklyhours= 40;
        double stateTaxRate= 0.0625,
               federalTaxRate= 0.0495;

        int Salary = (hourlyrate*weeklyhours)*52;
        double StateTax= Salary*stateTaxRate;
        double federaltax=Salary*federalTaxRate;
        double totaltax = StateTax+federaltax;
        double salaryaftertax= Salary-totaltax;

        System.out.println("$"+Salary);
        System.out.println("$"+salaryaftertax);
        System.out.println("$"+totaltax);



    }
}
