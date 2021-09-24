package com.bobocode.onlineless.lessonMulti.sayHallo4ways;

import java.util.concurrent.*;

/**
 * Print hello form another thread in 4 different ways
 */
public class SayHelloInThread extends RecursiveAction {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // Print hello form another thread in 4 different ways
        // 1. By creating Thread
        // 2. By creating and passing logic to Executor
        // 3. By creating recursive action and passing it to common Fork/Join pool
        // 4. By executing logic via CompletableFuture

        // 1. By creating Thread
        Thread t1 = new Thread(() -> printHello("Thread"));
        t1.start();

        // 2. By creating and passing logic to Executor
        var executor = Executors.newFixedThreadPool(1);
        executor.execute(() -> printHello("Executors"));
        executor.shutdown();

        // 3. By creating recursive action and passing it to common Fork/Join pool
        ForkJoinPool.commonPool().invoke(new SayHelloInThread());

        // 4. By executing logic via CompletableFuture
        Future<String> stringFuture = completableFutureHello();
        String s = stringFuture.get();
        System.out.println(s);

    }


    @Override
    protected void compute() {
        SayHelloInThread.printHello("Fork/Join pool");
    }

    public static Future<String> completableFutureHello(){
        CompletableFuture<String> completableFuture = new CompletableFuture<>();

        Executors.newCachedThreadPool().submit(() -> {
            Thread.sleep(500);
            completableFuture.complete("Hello");
            return null;
        });

        return completableFuture;
    }

    private static void printHello(String method) {
        var str = "Hello";
        System.out.println(method + ": " + str);
    }
}
