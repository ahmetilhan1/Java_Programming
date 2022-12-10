package GroupStudy;

import java.util.Scanner;

public class Fastcar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Whats the max speed of your car?");

        int maxspeed = input.nextInt();
        input.close();

        String  fastcars = maxspeed>200? ("a fast car"):("not a fast car");

        System.out.println(fastcars);
    }
}
