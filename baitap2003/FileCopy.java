package baitap2003;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        String inputFile = "input.txt";  // Tên file đầu vào
        String outputFile = "output.txt"; // Tên file đầu ra

        try (FileInputStream fis = new FileInputStream(inputFile);
             FileOutputStream fos = new FileOutputStream(outputFile)) {

            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
            System.out.println("Sao chép file thành công!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

