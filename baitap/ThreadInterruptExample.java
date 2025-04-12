package baitap1303;

public class ThreadInterruptExample {
    public static void main(String[] args) {
        Thread infiniteLoop = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Running...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted!");
                    break;
                }
            }
        });

        infiniteLoop.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {}

        infiniteLoop.interrupt();
    }
}