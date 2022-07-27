package ss6_inheritance;

public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder() {
    }

    public Cylinder(double r, String color, double h) {
        super(r, color);
        this.height = h;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSurroundingArea() {
        return super.getPerimeter() * height;
    }

    public double getTotalArea() {
        return (super.getArea() * 2) + getSurroundingArea();
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    public String toString() {
        return "\n-------------------Hình trụ-----------------\nBán kính = " + super.getRadius() + "\nMàu sắc = " + super.getColor() + "\nChiều cao = " + height + "\nDiện tích xung quanh = " + getSurroundingArea() + "\nDiện tích toàn phần = " + getTotalArea() + "\nThể tích = " + getVolume();
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.printf("" + cylinder.toString());
        cylinder = new Cylinder(2, "black", 3);
        System.out.printf("" + cylinder);


    }
}
