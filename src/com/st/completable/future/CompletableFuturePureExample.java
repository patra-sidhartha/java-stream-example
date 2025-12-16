package com.st.completable.future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CompletableFuturePureExample {

	public static void main(String[] args) {
		System.out.println("Main thread started. Kicking off asynchronous task...");

		// 1. Create a CompletableFuture with supplyAsync() to run a task in the
		// background
		CompletableFuture<String> nameFuture = CompletableFuture.supplyAsync(() -> {
			try {
				// Simulate a long-running operation (e.g., a network call)
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				throw new IllegalStateException(e);
			}
			System.out.println("Async task completed. Returning name.");
			return "Alice"; // The result of the asynchronous computation
		});

		// 2. Attach a callback using thenApply() to process the result when it's ready
		CompletableFuture<String> greetingFuture = nameFuture.thenApply(name -> {
			System.out.println("Processing name in callback...");
			return "Hello, " + name + "!"; // Transform the result
		});

		// 3. Attach a callback using thenAccept() to consume the final result (returns
		// void)
		CompletableFuture<Void> finalStage = greetingFuture.thenAccept(greeting -> {
			System.out.println("Final result consumed: " + greeting);
		});

		System.out.println("Main thread continues to run other tasks while waiting...");

		// Block the main thread to wait for the entire pipeline to complete
		try {
			finalStage.get(); // Waits for all preceding CompletableFutures to finish
			// Alternatively, use join() which is similar but throws unchecked exceptions
			// finalStage.join();
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}

		System.out.println("Main thread finished.");
	}
}
