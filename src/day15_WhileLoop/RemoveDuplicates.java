package day15_WhileLoop;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "xyzyzyz";
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if (result.contains(""+str.charAt(+i))){
                continue;
            }

            result += str.charAt(i);

        }

        System.out.println(result);
    }
}
