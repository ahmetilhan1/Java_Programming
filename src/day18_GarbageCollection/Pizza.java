package day18_GarbageCollection;

public class Pizza {

    public char size;
    public int numberOfCheeseTopping, numberOfPepperoniTopping;

    public double calcCost(){
        double totalPrice = 0;

        switch (size) {

            case 'S':
            case 's':
                totalPrice = 10 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
                break;

            case 'M':
            case 'm':
                totalPrice = 12 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
                break;

            case 'L':
            case 'l':
                totalPrice = 14 + 2 * (numberOfPepperoniTopping + numberOfCheeseTopping);
                break;

            default:
                System.err.println("Invalid size: " + size);
        }

        return totalPrice;
    }


    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", total price =" + calcCost() +
                '}';
    }

    public void setInfo(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping){
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;


    }
}
