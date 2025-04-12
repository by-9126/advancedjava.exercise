package baitap2003;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.io.*;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreadedURLDownloader {
    private static final String[] URLS = {
            "https://example.com/article1",
            "https://example.com/article2",
            "https://example.com/article3",
            "https://example.com/article4",
            "https://example.com/article5"
    };

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(URLS.length);

        for (int i = 0; i < URLS.length; i++) {
            int index = i;
            executor.execute(() -> downloadAndSave(URLS[index], "file" + (index + 1) + ".txt"));
        }

        executor.shutdown();
        while (!executor.isTerminated()) {}

        mergeFiles();
        System.out.println("Quá trình hoàn tất!");
    }

    private static void downloadAndSave(String url, String filename) {
        try {
            Document doc = Jsoup.connect(url).get();
            String textContent = doc.text(); // Loại bỏ thẻ HTML

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
                writer.write(textContent);
            }
            System.out.println("Tải về thành công: " + filename);
        } catch (IOException e) {
            System.err.println("Lỗi khi tải " + url + ": " + e.getMessage());
        }
    }

    private static void mergeFiles() {
        String outputFile = "merged_output.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            for (int i = 0; i < URLS.length; i++) {
                String filename = "file" + (i + 1) + ".txt";
                try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        writer.write(line);
                        writer.newLine();
                    }
                }
            }
            System.out.println("Tất cả file đã được hợp nhất vào " + outputFile);
        } catch (IOException e) {
            System.err.println("Lỗi khi gộp file: " + e.getMessage());
        }
    }
}

