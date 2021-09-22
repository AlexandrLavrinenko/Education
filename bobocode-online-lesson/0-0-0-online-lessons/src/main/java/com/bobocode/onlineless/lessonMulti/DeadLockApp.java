package com.bobocode.onlineless.lessonMulti;

import lombok.SneakyThrows;

import java.util.concurrent.TimeUnit;

/**
 * java-fundamentals-course
 *
 * Example of receipt DeadLock
 */
public class DeadLockApp {

    @SneakyThrows
    public static void main(String[] args) {
        var s1 = new Statistics();
        var s2 = new Statistics();

        var t1 = new Thread(() -> {
            synchronized (s1) {
                sleepSeconds(4);
                s2.increment();
            }
        });

        var t2 = new Thread(() -> {
            synchronized (s2) {
                s1.increment();
            }
        });

        var statePrinter = new Thread(() -> {
            while (true) {
                System.out.println("state t1: " + t1.getState());
                System.out.println("state t2: " + t2.getState() + "\n");
                sleepSeconds(3);
            }
        });

        statePrinter.start();

        t1.start();
        t2.start();
        t1.join();
        t2.join();

    }

    @SneakyThrows
    public static void sleepSeconds(int seconds) {
        TimeUnit.SECONDS.sleep(seconds);
    }

}
