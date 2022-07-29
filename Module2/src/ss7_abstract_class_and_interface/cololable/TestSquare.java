package ss7_abstract_class_and_interface.cololable;

public class TestSquare {
    public static void main(String[] args) {
        Square square = new Square();
        square.setWidth(20);
        square.setColor("black");
//        System.out.println("Width = "+square.getWidth());
//        System.out.println("Area = "+square.getArea());
//        System.out.println("Perimeter = "+square.getPerimeter());
        square.setFilled(true);
        square.howToColor();
        System.out.println(square);
    }
}
