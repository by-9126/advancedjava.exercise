package Bai2_7;

public class TestMain {
    public static void main(String[] args) {

        MyPoint p1 = new MyPoint(1, 2);
        MyPoint p2 = new MyPoint(4, 6);

        MyLine line = new MyLine(p1, p2);

        System.out.println(line); // MyLine[begin=(1,2),end=(4,6)]

        System.out.println("Length: " + line.getLength());

        System.out.println("Gradient: " + line.getGradient());

        line.setBeginXY(2, 3);
        line.setEndXY(5, 7);
        System.out.println("Updated line: " + line);
    }
}

