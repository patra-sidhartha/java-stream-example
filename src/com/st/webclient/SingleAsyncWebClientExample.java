package com.st.webclient;

import java.util.concurrent.CompletableFuture;

public class SingleAsyncWebClientExample {
	public static void main(String[] args) {
		WebClient webClient = WebClient.builder()
				.baseUrl("http://localhost:8080")
				.build();

		CompletableFuture<String> futureResult = webClient.get()
				.uri("/api/data/single")
				.retrieve()
				.bodyToMono(String.class)
				.toFuture(); // Converts Mono to CompletableFuture

		futureResult.thenAccept(result -> System.out.println("Single Result: " + result)).exceptionally(ex -> {
			System.err.println("Error in single call: " + ex.getMessage());
			return null;
		});

		// Block to ensure the main thread waits for the async operation
		futureResult.join();
	}
}
