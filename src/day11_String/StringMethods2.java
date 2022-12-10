package day11_String;

public class StringMethods2 {

    public static void main(String[] args) {

        String sentence = "I love Python, Python is the best programming language, and Python is in high demand";

        String sentence2 = sentence.replace("Python","Java");

        System.out.println(sentence2);

        System.out.println(sentence);

        String sentence3 = "I love Java, Java is cool";

        sentence3 = sentence3.replaceFirst("Java", "Python");

        System.out.println(sentence3);

        String sentence4 = "Java is fun, Java is cool, Java is amazing";

        sentence4 = sentence4.replaceFirst("Java is cool","Python is cool");

        System.out.println(sentence4);

        String sentence5 = "I love Java Programming";

        String languageName = sentence5.substring(7,10+1);

        System.out.println(languageName);

        String sentence6 = "Today is Sunday, Tomorrow is Monday";

        String name = sentence6.substring(9,14+1);

        System.out.println(name);

        String email = "gmail@yahoo.com";

        int beginning = email.indexOf("@")+1 ;

        int ending = email.lastIndexOf(".");

        String domain = email.substring(beginning,ending);

        System.out.println(domain);


        String sentence7 = "I love Java programming";

        String r1 = sentence7.substring(7);

        System.out.println(r1);

        String s7 = "Today is Sunday, Tomorrow is Friday";

        String tomorrow = s7.substring(s7.lastIndexOf(" ")+1);
        System.out.println(tomorrow);

        System.out.println("==================================================");

        String word = "Python";

        String result = (word+"\n").repeat(10);

        System.out.println(result);




    }
}
