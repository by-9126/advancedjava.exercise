package Bai4_3;

public class Main {
    public static void main(String[] args) {
        Point2D p2d = new Point2D(3, 4);
        System.out.println("Point2D: " + p2d);

        Point3D p3d = new Point3D(3, 4, 5);
        System.out.println("Point3D: " + p3d);

        p3d.setXYZ(7, 8, 9);
        System.out.println("Updated Point3D: " + p3d);
    }
}

