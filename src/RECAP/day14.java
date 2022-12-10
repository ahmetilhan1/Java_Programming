package RECAP;

import org.w3c.dom.ls.LSOutput;

public class day14 {

    public static void main(String[] args) {

        String one = "one";
        String two = "Eight";

        one = one.toLowerCase();
        two = two.toLowerCase();


        if (one.charAt(one.length() - 1) == two.charAt(0)) {
            two = two.replace(two.substring(0, 1), "");
        }
        String merged = one + two;

        System.out.println(merged);


        int a = 120;
        int b = 140;

        int sum = (a + b) / 2;

        System.out.println(sum);
    }
}
