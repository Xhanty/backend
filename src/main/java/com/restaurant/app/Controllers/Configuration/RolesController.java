package com.restaurant.app.Controllers.Configuration;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/configuration")
@RequiredArgsConstructor
public class RolesController {

    @GetMapping(value = "roles")
    public String roles() {
        return "Listado de roles";
    }
}
