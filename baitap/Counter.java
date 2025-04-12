package baitap1303;

class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class SharedCounter {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final counter value: " + counter.getCount());
    }
}
class Resource {
}

class DeadLockExample {
    public static void main(String[] args) {
        Resource r1 = new Resource();
        Resource r2 = new Resource();

        Thread t1 = new Thread(() -> {
            synchronized (r1) {
                System.out.println("Thread 1: Locked r1");
                try { Thread.sleep(100); } catch (InterruptedException e) {}

                synchronized (r2) {
                    System.out.println("Thread 1: Locked r2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (r2) {
                System.out.println("Thread 2: Locked r2");
                try { Thread.sleep(100); } catch (InterruptedException e) {}

                synchronized (r1) {
                    System.out.println("Thread 2: Locked r1");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
