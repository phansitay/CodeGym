package ss7_abstract_class_and_interface.Resizeable;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        //System.out.println(circle);
        //circle = new Circle(3.5);
        circle.setRadius(5);
        System.out.println("Radius = "+circle.getRadius());
        System.out.printf("\nArea truoc khi tang = "+circle.getArea());
        System.out.printf("\nPerimeter truoc khi tang = "+circle.getPerimeter()+"\n");
        circle.resize(5.0);
        System.out.printf("\nArea sau khi tang = "+circle.getArea());
        System.out.printf("\nPerimeter sau khi tang ="+circle.getPerimeter());
        //System.out.println(circle);


//
//        circle = new Circle(3.5, "indigo", false);
//        System.out.println(circle);
    }
}