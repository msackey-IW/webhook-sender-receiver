package com.example.sender.controller;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
public class WebhookController {

    private WebClient webClient;
    
    public WebhookController(WebClient.Builder wBuilder){
        this.webClient = wBuilder.baseUrl("http://localhost:8081").build();
    }

    @PostMapping("/send-webhook")
    public Mono<String> sendWebhook() {
        return this.webClient.post()
                .uri("/webhook")
                .contentType(MediaType.APPLICATION_JSON)
                .bodyValue("{\"message\": \"Hello from the webhook sender!\"}")
                .retrieve()
                .bodyToMono(String.class)
                .doOnSuccess(response -> System.out.println("Webhook sent successfully: " + response))
                .doOnError(error -> System.out.println("Error sending webhook: " + error.getMessage()));
    }
}
