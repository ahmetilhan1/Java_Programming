package day7_ifstatements;

public class NetIncomeCalc {

    public static void main(String[] args) {

        int income = 129999;
        boolean ismarried = true;

        boolean tax1 = income >= 130000;
        boolean tax2 = income >= 100000 && income <= 129999;
        boolean tax3 = income >= 80000 && income <= 99999;
        boolean tax4 = income <= 79000;


        double taxresult = 0;


        if (tax1 && ismarried) {
            taxresult = 0.30 * income;
            System.out.println(income - (int) taxresult);
        }
        if (tax1 && !ismarried) {
            taxresult = 0.35 * income;
            System.out.println(income - (int) taxresult);
        }
        if (tax2 && ismarried) {
            taxresult = 0.25 * income;
            System.out.println(income - (int) taxresult);
        }
        if (tax2 && !ismarried) {
                taxresult = 0.30 * income;
                System.out.println(income - (int) taxresult);
        }
        if (tax3 && ismarried) {
                taxresult = 0.20 * income;
                System.out.println(income - (int) taxresult);
        }
        if (tax3 && !ismarried) {
                taxresult = 0.25 * income;
                System.out.println(income - (int) taxresult);
        }
        if (tax4 && ismarried) {
                taxresult = 0.15 * income;
                System.out.println(income - (int) taxresult);
        }
        if (tax4 && !ismarried) {
                taxresult = 0.20 * income;
                System.out.println(income - (int) taxresult);
        }



        }
    }



/*3. Create a class named NetIncomeCalc, Write a program that can calculate the salary after tax based on the following requirements
        the tax rates are:
        35% for salary of 130K or more
        30% for salary of 100K to 129k
        25% for salary of 80K to 99K
        20% for salary of 79K or less

        in addition:
        if the person is married, he/she will pay 5% less tax
 */