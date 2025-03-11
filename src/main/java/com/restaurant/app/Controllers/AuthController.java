package com.restaurant.app.Controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    @PostMapping(value = "login")
    public String login() {
        return "LOGIN";
    }

    @PostMapping(value = "register")
    public String register() {
        return "REGISTER";
    }
}
