package lab2;

public class AppleTask {

    public static void main(String[] args) {

        int     apple1 = 10,
                apple2 =10,
                apple3 =10,
                apple4 =10,
                apple5 =10,
                apple6 =20,
                apple7 =10;

        int sum1 = apple1+apple2+apple3;
        int sum2 = apple4+apple5+apple6;

        if(sum1==sum2){
            System.out.println("Apple 7 is the heaviest" );

        }else if (sum1>sum2){
            if (apple1==apple2){
                System.out.println("Apple3 is the heaviest");
            }else if(apple1>apple2){
                System.out.println("Apple1 is the heaviest");
            }else {
                System.out.println("Apple2 is the heaviest");
            }
        }else if (sum2>sum1) {
            if (apple4==apple5){
                System.out.println("Apple6 is the heaviest");
            }else if (apple4>apple5){
                System.out.println("Apple4 is the heaviest");
            }else{
                System.out.println("Apple5 is the heaviest");
            }



        }

    }
}
