package baitap2003;

import java.io.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class KeywordSearch {
    public static void main(String[] args) {
        String keyword = "Java";
        String[] files = {"file1.txt", "file2.txt"};

        ExecutorService executor = Executors.newFixedThreadPool(files.length);

        for (String file : files) {
            executor.execute(() -> searchKeyword(file, keyword));
        }
        executor.shutdown();
    }

    private static void searchKeyword(String fileName, String keyword) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            int count = 0;
            while ((line = reader.readLine()) != null) {
                if (line.contains(keyword)) {
                    count++;
                }
            }
            System.out.println("Từ khóa '" + keyword + "' xuất hiện " + count + " lần trong " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
