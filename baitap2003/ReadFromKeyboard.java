package baitap2003;

import java.io.*;

public class ReadFromKeyboard {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileWriter writer = new FileWriter("keyboard_output.txt")) {

            System.out.println("Nhập nội dung (gõ 'exit' để dừng): ");
            String line;
            while (!(line = reader.readLine()).equalsIgnoreCase("exit")) {
                writer.write(line + "\n");
            }
            System.out.println("Dữ liệu đã được ghi vào file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
