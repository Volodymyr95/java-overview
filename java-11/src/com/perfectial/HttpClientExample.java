package com.perfectial;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientExample {
    public static void main(String[] args) throws IOException, InterruptedException {

        HttpClient httpClient = HttpClient.newBuilder()
                .version(java.net.http.HttpClient.Version.HTTP_2)  // this is the default
                .build();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://http2.github.io/"))
                .GET()   // this is the default
                .build();

        // HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        //   System.out.println("Response status code: " + response.statusCode());

//        httpClient.sendAsync(request, HttpResponse.BodyHandlers.ofString())
//                .thenAccept(response -> {
//                    System.out.println("Body: " + response.statusCode());
//                });


    }
}
