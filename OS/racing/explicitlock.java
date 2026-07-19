package OS.racing;

import java.util.concurrent.locks.ReentrantLock;

public class explicitlock {
    static int count = 0;
    private static final ReentrantLock lockKey = new ReentrantLock();
    public static void main(String[] args) {
        Runnable task = () -> {
            for(int i=0; i< 1000000; i++) {
                lockKey.lock();
                try {
                    count++;
                } finally {
                    lockKey.unlock(); 
                }
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);

        t1.start();
        t2.start();
        t3.start();
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (Exception e) {

        }

        System.out.println("Final Counter Value: " + count);
    }
}
