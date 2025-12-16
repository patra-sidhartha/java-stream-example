package com.st.webclient;

import java.util.concurrent.CompletableFuture;

public class MultiAsyncWebClientCombineExample {
	public static void main(String[] args) {
		/*
		WebClient webClient = WebClient.builder()
				.baseUrl("http://localhost:8080").build();

		CompletableFuture<String> future1 = webClient.get()
				.uri("/api/data/resource1").retrieve()
				.bodyToMono(String.class).toFuture();

		CompletableFuture<String> future2 = webClient.get()
				.uri("/api/data/resource2").retrieve()
				.bodyToMono(String.class).toFuture();

		CompletableFuture<String> combinedFuture = future1.thenCombine(future2,
				(res1, res2) -> "Combined Result: " + res1 + " | " + res2);

		combinedFuture.thenAccept(System.out::println).exceptionally(ex -> {
			System.err.println("Error in combined call: " + ex.getMessage());
			return null;
		});

		combinedFuture.join();
		*/
	}
}
