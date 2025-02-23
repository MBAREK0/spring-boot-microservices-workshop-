package org.mbarek0.userservice.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "order-service", url = "http://localhost:8082")
public interface OrderServiceClient {
    @GetMapping("/orders/{userId}")
    public ResponseEntity<String> getOrderDetails(@PathVariable String userId);
}

