package Task35_36;

import java.util.Random;

public class myNewThread implements Runnable{
    private final String threadName;


    public myNewThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        try {
            //String threadName = Thread.currentThread().getName();
            System.out.println("starting: " + threadName);
            int sleepingTime = new Random().nextInt(2000);
            System.out.println("Random value: " + sleepingTime + " for " + threadName);
//            while(!Thread.interrupted()) {
                System.out.println("sleeping" + threadName);
                Thread.sleep(sleepingTime);
//            }
            System.out.println("Running" + threadName);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
