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



    @GetMapping("/{userId}")
    public ResponseEntity<String> getOrderDetails(@PathVariable String userId) {

        return ResponseEntity.ok("Order details for user: " + userId);
    }
}