package bt6_1;

public class TestMain {
    public static void main(String[] args) {

        Shape s1 = new Circle(5.5, "blue", false);
        System.out.println(s1);
        System.out.println("Area: " + s1.getArea());
        System.out.println("Perimeter: " + s1.getPerimeter());


        Circle c1 = (Circle) s1;
        System.out.println(c1);
        System.out.println("Radius: " + c1.getRadius());


        Shape s2 = new Rectangle(2.0, 3.0, "green", true);
        System.out.println(s2);
        System.out.println("Area: " + s2.getArea());
        System.out.println("Perimeter: " + s2.getPerimeter());


        Rectangle r1 = (Rectangle) s2;
        System.out.println(r1);
        System.out.println("Width: " + r1.getWidth());
        System.out.println("Length: " + r1.getLength());


        Shape s3 = new Square(4.0, "yellow", true);
        System.out.println(s3);
        System.out.println("Area: " + s3.getArea());
        System.out.println("Perimeter: " + s3.getPerimeter());


        Square sq1 = (Square) s3;
        System.out.println(sq1);
        System.out.println("Side: " + sq1.getSide());
    }
}

