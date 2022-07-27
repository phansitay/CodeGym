package ss6_inheritance;

public class Circle {
    private double radius = 1.0;
    private String color = "blue";
    final double PI = 3.14;

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

    public Circle() {
    }

    public Circle(double r, String color) {
        this.radius = r;
        this.color = color;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * PI * radius;
    }

    public String toString() {
        return "\nBán kính = " + radius + "\nColor = " + color + "\nDiện tích = " + getArea() + "\nChu vi = " + getPerimeter();
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.printf("" + circle.toString());
        System.out.println();
        circle = new Circle(12, "Yellow");
        System.out.printf("" + circle.toString());


    }
}
