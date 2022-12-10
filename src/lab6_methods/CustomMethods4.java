package lab6_methods;

public class CustomMethods4 {

    public static void main(String[] args) {

        String str = "addddssggwewwqetyu";

        String unique = "";

        for (int i = 0; i < str.length(); i++) {

            if (StringUtility.frequency(str,str.charAt(i))==1){
                unique += str.charAt(i);
            }
            /*char each = str.charAt(i);

            int f = StringUtility.frequencychar(str,each);

            if(f==1){
                unique +=each;
            }*/

        }

        System.out.println(unique);

        System.out.println("=======----------------------");

        String s = "asdddfaqw";

        String nonDup = StringUtility.removedup(s);

        String result = "";


        for (int i = 0; i < nonDup.length(); i++) {

            result += (""+nonDup.charAt(i)+StringUtility.frequency(s,nonDup.charAt(i))+" ");

            /*char ch = nonDup.charAt(i);
           int f = StringUtility.frequency(s,ch);
           result += ""+ch+f+" ";*/

        }
        System.out.println(result);
    }


}
