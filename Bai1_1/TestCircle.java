import Bai1_1.Circle;

public class TestCircle {
    public static void main(String[] args){
        Circle c = new Circle();
        System.out.println("Bán kính "+c.getRadius()+" và Diện tích "+c.getArea());
        Circle c1 =new Circle(2);
        System.out.println("Bán kính "+c1.getRadius()+" và Diện tích "+c1.getArea());
        Circle c2 =new Circle();
        c2.setRadius(3);
        System.out.println("BK : "+c2.getRadius());
        c2.setColor("green");
        System.out.println("Color : "+c2.getColor());
        Circle c3 =new Circle(5.5);
        System.out.println(c3.toString());
        Circle c4 =new Circle(6.6);
        System.out.println(c4.toString());
        System.out.println(c4);
        System.out.println("Toán tử '+' cũng gọi toString(): "+c4);
    }
}
