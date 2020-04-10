package com.blank.practice.controller;

/**
 * @author 秦菊
 * @version 1.0
 * @date 2020/4/8 17:01
 */

public class TemplateMethod {
    public static void main(String[] args) {
        TemplateMethod t1 = new TemplateMethod() {
            @Override
            protected void wrapPrint(String message) {
                System.out.println("*" + message + "*");
            }
        };
        t1.print("hello thread");

        TemplateMethod t2 = new TemplateMethod() {
            @Override
            protected void wrapPrint(String message) {
                System.out.println("+" + message + "+");
            }
        };
        t2.print("hello thread");
    }

    public final void print(String message) {
        System.out.println("******");
        wrapPrint(message);
        System.out.println("******");

    }

    protected void wrapPrint(String message) {

    }


}
