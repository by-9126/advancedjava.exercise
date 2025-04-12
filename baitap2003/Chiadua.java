import java.util.concurrent.Semaphore;

class TrietGia extends Thread {
    private int id;
    private Semaphore[] dua;
    private Semaphore banAn; // Giới hạn số triết gia có thể ăn cùng lúc

    public TrietGia(int id, Semaphore[] dua, Semaphore banAn) {
        this.id = id;
        this.dua = dua;
        this.banAn = banAn;
    }

    public void run() {
        try {
            while (true) {
                suyNghi();

                // Chờ đến lượt ăn, đảm bảo không quá 4 triết gia ăn cùng lúc
                banAn.acquire();

                // Lấy đũa bên trái
                dua[id].acquire();
                System.out.println("Triết gia " + id + " đã cầm đũa bên trái.");

                // Lấy đũa bên phải
                dua[(id + 1) % 5].acquire();
                System.out.println("Triết gia " + id + " đã cầm đũa bên phải.");

                // Ăn
                an();

                // Trả đũa bên trái
                dua[id].release();
                System.out.println("Triết gia " + id + " đã đặt đũa bên trái.");

                // Trả đũa bên phải
                dua[(id + 1) % 5].release();
                System.out.println("Triết gia " + id + " đã đặt đũa bên phải.");

                // Giải phóng vị trí ăn để triết gia khác có thể ăn
                banAn.release();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void suyNghi() throws InterruptedException {
        System.out.println("Triết gia " + id + " đang suy nghĩ...");
        Thread.sleep((int)(Math.random() * 1000));
    }

    private void an() throws InterruptedException {
        System.out.println("Triết gia " + id + " đang ăn...");
        Thread.sleep((int)(Math.random() * 1000));
    }
}

class BaiToan5TrietGia {
    public static void main(String[] args) {
        Semaphore[] dua = new Semaphore[5];
        Semaphore banAn = new Semaphore(4); // Giới hạn tối đa 4 triết gia ăn cùng lúc

        for (int i = 0; i < 5; i++) {
            dua[i] = new Semaphore(1); // Mỗi đũa chỉ cho phép 1 triết gia cầm
        }

        for (int i = 0; i < 5; i++) {
            new TrietGia(i, dua, banAn).start();
        }
    }
}