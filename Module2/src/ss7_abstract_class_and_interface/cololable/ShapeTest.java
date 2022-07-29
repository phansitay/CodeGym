package ss7_abstract_class_and_interface.cololable;

public class ShapeTest {

    public static void main(String[] args) {
//        Shape shape = new Shape();
//        System.out.println(shape);
//
//        shape = new Shape("red", false);
//        System.out.println(shape);
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3, "red", true);
        shapes[1] = new Rectangle(4, 5, "blue", false);
        shapes[2] = new Square(8, "while", true);
        Shape shapeS = new Square();
        for (Shape shape : shapes) {
            if (shape instanceof Square) {
                System.out.println(shape);
                ((Square) shape).howToColor();
            }
            else {
                System.out.println(shape);
            }
        }
    }
}
