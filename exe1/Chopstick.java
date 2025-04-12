package nn;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Chopstick {
    private final Lock lock = new ReentrantLock(); // Đũa được bảo vệ bởi ReentrantLock

    public boolean pickUp() {
        return lock.tryLock(); // Cố gắng cầm đũa, nếu có thể thì tiếp tục
    }

    public void putDown() {
        lock.unlock(); // Đặt đũa xuống
    }
}
