package OS.racing;

import java.util.concurrent.atomic.AtomicInteger;

public class atomic {
    static private final AtomicInteger count = new AtomicInteger(0);
    public static void main(String[] args) {
        Runnable task = () -> {
            for(int i=0; i< 1000000; i++) {
                count.incrementAndGet();
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
