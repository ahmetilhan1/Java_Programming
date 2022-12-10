package RealBusiness.Planets;

public class Test {

    public static void main(String[] args) {


        Earth earth = new Earth("Earth", 7000000000L, "260 billion", 6000000000000000000L, 3958.8);


        System.out.println(earth);
        System.out.println(earth.surfacegravity());
        System.out.println(earth.getMass());
    }
}
