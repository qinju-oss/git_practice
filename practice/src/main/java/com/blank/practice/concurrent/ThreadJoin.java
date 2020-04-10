package com.blank.practice.concurrent;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

/**
 * @author 秦菊
 * @version 1.0
 * @date 2020/4/10 17:22
 */

public class ThreadJoin {
    public static void main(String[] args) throws InterruptedException {
        List<Thread> threads = IntStream.range(1, 3).mapToObj(ThreadJoin::create).collect(toList());
        threads.forEach(Thread::start);
        for (Thread thread:threads){
            thread.join();
        }
        for (int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName() + "#" + i);
            shortSleep();
        }
    }

    private static Thread create(int seg) {
        return new Thread(()->
        {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "#" + i);
                shortSleep(); 
            }
        },String.valueOf(seg));
    }

    private static void shortSleep() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
