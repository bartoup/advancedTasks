package Task34;

public class task34 {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();

        MyThread thread2 = new MyThread();
        thread1.start();
        thread2.start();
    }
}
