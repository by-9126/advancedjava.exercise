package bt6_4;


public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center; // Composition với MovablePoint


    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }


    @Override
    public void moveUp() {
        center.moveUp();
    }


    @Override
    public void moveDown() {
        center.moveDown();
    }


    @Override
    public void moveLeft() {
        center.moveLeft();
    }


    @Override
    public void moveRight() {
        center.moveRight();
    }


    @Override
    public String toString() {
        return "MovableCircle[center=" + center + ", radius=" + radius + "]";
    }


    public static void main(String[] args) {
        MovableCircle circle = new MovableCircle(0, 0, 2, 3, 5);
        System.out.println("Vị trí ban đầu: " + circle);

        circle.moveUp();
        System.out.println("Sau khi moveUp: " + circle);

        circle.moveDown();
        System.out.println("Sau khi moveDown: " + circle);

        circle.moveLeft();
        System.out.println("Sau khi moveLeft: " + circle);

        circle.moveRight();
        System.out.println("Sau khi moveRight: " + circle);
    }
}

