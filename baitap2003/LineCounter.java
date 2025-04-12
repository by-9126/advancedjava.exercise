package baitap2003;

import java.io.*;

public class LineCounter {
    public static void main(String[] args) {
        String filename = "input.txt";
        int lineCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            while (reader.readLine() != null) {
                lineCount++;
            }
            System.out.println("Số dòng trong file: " + lineCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
