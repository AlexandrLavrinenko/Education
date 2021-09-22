package com.bobocode.onlineless.lessonMulti;

import lombok.SneakyThrows;

import java.util.concurrent.TimeUnit;

/**
 * java-fundamentals-course
 *
 * @author Alexandr.Lavrinenko@gmail.com
 * @version 1.0
 * @since 17.09.2021
 */
public class Statistics {
    private int count;

    @SneakyThrows
    synchronized public void increment(){
        count++;
        TimeUnit.SECONDS.sleep(10);
    }

    public int getCount() {
        return count;
    }
}
