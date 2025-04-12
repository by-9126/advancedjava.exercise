package bt6_2;


public class Circle implements GeometricObject {
    private double radius;


    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }


    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }


    @Override
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }


    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println(c);
        System.out.println("Diện tích: " + c.getArea());
        System.out.println("Chu vi: " + c.getPerimeter());
    }
}

