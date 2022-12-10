package day4_concatenation;

public class PrimitiveTypeCasting {

    public static void main(String[] args) {

        //implicit casting

       byte a = 15;

       short b = (short)a;

       int c = a;

       System.out.println(b);

       long d = 3000L;

       float f =(float) d;

       System.out.println(f);

         //explicit casting

       int y = 100;

       byte p = (byte)y;

        System.out.println(p);

        float z = 20.08f;
        short q = (short) z;

        System.out.println(q);
        System.out.println("this is" + " one String.");




    }
}
