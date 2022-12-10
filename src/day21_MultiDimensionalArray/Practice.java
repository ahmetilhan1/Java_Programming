package day21_MultiDimensionalArray;

import java.util.Arrays;

public class Practice {

    public static void main(String[] args) {

        String[] group = {"Lucy ","Umran","Sumeyye","Abidullah"};
        String[] group2 = {"Nadiyar","Khashayar","Rayhane"};
        String[] group3 = {"Alena","Evgeniya"};
        String[] group4 = {"Said","Ilhan", "Baturay"};

        String[][] groups = {group,group2,group3,group4};

        for (int i = 0; i < groups.length; i++) {
            String[] eachgroup= groups[i];
            System.out.println(Arrays.toString(eachgroup));
            for (int i1 = 0; i1 < eachgroup.length; i1++) {
                String eachStudent = eachgroup[i1];
                System.out.println(eachStudent);

            }

        }
    }
}
