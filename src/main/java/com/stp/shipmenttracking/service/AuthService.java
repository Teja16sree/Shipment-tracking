package com.stp.shipmenttracking.service;

import com.stp.shipmenttracking.dto.AuthResponse;
import com.stp.shipmenttracking.dto.LoginRequest;
import com.stp.shipmenttracking.dto.RegisterRequest;

public interface AuthService {

    /**
     * Register a new user
     */
    String register(RegisterRequest request);

    /**
     * Authenticate user and return JWT token
     */
    AuthResponse login(LoginRequest request);
}