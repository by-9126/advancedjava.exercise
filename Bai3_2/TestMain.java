package Bai3_2;
import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập bậc của đa thức 1: ");
        int degree1 = sc.nextInt();
        double[] coeffs1 = new double[degree1 + 1];
        for (int i = 0; i <= degree1; i++) {
            System.out.print("Hệ số bậc " + i + ": ");
            coeffs1[i] = sc.nextDouble();
        }
        MyPolynomial poly1 = new MyPolynomial(coeffs1);

        System.out.print("Nhập bậc của đa thức 2: ");
        int degree2 = sc.nextInt();
        double[] coeffs2 = new double[degree2 + 1];
        for (int i = 0; i <= degree2; i++) {
            System.out.print("Hệ số bậc " + i + ": ");
            coeffs2[i] = sc.nextDouble();
        }
        MyPolynomial poly2 = new MyPolynomial(coeffs2);

        System.out.println("Đa thức 1: " + poly1);
        System.out.println("Đa thức 2: " + poly2);
        System.out.println("Tổng: " + poly1.add(poly2));
        System.out.println("Tích: " + poly1.multiply(poly2));

        System.out.print("Nhập giá trị x để tính giá trị của đa thức 1: ");
        double x = sc.nextDouble();
        System.out.println("Kết quả: " + poly1.evaluate(x));

        sc.close();
    }
}
