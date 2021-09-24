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

    volatile static boolean isReady = false;

    @SneakyThrows
    public static void main(String[] args) {
        var s1 = new Statistics();
        var t = newState(s1);
        var runnableT = runnableState(t);
        blockedState(s1);
        waitingState(s1);
        timedWaitingState(s1);
        terminateState(t);
    }

    @SneakyThrows
    private static Thread newState(Statistics s1) {
        var t1 = new Thread(s1::increment);
        printState(1, t1);
        return t1;
    }

    private static Thread runnableState(Thread t) {
        t.start();
        printState(2, t);
        return t;
    }

    @SneakyThrows
    private static void blockedState(Statistics s1) {
        var t1 = new Thread(s1::increment);
        var t2 = new Thread(s1::increment);

        t1.start();
        t2.start();

        TimeUnit.SECONDS.sleep(1);
        printState(3, t2);

        t1.join();
        t2.join();
    }

    @SneakyThrows
    private static void waitingState(Statistics s1) {
        var t1 = new Thread(() -> {
            synchronized (s1) {
                try {
                    s1.wait();
                    printState(4, Thread.currentThread());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                s1.increment();
            }
        });
        var t2 = new Thread(() -> {
            synchronized (s1) {
                s1.increment();
                s1.notifyAll();
            }
        });

        t2.start();
        t1.start();

    }

    @SneakyThrows
    private static void timedWaitingState(Statistics s1) {
        var t = new Thread((s1::increment));
        t.start();
        printState(5, t);
        TimeUnit.SECONDS.sleep(5);
    }

    @SneakyThrows
    private static void terminateState(Thread t1) {
        printState(6, t1);
    }

    private static void printState(int number, Thread t1) {
        System.out.println(number + " - " + t1.getState());
    }
}
