package com.francode.auth.business.auth;


import com.francode.auth.presentation.dto.User.JwtResponse;
import com.francode.auth.presentation.dto.User.LoginRequest;
import com.francode.auth.presentation.dto.User.SignupRequest;

public interface AuthService {
    boolean existsByEmail(String email);
    void registerUser(SignupRequest signUpRequest);
    JwtResponse authenticateUser(LoginRequest loginRequest);
}
