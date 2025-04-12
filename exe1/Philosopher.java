package nn;

class Philosopher implements Runnable {
    private final Chopstick leftChopstick;
    private final Chopstick rightChopstick;
    private final int philosopherNumber;

    public Philosopher(int philosopherNumber, Chopstick leftChopstick, Chopstick rightChopstick) {
        this.philosopherNumber = philosopherNumber;
        this.leftChopstick = leftChopstick;
        this.rightChopstick = rightChopstick;
    }

    private void think() throws InterruptedException {
        System.out.println("Triết gia " + philosopherNumber + " đang suy nghĩ.");
        Thread.sleep((int) (Math.random() * 1000)); // Suy nghĩ trong thời gian ngẫu nhiên
    }

    private void eat() throws InterruptedException {
        System.out.println("Triết gia " + philosopherNumber + " đang ăn.");
        Thread.sleep((int) (Math.random() * 1000)); // Ăn trong thời gian ngẫu nhiên
    }

    @Override
    public void run() {
        try {
            while (true) {
                think(); // Triết gia suy nghĩ

                // Cố gắng cầm cả hai chiếc đũa
                if (leftChopstick.pickUp()) {
                    System.out.println("Triết gia " + philosopherNumber + " cầm đũa bên trái.");
                    if (rightChopstick.pickUp()) {
                        try {
                            System.out.println("Triết gia " + philosopherNumber + " cầm đũa bên phải.");
                            eat(); // Triết gia ăn
                        } finally {
                            rightChopstick.putDown();
                            System.out.println("Triết gia " + philosopherNumber + " đặt đũa bên phải.");
                        }
                    }
                    leftChopstick.putDown();
                    System.out.println("Triết gia " + philosopherNumber + " đặt đũa bên trái.");
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        }
    }
}