package RECAP;

import java.util.ArrayList;
import java.util.List;

public class day16 {

    public static void main(String[] args) {

        String str = "asdasdasdasdasdasda";



        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i)==str.charAt(j)&&i!=j){
                    count++;

                }

            }
            System.out.println(str.charAt(i)+""+count);

        }



    }
}
