package Bai1_2;

public class TestCircle1 {
    public static void main(String[] args) {
                Circle1 c1 = new Circle1(1.1);
                System.out.println(c1);
                Circle1 c2 = new Circle1();
                System.out.println(c2);
                c1.setRadius(2.2);
                System.out.println(c1);
                System.out.println("bán kính là: " + c1.getRadius());
                System.out.printf("diện tích là: %.2f%n", c1.getArea());
                System.out.printf("chu vi là: %.2f%n", c1.getCircumference());
            }
        }
