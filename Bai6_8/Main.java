package bt6_8;

public class Main {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0, 0, 2, 2);
        System.out.println(point);
        point.moveRight();
        point.moveUp();
        System.out.println("After moving: " + point);

        MovableCircle circle = new MovableCircle(5, 5, 1, 1, 10);
        System.out.println(circle);
        circle.moveLeft();
        circle.moveDown();
        System.out.println("After moving: " + circle);
    }
}
