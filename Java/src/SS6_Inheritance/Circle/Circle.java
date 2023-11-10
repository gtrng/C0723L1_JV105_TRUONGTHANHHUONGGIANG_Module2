package SS6_Inheritance.Circle;

import static java.lang.Math.PI;

public class Circle {
    public double radius;
    public String color;
    public Circle() {
    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public double area(){
        return PI * radius *radius;
    }
}
