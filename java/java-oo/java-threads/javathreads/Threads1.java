import runnables.MeuRunnable;

public class Threads1 {
    public static void main(String[] args) {
        //Thread atual
        var t = Thread.currentThread();
        System.out.println(t.getName());

        var t1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
        });
        //t1.run(); //executa na msm thread

        var t2 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
        });

        var t3 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
        });

        t1.start(); // executa em uma nova thread
        t2.start(); // executa em uma nova thread
        t3.start(); // executa em uma nova thread
    }
}
