package day6_ifStatements;

public class MinimumNumber {

    public static void main(String[] args) {

        int
                n1 = 3321,
                n2 = 2323,
                n3 = 2312;

        if(n1<n2&&n1<n3){
            System.out.println(n1 + " is the minumum number");
        }
        if(n2<n1&&n2<n3){
            System.out.println(n2 + " is the minimum number");
        }
        if(n3<n1&&n3<n2){
            System.out.println(n3 + " is the minimum number");
        }
    }
}
