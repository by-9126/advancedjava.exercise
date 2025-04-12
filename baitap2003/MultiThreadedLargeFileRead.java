package baitap2003;

import java.io.RandomAccessFile;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MultiThreadedLargeFileRead {
    public static void main(String[] args) {
        String filePath = "largefile.txt";
        int chunkSize = 1024 * 1024; // 1MB mỗi phần

        File file = new File(filePath);
        long fileSize = file.length();
        int numThreads = (int) Math.ceil((double) fileSize / chunkSize);

        Thread[] threads = new Thread[numThreads];

        for (int i = 0; i < numThreads; i++) {
            int chunkIndex = i;
            threads[i] = new Thread(() -> readChunk(filePath, chunkIndex, chunkSize));
            threads[i].start();
        }

        for (Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Đọc file hoàn tất!");
    }

    private static void readChunk(String filePath, int chunkIndex, int chunkSize) {
        try (RandomAccessFile raf = new RandomAccessFile(filePath, "r")) {
            raf.seek((long) chunkIndex * chunkSize);
            byte[] buffer = new byte[chunkSize];
            int bytesRead = raf.read(buffer);
            try (FileWriter writer = new FileWriter("chunk_" + chunkIndex + ".txt")) {
                writer.write(new String(buffer, 0, bytesRead));
            }
            System.out.println("Đọc phần " + chunkIndex + " hoàn tất.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

