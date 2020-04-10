package com.blank.practice.concurrent;

import javax.validation.constraints.Max;

/**
 * @author 秦菊
 * @version 1.0
 * @date 2020/4/10 11:10
 */

public class TicketWindowRunnable implements Runnable {
    private int index = 1;
    private final static int MAX = 50;

    @Override
    public void run() {
        while (index <= MAX) {
            System.out.println(Thread.currentThread().getName() + "的号码是：" + (index++));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        final TicketWindowRunnable t=new TicketWindowRunnable();
        Thread t1=new Thread(t,"一号窗口");
        Thread t2=new Thread(t,"二号窗口");
        Thread t3=new Thread(t,"三号窗口");
        Thread t4=new Thread(t,"四号窗口");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
