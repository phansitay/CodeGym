package ss6_inheritance;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setX(x);
        super.setY(y);
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{super.getX(), super.getY(), z};
    }

    public String toString() {
        return Arrays.toString(getXYZ());
    }

    public static void main(String[] args) {
        Point3D p3 = new Point3D();
        p3.setX(5);
        p3.setZ(9);
        System.out.printf(" " + Arrays.toString(p3.getXYZ()));
        System.out.println(p3.toString());

    }
}
