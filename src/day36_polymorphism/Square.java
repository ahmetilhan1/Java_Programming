package day36_polymorphism;

public class Square {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public boolean equals(Object obj){
        if(!(obj instanceof Square)){
            System.err.println("Invalid Object");
            System.exit(1);
        }
        if(side==((Square)obj).side){
            return true;
        }

        return false;
    }
}
