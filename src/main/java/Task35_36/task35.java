package Task35_36;

import java.util.concurrent.TimeUnit;

public class task35 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new myNewThread("job-1"));
        Thread thread2 = new Thread(new myNewThread("job-2"));
        thread1.start();
        TimeUnit.SECONDS.sleep(20);
        thread1.interrupt();
    }
}
