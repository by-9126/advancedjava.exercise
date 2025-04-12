package bt6_2;

public class TestMain {
    public static void main(String[] args) {
        GeometricObject circle = new Circle(5);
        GeometricObject rectangle = new Rectangle(4, 6);

        System.out.println(circle);
        System.out.println("Diện tích: " + circle.getArea());
        System.out.println("Chu vi: " + circle.getPerimeter());

        System.out.println(rectangle);
        System.out.println("Diện tích: " + rectangle.getArea());
        System.out.println("Chu vi: " + rectangle.getPerimeter());
    }
}

