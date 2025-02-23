package org.mbarek0.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController

@RequestMapping("/orders")
public class OrderController {


    private final RestTemplate restTemplate;

    @Autowired
    public OrderController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/{userId}")
    public ResponseEntity<String> getOrderDetails(@PathVariable String userId) {
        // Fetch user details from User Service
//        String userDetails = restTemplate.getForObject(
//                "http://localhost:8083/users/{userId}", String.class, userId);

        return ResponseEntity.ok("Order details for user: " + "ee");
    }
}