package com.blank.practice.controller;


import java.util.concurrent.TimeUnit;

/**
 * @author 秦菊
 * @version 1.0
 * @date 2020/4/8 17:01
 */

public class TyrConcurrent {
    public static void main(String[] args) {

        // enjoyMusic();
        new Thread(() -> enjoyMusic()).start();
        browseNews();
    }

    private static void browseNews() {
        for (; ; ) {
            System.out.println("the good news");
            sleep(1);
        }
    }

    private static void enjoyMusic() {
        for (; ; ) {
            System.out.println("the nice music");
            sleep(1);
        }
    }

    private static void sleep(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
