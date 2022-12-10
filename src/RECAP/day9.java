package RECAP;

public class day9 {

    public static void main(String[] args) {

        int number = 100;

        String people = (number == 100) ? "30 crew, 70 passengers"
                :(number == 75) ? "25 crew, 50 passengers"
                :(number == 50) ? "20 crew, 30 passengers"
                : "not valid";

        System.out.println(people);


        int months = 1;

        String result = (months==1||months==3||months==5||months==7||months==8||months==10||months==12) ? "31 Days"
                : (months==4||months==6||months==9||months==11)? "30 Days"
                : (months==2)?"28 days "
                :"Invalid Month";

        System.out.println(result);
    }
}
