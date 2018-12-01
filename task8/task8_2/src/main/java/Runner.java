

public class Runner implements Runnable {
    private static Integer value = 0;
    private final int MAX_VALUE = 1000;
    private static boolean flag = true;

    public void run() {

        Thread counter = new Thread(() -> {
         synchronized (this){
             try{
                 while(Runner.value < MAX_VALUE){
                     count();
                     Runner.flag = true;
                 }
             }catch(InterruptedException e){
                 e.printStackTrace();
             }

         }
     } );

        Thread printer = new Thread(() -> {
            synchronized (this){
                try{
                    while(Runner.value < MAX_VALUE){
                        print();
                        Runner.flag = false;
                    }
                }catch(InterruptedException e){
                    e.printStackTrace();
                }

            }
        } );


        counter.start();
        printer.start();

    }

    private void count() throws InterruptedException {
        while (Runner.flag){
            wait();
        }

        Runner.value++;
        notify();
    }

    private void print() throws InterruptedException {
        while (!Runner.flag){
            wait();
        }

        System.out.print(Runner.value + " ");
        notify();
    }


}
