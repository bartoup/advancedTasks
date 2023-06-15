package Task34;

import java.util.Random;

public class MyThread extends Thread{
    @Override
    public void run() {

        try {
            String threadName = Thread.currentThread().getName();
            System.out.println("starting: " + threadName);
            int sleepingTime = new Random().nextInt(2000);
            System.out.println("Random value: " + sleepingTime + " for " + threadName);
            System.out.println("sleeping" + threadName);
            Thread.sleep(sleepingTime);
            System.out.println("Running" + threadName);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
