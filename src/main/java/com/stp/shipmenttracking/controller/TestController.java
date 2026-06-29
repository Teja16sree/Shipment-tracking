package com.stp.shipmenttracking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/test")
    public Map<String, Object> test() {
        Map<String, Object> response = new HashMap<>();
        response.put("status", "UP");
        response.put("message", "Shipment Tracking System backend is running successfully!");
        response.put("timestamp", System.currentTimeMillis());
        return response;
    }
}
