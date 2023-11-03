import java.util.Objects;

public class Syncronizaed1 {

    static int i = -1;

    public static void main(String[] args) {
        var runable = new MyRunnable();

        var t0 = new Thread(runable);
        var t1 = new Thread(runable);
        var t2 = new Thread(runable);
        var t3 = new Thread(runable);
        var t4 = new Thread(runable);

        t0.start();
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }


    public static  class MyRunnable implements Runnable {
        static Object lock1 = new Object();
        static Object lock2 = new Object();

        @Override
        public void run() {
            synchronized(lock1){
                i++;
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }

            synchronized(lock2){
                i++;
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }
    }
}
