package ss7_abstract_class_and_interface.cololable;

public class Square extends Shape implements Colorable{
    private double width=1.0;
    public Square(){}
    public Square(float width){
        this.width=width;
    }

    public double getWidth() {
        return width;
    }
    public Square(float width, String color, boolean filler){
        super(color,filler);
        this.width=width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea(){
        return width*width;
    }
    public double getPerimeter(){
        return width*4;
    }
    @Override
    public String toString(){
        return  "Square width = "+width+"\nSquare Color = "+getColor()+"\nSquare Filler = "+isFilled();
    }
    public void howToColor() {
        setColor("Color all four sides");
        System.out.println(super.getColor());
    }
}
