package com.st.completable.future;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {
	private final HttpClient client = HttpClient.newHttpClient();
	
	public void callGetAndPostAsync() {
		// GET request
		HttpRequest getRequest = HttpRequest.newBuilder()
				.uri(URI.create("https://ur1.com/get"))
				.GET()
				.build();
		// POST request
		HttpRequest postRequest = HttpRequest.newBuilder()
				.uri(URI.create("https://ur2.com/post"))
				.header("Content-Type", "application/json")
				.POST(HttpRequest.BodyPublishers.ofString("{\"key\" : \"value\"}"))
				.build();
		
		CompletableFuture<HttpResponse<String>> getFuture = client
				.sendAsync(getRequest, HttpResponse.BodyHandlers.ofString());
		
		CompletableFuture<HttpResponse<String>> postFuture = client
				.sendAsync(postRequest, HttpResponse.BodyHandlers.ofString());
		
		CompletableFuture.allOf(getFuture, postFuture)
			.thenRun(() -> {
				try {
					System.out.println("Get Response: " + getFuture.get().body());
					System.out.println("Post Response: " + postFuture.get().body());
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
				}
			});
	}

}
