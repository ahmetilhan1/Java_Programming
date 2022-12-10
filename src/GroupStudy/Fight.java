package GroupStudy;

import java.util.Arrays;
import java.util.Random;

public class Fight {


    public static void main(String[] args) {
        int damage = 0;


        Fighter tom = new Fighter();
        Fighter harry= new Fighter();
        Fighter jerry= new Fighter();
        Fighter harold= new Fighter();



        System.out.println("The winner is " +declareWinner(tom, harry, "Tom"));


    }
    public static String declareWinner(Fighter tom , Fighter harry, String name ) {
        Random rand = new Random();
        tom.SetInfo("Tom", 20, 0);
        harry.SetInfo("Harry", 10, 0);

        int health1 = tom.health;
        int health2 = harry.health;




        String declareWinner = "";
        do {
            if (name.equalsIgnoreCase("Tom")) {
                tom.damagePerAttack = rand.nextInt(3);
                health2 -= tom.damagePerAttack;


                if (health2 > -1) {
                    harry.damagePerAttack = rand.nextInt(5);
                    health1 -= harry.damagePerAttack;
                    System.out.println(health1);
                    System.out.println(health2);
                }
            }
            if (name.equalsIgnoreCase("Harry")) {
                harry.damagePerAttack = rand.nextInt(5);
                health1 -= harry.damagePerAttack;
                if (health1 > -1) {
                    tom.damagePerAttack = rand.nextInt(3);
                    health2 -= tom.damagePerAttack;
                }

            }
        }while (health1 > -1 && health2 > -1) ;

        if (health1 < 0 ) {
            declareWinner = "Harry";
        }
        if (health2 < 0 ) {
            declareWinner = "Tom";
        }

        return declareWinner;

    }



}