package ss7_abstract_class_and_interface.Resizeable;

public class ShapeTest {

    public static void main(String[] args) {
//        Shape shape = new Shape();
//        System.out.println(shape);
//
//        shape = new Shape("red", false);
//        System.out.println(shape);
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5, "blue", true);
        shapes[1] = new Rectangle(4, 5, "black", true);
        shapes[2] = new Square(5, "red", true);
        for (Shape shape : shapes) {
            System.out.println();
            System.out.println(shape);
            if (shape instanceof Circle) {
                ((Circle) shape).resize(20);
            }
            if (shape instanceof Rectangle) {
                ((Rectangle) shape).resize(20);
            }
            if (shape instanceof Square)
                ((Square) shape).resize(20);
        }
    }
}
