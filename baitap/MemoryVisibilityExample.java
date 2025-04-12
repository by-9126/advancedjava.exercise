package baitap1303;

public class MemoryVisibilityExample {
    public static void main(String[] args) {
        SharedFlag sharedFlag = new SharedFlag();

        Thread writer = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
            sharedFlag.setFlagTrue();
            System.out.println("Flag set to true");
        });

        Thread reader = new Thread(() -> {
            while (!sharedFlag.getFlag()) {
                // Busy-waiting until flag is true
            }
            System.out.println("Reader saw flag change!");
        });

        writer.start();
        reader.start();
    }
}
class SharedFlag {
    private volatile boolean flag = false;

    public void setFlagTrue() {
        flag = true;
    }

    public boolean getFlag() {
        return flag;
    }
}