package baitap2003;

import java.io.File;

public class ListFiles {
    public static void main(String[] args) {
        String directoryPath = "."; // Thư mục hiện tại
        File directory = new File(directoryPath);

        if (directory.isDirectory()) {
            String[] files = directory.list();
            if (files != null) {
                System.out.println("Danh sách file trong thư mục:");
                for (String file : files) {
                    System.out.println(file);
                }
            } else {
                System.out.println("Thư mục rỗng hoặc không thể đọc.");
            }
        } else {
            System.out.println("Đây không phải là thư mục hợp lệ.");
        }
    }
}
