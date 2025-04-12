package Bai5_2;

public class TestMain {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        System.out.println(c1);

        Cylinder c2 = new Cylinder(3.0, 5.0);
        System.out.println(c2);

        Cylinder c3 = new Cylinder(2.5, "blue", 7.0);
        System.out.println(c3); 
    }
}
