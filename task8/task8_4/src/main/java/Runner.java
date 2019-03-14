import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class Runner {

    private static long N = 1_000_000L;
    private static final int NUM_THREADS = 8;
    private static final int MAX_NUM_COUNT = 20;
    private static int[]array = new int[(int)N];


    static class RecursiveSum extends RecursiveTask<Long> {
        int from, to;

        public RecursiveSum(int from, int to){
            this.from = from;
            this.to = to;

        }

        public Long compute(){

            if( to - from <= MAX_NUM_COUNT){
                long localSum = 0;
                //random this part of array
                random(from, to);
                //calculate sum of this part
                for(int i = from; i < from + (to - from); i++){
                     localSum += array[i];
                }

                System.out.println("Summ between" + from + " - " + to + " is " + localSum);

                return localSum;
            }else{
             //   System.out.println(i++);
                int mid = (to+from)/2;
                //create new thread for first half
                RecursiveSum firstHalf = new RecursiveSum(from,mid-1);
                firstHalf.fork();
                //count the result of second half in this thread
                RecursiveSum secondHalf = new RecursiveSum(mid,to);
                long resultSecond = secondHalf.compute();
                //return sum of this parts
                return firstHalf.join() + resultSecond;
            }
        }

        public void random(int from, int to){
           for(int i = from; i < from + (to - from); i++){
                array[i] = (int)(Math.random()* 100);
           }
        }

    }

    public void run(){

        ForkJoinPool pool = new ForkJoinPool(NUM_THREADS);
        long computedSum = pool.invoke(new RecursiveSum(0,(int) N));
        System.out.print(computedSum);
    }

}
