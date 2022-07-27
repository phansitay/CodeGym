package ss6_inheritance;

import java.nio.FloatBuffer;
import java.util.Arrays;

public class MovablePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
    public MovablePoint(float x,float y,float xSpeed,float ySpeed){
        super(x,y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public MovablePoint(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public MovablePoint(){}

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public  void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float[] getSpeed(){
        return new float[]{xSpeed,ySpeed};
    }
    public String toString(){
        return Arrays.toString(getXY())+" Speed = "+Arrays.toString(getSpeed());
    }
    public MovablePoint move(){
        super.setX(getX()+xSpeed);
        super.setY(getY()+ySpeed);
        return this;
    }
    public static void main(String[] args) {
        MovablePoint m=new MovablePoint();
        m.setX(4);
        m.setY(10);
        m.setxSpeed(5);
        m.setySpeed(7);

        System.out.printf(" "+ Arrays.toString(m.getSpeed()));
        System.out.printf("\n"+m.toString());
        System.out.printf("\n"+m.move());

    }
}
