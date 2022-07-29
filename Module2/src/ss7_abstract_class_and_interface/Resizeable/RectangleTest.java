package ss7_abstract_class_and_interface.Resizeable;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
//        System.out.println(rectangle);
//
//        rectangle = new Rectangle(2.3, 5.8);
//        System.out.println(rectangle);
//
//        rectangle = new Rectangle(2.5, 3.8, "orange", true);
//        System.out.println(rectangle);
        rectangle.setWidth(5);
        rectangle.setLength(7);
        System.out.println("Width = "+rectangle.getWidth()+"\nLenght = "+rectangle.getLength());
        System.out.println("Area truoc khi tang = "+rectangle.getArea());
        System.out.println("Perimeter truoc khi tang = "+rectangle.getPerimeter());
        rectangle.resize(10);
        System.out.println("Area sau khi tang = "+rectangle.getArea());
        System.out.println("Perimeter sau khi tang = "+rectangle.getPerimeter());

    }
}
