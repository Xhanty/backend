package com.restaurant.app.controller;

import com.restaurant.app.entity.User;
import com.restaurant.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping(path = "/register")
    @ResponseBody
    public Long register(@RequestBody User user) {
        return userService.registerUser(user);
    }
}
