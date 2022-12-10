package lab6_methods;

public class CustomMethods {


    public static String extraEnd(String str){

        if(str.length()<2){
            return str;
        }

        String substring = str.substring(str.length()-2);
        String result = substring.repeat(3);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(extraEnd("asdf"));

        System.out.println(withoutEnd("Hello"));

    }

    public static String withoutEnd(String str){

        if(str.length() >=3){
            return str.substring(1,str.length()-1);
        }else{
            return str;
        }

    }
}


