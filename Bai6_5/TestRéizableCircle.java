package Bai6_5;

public class TestRéizableCircle {
    public static void main(String[] args) {
        ResizableCircle resizableCircle = new ResizableCircle(10.0);
        System.out.println("Before resize: " + resizableCircle);
        System.out.println("Perimeter: " + resizableCircle.getPerimeter());
        System.out.println("Area: " + resizableCircle.getArea());

        resizableCircle.resize(50); // Increase radius by 50%
        System.out.println("After resize: " + resizableCircle);
        System.out.println("New Perimeter: " + resizableCircle.getPerimeter());
        System.out.println("New Area: " + resizableCircle.getArea());
    }
}