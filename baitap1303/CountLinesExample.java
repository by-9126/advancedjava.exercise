import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountLinesExample {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\Acer\\Downloads\\file.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            int lineCount = 0;
            while (reader.readLine() != null) {
                lineCount++;
            }

            System.out.println("Số dòng trong file " + fileName + ": " + lineCount);
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi: " + e.getMessage());
        }
    }
}
