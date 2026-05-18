package com.fawad.shop.serviceInterface;

import com.fawad.shop.dto.request.LoginRequest;
import com.fawad.shop.dto.request.RegisterRequest;
import com.fawad.shop.dto.response.AuthResponse;

public interface AuthService {

    AuthResponse register(RegisterRequest request);

    AuthResponse login(LoginRequest request);
}