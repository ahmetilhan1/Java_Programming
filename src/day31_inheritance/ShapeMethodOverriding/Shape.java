package day31_inheritance.ShapeMethodOverriding;

public class Shape {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double area(){
        return 0;
    }
    public double perimeter(){
        return 0;
    }
    public void draw(){
        System.out.println("Drawing a Shape");
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                "area='" + area() + '\'' +
                "perimeter='" + perimeter()
                + '\'' +
                '}';
    }
}
