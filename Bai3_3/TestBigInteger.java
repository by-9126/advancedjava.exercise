package Bai3_3;
import java.math.BigInteger;

public class TestBigInteger {
    public static void main(String[] args) {
        BigInteger i1 = new BigInteger("1111111111111111111111111111111111111111111111111111111111111111");
        BigInteger i2 = new BigInteger("2222222222222222222222222222222222222222222222222222222222222222");

        BigInteger sum = i1.add(i2);
        BigInteger product = i1.multiply(i2);

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}
