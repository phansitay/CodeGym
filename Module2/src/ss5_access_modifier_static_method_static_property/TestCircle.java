package ss5_access_modifier_static_method_static_property;

import java.util.Scanner;

public class TestCircle {
    private double radius=1.0;
    private String color="red";
    final double PI=3.14;

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
    public TestCircle()
    {
        this.radius=getRadius();
        this.color=getColor();
    }
    public TestCircle(double r){
        this.radius=r;
    }
    public void input(){
        Scanner kb= new Scanner(System.in);
        System.out.printf("Nhập bán kính của hình tròn : ");
        radius=kb.nextDouble();
    }
    public double getArea(){
        double area;
        area =PI*radius*radius;
        return area;
    }
    public static void main(String[] args) {
        TestCircle Circle =new TestCircle();
        Circle.input();
        System.out.printf("Diện tích của hình tròn là : "+Circle.getArea());
    }
}
