package Bai2_8;

public class TestMain {
    public static void main(String[] args) {

        MyPoint p1 = new MyPoint(3, 4);
        MyPoint p2 = new MyPoint(6, 8);

        System.out.println("Point 1: " + p1); // (3,4)
        System.out.println("Point 2: " + p2); // (6,8)

        System.out.println("Distance from p1 to (0,0): " + p1.distance(0, 0));
        System.out.println("Distance from p1 to p2: " + p1.distance(p2));
    }
}



