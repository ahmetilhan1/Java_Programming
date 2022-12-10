package day38_exceptions.shapeTask;

public class Circle {

    private double Radius;

    public double getRadius() {
        return Radius;
    }

    public void setRadius(double radius) {
        if(radius<=0){
            throw new InvalidShapeException("Invalid Radius "+radius);
        }
        Radius = radius;
    }

    public Circle(double radius) {
        if (radius <= 0) {
            throw new InvalidShapeException("Invalid Radius " + radius);
        }
        Radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "Radius=" + Radius +
                '}';
    }
}
