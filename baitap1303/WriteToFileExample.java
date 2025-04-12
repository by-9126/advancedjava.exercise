import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class WriteToFileExample {
    public static void main(String[] args) {
        String fileName ="C:\\Users\\Acer\\Downloads\\file.txt";

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileWriter writer = new FileWriter(fileName)) {

            System.out.println("Nhập nội dung bạn muốn ghi vào file (gõ 'exit' để thoát):");
            String inputLine;
            while (!(inputLine = reader.readLine()).equalsIgnoreCase("exit")) {
                writer.write(inputLine + System.lineSeparator());
            }

            System.out.println("Nội dung đã được ghi vào file " + fileName);
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi: " + e.getMessage());
        }
    }
}
