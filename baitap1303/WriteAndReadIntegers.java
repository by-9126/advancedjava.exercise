import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteAndReadIntegers {
    public static void main(String[] args) {
        String fileName ="C:\\Users\\Acer\\Downloads\\file.txt";

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            dos.writeInt(10);
            dos.writeInt(20);
            dos.writeInt(30);

            System.out.println("Đã ghi các số nguyên vào file.");
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi ghi file: " + e.getMessage());
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            System.out.println("Các số nguyên trong file:");
            while (dis.available() > 0) {
                System.out.println(dis.readInt());
            }
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi đọc file: " + e.getMessage());
        }
    }
}
