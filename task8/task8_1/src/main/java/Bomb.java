import java.util.function.Consumer;

public class Bomb implements Runnable {

    public void run(){

        bombTimer( s -> {
            try {
                Thread.sleep(1000);
                System.out.println(s);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
         });

    }

    private void bombTimer( Consumer<String> s) {
        Integer n = 10;

        while(n >= 0) {
            s.accept(n.toString());
            n--;

            if (n < 0) {
               s.accept("Bomb");
            }
        }
    }
}
