package carmanagementservice.controller;

import carmanagementservice.dto.AuthRequest;
import carmanagementservice.dto.AuthResponse;
import carmanagementservice.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public AuthResponse login(@RequestBody AuthRequest request) {
        return authService.login(request);  // Return type should be AuthResponse
    }

    @PostMapping("/register")
    public AuthResponse register(@RequestBody AuthRequest request) {
        return authService.register(request);  // Return type should be AuthResponse
    }
}
