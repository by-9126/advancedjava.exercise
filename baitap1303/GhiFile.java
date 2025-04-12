import java.io.*;

public class GhiFile {
    public static void main(String[] args) {
        String tepNguon = "C:\\Users\\Downloads\\file.txt";
        String tepDich = "C:\\UsersAcer\\Downloads\\file1.txt";

        try (
                FileReader fr = new FileReader(tepNguon);
                BufferedReader br = new BufferedReader(fr);
                FileWriter fw = new FileWriter(tepDich);
                BufferedWriter bw = new BufferedWriter(fw);
        ) {
            String dong;
            while ((dong = br.readLine()) != null) {
                bw.write(dong);
                bw.newLine();
            }
            System.out.println("Sao chép tệp thành công từ " + tepNguon + " sang " + tepDich);
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi: " + e.getMessage());
        }
    }
}
