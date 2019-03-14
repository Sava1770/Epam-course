package com.epam;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class WorkMap {
    private  Map<Integer, Integer> map = new HashMap<>();
    private Map<Integer, Integer> concurrentMap = new ConcurrentHashMap<>();
  //  private final Object MONITOR = new Object();

    public void run(){
   //     WorkMap m = new WorkMap();

     //  new Thread( () -> m.hashMap());
      // new Thread( () -> m.concurrentMap());
        hashMap();
        concurrentMap();
    }

    private void  hashMap(){
        for(int i = 0; i < 10; i++) {
            int j = i;

            Thread t1 = new Thread(() -> {
                    map.put(j, j);

            });

            Thread t2 = new Thread(() -> {
                    System.out.println(map.get(j));
            });

            try{
            t1.start();
            t1.join();
            t2.start();
            t2.join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
    }
    }


    private void concurrentMap(){
        for(int i = 90; i < 100; i++){
            int j = i;

            Thread t1 = new Thread(() -> {
                    concurrentMap.put(j,j);
            });

            Thread t2 = new Thread(() -> {
                    System.out.println(concurrentMap.get(j));
            });

             try{
               t1.start();
               t1.join();
               t2.start();
               t2.join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
