package com.bobocode.onlineless.lessonMulti.thread_states;

import com.bobocode.onlineless.lessonMulti.Statistics;
import lombok.SneakyThrows;

import java.util.concurrent.TimeUnit;

/**
 * Education
 *
 * @author Alexandr.Lavrinenko@gmail.com
 * @version 1.0
 * @since 22.09.2021
 */
public class ThreadStatesDemo {
    @SneakyThrows
    public static void main(String[] args) {
        var s1 = new Statistics();
        var s2 = new Statistics();
        var t = newState(s1, s2);
        var runnableT = runnableState(t);
        var blockedT = blockedState(runnableT, s1, s2);
    }

    @SneakyThrows
    private static Thread newState(Statistics s1, Statistics s2) {
        Thread t1 = new Thread(() -> {
            synchronized (s2) {
                try {
                    sleepSeconds(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                s1.increment();
            }
        });
        printState(1, t1);
        return t1;
    }

    private static Thread runnableState(Thread t) {
        t.start();
        printState(2, t);
        return t;
    }

    private static Thread blockedState(Thread t1, Statistics s1, Statistics s2) {
        Thread t2 = new Thread(() -> {
            synchronized (s1) {
                s2.increment();
            }
        });
        t2.start();
        printState(3,t1);
        return t1;
    }

    private static void waitingState(Thread thread) {

    }

    private static void printState(int number, Thread t1) {
        System.out.println(number + " - " + t1.getState());
    }

    @SneakyThrows
    private static void sleepSeconds(int second) throws InterruptedException {
        TimeUnit.SECONDS.sleep(second);
    }
}
