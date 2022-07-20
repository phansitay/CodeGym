package ss4_class_and_object_in_java;

import java.util.Scanner;

public class QuadraticEquation {
    private double a,b,c;
    public QuadraticEquation(){}
    public QuadraticEquation(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double getDiscriminant(){
        double delta;
        delta=b*b-(4*a*c);
        return delta;
    }
    public void calculateQuadraticEquation(){
        Scanner kb=new Scanner(System.in);
        System.out.printf("Nhập hệ số a : ");
        a=kb.nextDouble();
        System.out.printf("Nhập hệ số b : ");
        b=kb.nextDouble();
        System.out.printf("Nhập hệ số c : ");
        c=kb.nextDouble();

        if(a==0){
            System.out.printf("Phương trình có 1 nghiệm là x = "+(-c/b));
        }else {
            if(getDiscriminant()>=0){
                System.out.println("Phương trình có 2 nghiệm phân biệt là : ");
                System.out.printf("Nghiệm x1 = "+((-b+(Math.pow(getDiscriminant(),0.5)))/(2*a)));
                System.out.printf("Nghiệm x2 = "+((-b-(Math.pow(getDiscriminant(),0.5)))/(2*a)));
            }
            else{
                if(getDiscriminant()==0){
                    System.out.printf("Phương trình có nghiệm kép x = "+(-b/(2*a)));
                }else {
                    System.out.printf("Phương trình vô nghiệm ");
                }
            }
        }
    }
    public static void main(String[] args) {
        QuadraticEquation qe=new QuadraticEquation();
        qe.calculateQuadraticEquation();

    }
}
