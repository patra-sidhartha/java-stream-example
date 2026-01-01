package com.st.future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompleteableFutureTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> 4 + 5);
//        System.out.println(future.isCancelled());
//        System.out.println(future.get());
//        System.out.println(future.isDone());
//        System.out.println(future.join());

//        CompletableFuture<String> async = CompletableFuture.supplyAsync(() -> {
//            try {
//                Thread.sleep(1000);
//                return "From Async";
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
////                return "From Interrupted";
//            }
//        });
//
//        System.out.println(async.isDone());
////        System.out.println(async.cancel(true));
//        Thread.interrupted();
//        System.out.println(async.join());
////        System.out.println(async.isDone());

        CompletableFuture<String> stringCompletableFuture = CompletableFuture.supplyAsync(() -> "Hello")
                .thenApply(s -> "Hi " + s)
                .thenApplyAsync(s -> "Hey " + s);
        System.out.println(stringCompletableFuture.join());

        CompletableFuture.supplyAsync(() -> "Hello")
                .exceptionally(x -> {
                    x.printStackTrace();
                    return  "abc";
                })
                .get();
    }
}
