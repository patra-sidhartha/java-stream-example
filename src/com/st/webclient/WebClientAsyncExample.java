package com.st.webclient;

//import org.springframework.web.reactive.function.client.WebClient;
//import reactor.core.publisher.Mono;

public class WebClientAsyncExample {

//    public static void main(String[] args) {
//        // Create a WebClient instance
//        WebClient webClient = WebClient.builder()
//                .baseUrl("http://localhost:8080/api") // Replace with your API base URL
//                .build();
//
//        // 1. Making a GET request and handling the response asynchronously
//        System.out.println("Initiating GET request...");
//        Mono<String> responseMono = webClient.get()
//                .uri("/resource/{id}", 1) // Example URI with a path variable
//                .retrieve()
//                .bodyToMono(String.class); // Convert the response body to a Mono of String
//
//        // Subscribe to the Mono to process the response when it arrives
//        responseMono.subscribe(
//                response -> System.out.println("GET Response: " + response),
//                error -> System.err.println("Error during GET request: " + error.getMessage()),
//                () -> System.out.println("GET request completed.")
//        );
//
//        // 2. Making a POST request with a request body and handling the response
//        System.out.println("Initiating POST request...");
//        MyRequestBody requestBody = new MyRequestBody("data1", "data2"); // Your custom request body object
//        Mono<MyResponseObject> postResponseMono = webClient.post()
//                .uri("/create")
//                .bodyValue(requestBody) // Set the request body
//                .retrieve()
//                .bodyToMono(MyResponseObject.class); // Convert the response body to a Mono of MyResponseObject
//
//        postResponseMono.subscribe(
//                response -> System.out.println("POST Response: " + response.getMessage()),
//                error -> System.err.println("Error during POST request: " + error.getMessage()),
//                () -> System.out.println("POST request completed.")
//        );
//
//        // Keep the main thread alive to allow asynchronous operations to complete
//        try {
//            Thread.sleep(5000); // Wait for a few seconds to see the async responses
//        } catch (InterruptedException e) {
//            Thread.currentThread().interrupt();
//        }
//    }
//
//    // Example classes for request and response bodies
//    static class MyRequestBody {
//        private String field1;
//        private String field2;
//
//        public MyRequestBody(String field1, String field2) {
//            this.field1 = field1;
//            this.field2 = field2;
//        }
//
//        // Getters and setters
//        public String getField1() { return field1; }
//        public void setField1(String field1) { this.field1 = field1; }
//        public String getField2() { return field2; }
//        public void setField2(String field2) { this.field2 = field2; }
//    }
//
//    static class MyResponseObject {
//        private String message;
//
//        public MyResponseObject() {} // Default constructor for deserialization
//
//        public String getMessage() { return message; }
//        public void setMessage(String message) { this.message = message; }
//    }
}