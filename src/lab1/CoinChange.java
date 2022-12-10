package lab1;
/*
1 quarter = 25 cents
1 dime = 10 cents
1 nickle = 5 cents
 */


public class CoinChange {

    public static void main(String[] args) {


        int
                priceinCents = 20,
                change = 100 - priceinCents,
                quarter = change/25,
                dimes = (change%25)/10,
                nickles = ((change%25)%10)/5,
                penny = (((change%25)%10)%5)/1;



        System.out.println("quarter:"+ quarter + " dimes:" + dimes + " nickles:"+ nickles+ " penny:"+penny);
    }
}
