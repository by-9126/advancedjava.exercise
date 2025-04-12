package Bai3_1;
import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập phần thực của số phức 1: ");
        double real1 = sc.nextDouble();
        System.out.print("Nhập phần ảo của số phức 1: ");
        double imag1 = sc.nextDouble();
        MyComplex c1 = new MyComplex(real1, imag1);

        System.out.print("Nhập phần thực của số phức 2: ");
        double real2 = sc.nextDouble();
        System.out.print("Nhập phần ảo của số phức 2: ");
        double imag2 = sc.nextDouble();
        MyComplex c2 = new MyComplex(real2, imag2);

        System.out.println("Số phức 1: " + c1);
        System.out.println("Số phức 2: " + c2);
        System.out.println("Số phức 1 là số thực? " + c1.isReal());
        System.out.println("Số phức 2 là số ảo? " + c2.isImaginary());
        System.out.println("Hai số phức có bằng nhau không? " + c1.equals(c2));
        System.out.println("Tổng: " + c1.add(c2));
        System.out.println("Hiệu: " + c1.subtract(c2));
        System.out.println("Tích: " + c1.multiply(c2));
        System.out.println("Thương: " + c1.divide(c2));
        System.out.println("Độ lớn của số phức 1: " + c1.magnitude());
        System.out.println("Góc của số phức 1 (radian): " + c1.argument());
        System.out.println("Liên hợp của số phức 1: " + c1.conjugate());

        sc.close();
    }
}
