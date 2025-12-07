package com.st.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceExample2 {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(5);
		executor.execute(() -> System.out.println("Task1 executed"));
		executor.execute(() -> System.out.println("Task3 executed"));
		
		Callable<String> callable = new Callable<>() {
			@Override
			public String call() throws Exception {
				// TODO Auto-generated method stub
				System.out.println("Callable executed");
				return "Result From Callable";
			}
		};
		
		Future<String> future = executor.submit(callable);
		
		try {
			String result = future.get();
			System.out.println("Result: " + result);
		} catch (InterruptedException| ExecutionException e) {
			e.printStackTrace();
		} finally {
			// Shutdown the executor
			executor.shutdown();
		}
	}
}
