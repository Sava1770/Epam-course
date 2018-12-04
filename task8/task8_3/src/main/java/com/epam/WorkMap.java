package com.epam;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class WorkMap {
    private  Map<Integer, Integer> map = new HashMap<>();
    private Map<Integer, Integer> concurentMap = new ConcurrentHashMap<>();
    private final Object MONITOR = new Object();

    public void run(){

        hashMap();
        concurentMap();
    }

    private void  hashMap(){
        for(int i = 0; i < 10; i++){
            int j = i;

            Thread t1 = new Thread(() -> {
                synchronized (MONITOR){
                    map.put(j,j);
                }
            });

            Thread t2 = new Thread(() -> {
                synchronized (MONITOR){
                    System.out.println(map.get(j));
                }
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


    private void concurentMap(){
        for(int i = 0; i < 10; i++){
            int j = i;

            Thread t1 = new Thread(() -> {
                    concurentMap.put(j,j);
            });

            Thread t2 = new Thread(() -> {
                    System.out.println(concurentMap.get(j));
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
