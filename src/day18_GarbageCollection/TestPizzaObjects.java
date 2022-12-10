package day18_GarbageCollection;

public class TestPizzaObjects {

    public static void main(String[] args) {

        Pizza pizza1 = new Pizza();
        pizza1.size = 'M';

        pizza1.setInfo('L',2,4);

        System.out.println(pizza1);

        double total = 0;
        for (int i = 0; i < 20; i++) {

            Pizza small = new Pizza();
            small.setInfo('s',2,2);
            total+= small.calcCost();

            Pizza medium = new Pizza();
            medium.setInfo('m', 3,4);
            total+= medium.calcCost();

            Pizza large = new Pizza();
            large.setInfo('L',4,5);
            total+= large.calcCost();



        }
        System.out.println("Total cost is: "+ total);
    }
}
