package ss4_class_and_object_in_java;

import java.util.Scanner;

public class Fan {
    final int SLOW =1;
    final int MEDIUM=2;
    final int FAST=3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
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
    public Fan(){
        this.speed=SLOW;
        this.on=false;
        this.radius=5;
        this.color="Blue";
    }
    public void input(){
        Scanner kb=new Scanner(System.in);
        System.out.printf("Bạn muốn bật quạt hay tắt quạt : (true để bật) (false để tắt) : ");
        on=kb.nextBoolean();
        kb.nextLine();
        if(on==true) {
            System.out.printf("Chọn tốc độ quạt mà bạn muốn bật:\n(1).SLOW \n(2).MEDIUM\n(3).FAST ");
            speed = kb.nextInt();
            kb.nextLine();
            System.out.printf("Nhập màu sắc quạt mà bạn muốn bật: ");
            color = kb.nextLine();
            System.out.printf("Nhập bán kính quạt mà bạn muốn bật : ");
            radius = kb.nextDouble();
        }
        else {
            System.out.printf("Nhập màu sắc quạt mà bạn muốn tắt: ");
            color=kb.nextLine();
            System.out.printf("Nhập bán kính quạt mà bạn muốn tắt : ");
            radius = kb.nextDouble();
        }
    }
    public void output(){
        System.out.printf("-------------THÔNG TIN QUẠT---------------\n");
        if (on==true){
            System.out.printf("Speed = "+speed+"\n");
            System.out.printf("Color = "+color+"\n");
            System.out.printf("Radius = "+radius+"\n");
            System.out.printf("fan is on");
        }else {
            System.out.printf("Color = "+color+"\n");
            System.out.printf("Radius = "+radius+"\n");
            System.out.printf("fan is off");
        }
    }
    public static void main(String[] args) {
        Fan f=new Fan();
        f.input();
        f.output();
    }
}
