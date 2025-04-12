package baitap2003;

import java.io.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreadedFileRead {
    public static void main(String[] args) {
        String[] inputFiles = {"input1.txt", "input2.txt"};
        String outputFile = "output.txt";

        ExecutorService executor = Executors.newFixedThreadPool(inputFiles.length);

        for (String file : inputFiles) {
            executor.execute(() -> {
                synchronized (MultiThreadedFileRead.class) {
                    writeToFile(file, outputFile);
                }
            });
        }
        executor.shutdown();
    }

    private static void writeToFile(String inputFile, String outputFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             FileWriter writer = new FileWriter(outputFile, true)) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line + "\n");
            }
            System.out.println("Đọc file " + inputFile + " hoàn tất.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

