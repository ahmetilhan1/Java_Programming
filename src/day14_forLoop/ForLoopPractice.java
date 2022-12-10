package day14_forLoop;

public class ForLoopPractice {

    public static void main(String[] args) {

        for(int number=2; number<=10 ; number++) {
            System.out.println("Hello world");
        }

        int sum =0;
        for(int number= 1 ; number<=100; number++){
            sum+=number;

        }
        System.out.println(sum);

        for(char alp = 'A'; alp<='Z';alp++){
            System.out.print(alp+ " ");
        }
        System.out.println();
        System.out.println("Hello");

    }
}
