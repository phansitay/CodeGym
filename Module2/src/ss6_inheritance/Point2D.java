package ss6_inheritance;

import java.util.Arrays;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        return new float[]{x, y};
    }

    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }

    public static void main(String[] args) {
        Point2D p2 = new Point2D();
        p2.setXY(5, 6);
//        System.out.printf("hello" + p2.getXY() + "\n");
//        for (int i = 0; i < p2.getXY().length; i++) {
//            System.out.printf(" " + p2.getXY()[i]);
//        }
        System.out.println(Arrays.toString(p2.getXY()));
        System.out.println(p2);
    }
}
