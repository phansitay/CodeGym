package ss7_abstract_class_and_interface.Resizeable;

public class TestSquare {
    public static void main(String[] args) {
        Square square=new Square();
        square.setWidth(12);
        System.out.println("Width = "+square.getWidth());
        System.out.println("Area truoc khi tang = "+square.getArea());
        System.out.println("Perimeter truoc khi tang = "+square.getPerimeter());
        square.resize(20);
        System.out.println("Area sau khi tang :  "+square.getArea());
        System.out.println("Perimeter sau khi tang : "+square.getPerimeter());


    }
}
