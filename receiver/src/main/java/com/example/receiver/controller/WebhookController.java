package com.example.receiver.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebhookController {

    @PostMapping("/webhook")
    public String receiveWebhook(@RequestBody String body) {
    System.out.println("Received webhook: " + body);
    return "{\"message\": \"Webhook received and processed.\"}";
    }
}

