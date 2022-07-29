package ss7_abstract_class_and_interface.Resizeable;

public class Square extends Shape implements Resizeable {
    private double width=1.0;
    public Square(){}
    public Square(double width,String color,boolean filler){
        super(color,filler);
        this.width=width;
    }
    public Square(float width){
        this.width=width;
    }

    public double getWidth() {
        return width;
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
        return "Square width = "+width+"\nSquare color = "+getColor()+"\nSquare Filler = "+isFilled();
    }
    public void resize(double percent) {
        width=width+(width*(percent/100));
        System.out.println("Width sau khi tang len "+percent+" % = "+width+"\nArea = "+getArea()+"\nPerimeter = "+getPerimeter());
    }
}
