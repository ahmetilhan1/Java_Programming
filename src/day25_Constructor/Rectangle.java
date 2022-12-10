package day25_Constructor;

public class Rectangle {

    public double length, width;

    public double area(){
        return length*width;


    }

    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
