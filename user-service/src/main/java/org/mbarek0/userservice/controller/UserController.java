package org.mbarek0.userservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/{userId}")
    public ResponseEntity<String> getUserDetails(@PathVariable String userId) {
        // Simulate fetching user details
        String userDetails = "User " + userId + " details";
        return ResponseEntity.ok(userDetails);
    }
}