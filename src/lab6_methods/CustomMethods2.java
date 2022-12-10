package lab6_methods;

public class CustomMethods2 {


    public static String longerandshorter (String str,String str2){

        if(str.length()>str2.length()){
            return str2+str+str2;
        } else if (str.length()<str2.length()) {
            return str+str2+str;
        }else {
            return str+ " same length "+str2;
        }


    }

    public static void main(String[] args) {
        System.out.println(longerandshorter("Hello","Hello"));

        System.out.println(left2("java"));

        System.out.println(right2("Java"));

        System.out.println(frontAgain("asasdggv"));
    }

    public static String left2(String str){

        if(str.length()>=2){
            String left2 = str.substring(0,2);
            String rest = str.substring(2);
            return rest + left2;
        }else {
            return str;
        }

    }
    public static String right2(String str){

        if(str.length()>=2){
            String right2=str.substring(str.length()-2);
            String rest = str.substring(0,str.length()-2);
            return right2 + rest;
        }else {
            return str;
        }
    }
    public static String frontAgain(String str){
        if (str.length()>=2){
            String first2 = str.substring(0,2);
            String last2 = str.substring(str.length()-2);
            if(first2.equals(last2)){
                return "True";
            }
        }
        return str;
    }
}
