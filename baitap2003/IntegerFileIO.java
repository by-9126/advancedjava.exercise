package baitap2003;

import java.io.*;

public class IntegerFileIO {
    public static void main(String[] args) {
        String filename = "numbers.dat";

        // Ghi danh sách số nguyên vào file
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename))) {
            for (int i = 1; i <= 10; i++) {
                dos.writeInt(i);
            }
            System.out.println("Ghi danh sách số nguyên thành công!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Đọc lại danh sách số nguyên từ file
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filename))) {
            System.out.println("Danh sách số nguyên trong file:");
            while (dis.available() > 0) {
                System.out.print(dis.readInt() + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
