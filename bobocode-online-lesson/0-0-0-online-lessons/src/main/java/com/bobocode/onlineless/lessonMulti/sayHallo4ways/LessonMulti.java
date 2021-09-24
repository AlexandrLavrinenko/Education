package com.bobocode.onlineless.lessonMulti.sayHallo4ways;

import lombok.SneakyThrows;

/**
 * Education
 *
 * @author Alexandr.Lavrinenko@gmail.com
 * @version 1.0
 * @since 24.09.2021
 */
public class LessonMulti {
    @SneakyThrows
    public static void main(String[] args) {
        System.out.println("Hello from " + Thread.currentThread().getName());
        var t = new Thread(() -> {
            System.out.println("Hello from " + Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getName() + " - " + Thread.currentThread().getState());
        });
        System.out.println(t.getName() + " - " + t.getState());
        t.start();
    }
}
