package ss7_abstract_class_and_interface.comperator;

public class Rectangle extends Shape implements Resizeable {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
        return "Rectangle Width = "+width+"\nRectangle lenght = "+length+"\nRectangle color = "+getColor()+"\nRectangle Filler = "+isFilled();
    }

    @Override
    public void resize(double percent) {
        width=width+(width*(percent/100));
        length=length+(length*(percent/100));
        System.out.println("width sau khi tang len "+percent+" % = "+width+"\nlenght sau khi tang len "+percent+" % = "+length+"\nArea = "+getArea()+"\nPerimeter = "+getPerimeter());
    }
}