package com.st.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceExample {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(2);
		executor.execute(() -> System.out.println("Task1 executed"));
		executor.execute(() -> System.out.println("Task3 executed"));
		
		Future<Integer> future = executor.submit(() -> {
			System.out.println("Task2 Execued");
			return 1+1;
		});
		
		try {
			Integer result = future.get();
			System.out.println("Result: " + result);
		} catch (InterruptedException| ExecutionException e) {
			e.printStackTrace();
		} finally {
			// Shutdown the executor
			executor.shutdown();
		}
	}
}
