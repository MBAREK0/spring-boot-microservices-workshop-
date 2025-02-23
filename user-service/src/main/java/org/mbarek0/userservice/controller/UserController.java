package org.mbarek0.userservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    private final OrderServiceClient orderServiceClient;

    public UserController(OrderServiceClient orderServiceClient) {
        this.orderServiceClient = orderServiceClient;
    }

    @GetMapping("/{userId}")
    public ResponseEntity<String> getUserDetails(@PathVariable String userId) {

        String userDetails = "User " + userId + " details";
        String order =   orderServiceClient.getOrderDetails(userId).getBody();
        return ResponseEntity.ok(userDetails + "\n" + order);
    }
}