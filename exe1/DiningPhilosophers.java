package nn;

public class DiningPhilosophers {
    public static void main(String[] args) {
        Chopstick[] chopsticks = new Chopstick[5];
        for (int i = 0; i < chopsticks.length; i++) {
            chopsticks[i] = new Chopstick();
        }

        Philosopher[] philosophers = new Philosopher[5];
        Thread[] philosopherThreads = new Thread[5];

        for (int i = 0; i < philosophers.length; i++) {
            philosophers[i] = new Philosopher(i, chopsticks[i], chopsticks[(i + 1) % 5]);
            philosopherThreads[i] = new Thread(philosophers[i]);
            philosopherThreads[i].start();
        }
    }
}
