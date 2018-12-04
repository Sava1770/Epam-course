
public class Runner {

    private static final int MAX_VALUE = 1000;
    private static final Object MONITOR = new Object();

    private static int value = 0;
    private static volatile boolean flag = true;

    public static void count(){

        Thread producer = new Thread(() -> {
            synchronized (MONITOR) {
                try {
                    while (value < MAX_VALUE) {
                        increment();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread consumer = new Thread(() -> {
            synchronized (MONITOR) {
                try {
                    while (value < MAX_VALUE) {
                        print();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });


        producer.start();
        consumer.start();

       //producer.join();
       //consumer.join();
    }

    private static void increment() throws InterruptedException {
        while (flag) {
            MONITOR.wait();
        }

        value++;
        flag = true;

        MONITOR.notify();
    }

    private static void print() throws InterruptedException {
        while (!flag) {
            MONITOR.wait();
        }

        System.out.print(value + " ");
        flag = false;

        MONITOR.notify();
    }
}
